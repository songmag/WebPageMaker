var image_date = ['../img/Main1.jpg','../img/Main2.jpg','../img/Main3.jpg'];
var num = 0;
var elem = $('#image_list');
var width = $(window).width();
var height = $(window).height();
checksize();
window.onload = function() {
	setInterval(
			function()
			{
				elem.fadeOut(function(){
					var elem = $('#image_list');
					elem.attr("src",image_date[num++]);
					elem.fadeIn();
					if(num == 3)
						num = 0;
				});
	},3000);
}

function checksize()
{
	if(typeof(Worker) !== 'undefined')
	{
		if(typeof(w) == 'undefined')
		{
			w = new Worker("../js/sizework.js");
		}
		w.onmessage = function(event){
			$('body').width($('html').width());
			$('body').height($(window).height());
			elem.css("width",$('html').width());
			elem.css("height",$(window).height());
			$('#sign_in').css("left",$('html').width()*0.3);
			$('#sign_in').css("top",$(window).height()*0.3);
			elem.css("width",$('html').width());
			elem.css("height",$(window).height());
			width = $('html').width();
			height = $(window).height();
		}
	}
	else
	{
		$('body').width($(document).width());
		$('body').height($(document).height());
		elem.css("width",$('html').width());
		elem.css("height",$(document).height());
		$('#sign_in').css("left",$('html').width()*0.3);
		$('#sign_in').css("top",$('html').height()*0.3);
		elem.css("width",$('html').width());
		elem.css("height",$('html').height());
		width = $('html').width();
		height = $('html').height();
	}
}

