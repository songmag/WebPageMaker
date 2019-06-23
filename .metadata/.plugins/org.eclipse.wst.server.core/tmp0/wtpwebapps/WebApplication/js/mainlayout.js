function tablesize(){
	var width = $(document).width();
	var height = $(document).height();
	var elem = [
			$('#maincontent table tbody tr td:nth-child(3)'),
			$('#maincontent table tbody tr th:nth-child(3)')
	];
	for(var i = 0 ; i<2;i++)
	{
		elem[i].css("width",width*0.4);
	}	
	$('#contentset').css("height",height);
}
function layout(){
	var bottom = $('.navi').height()+ 50;
	$('.submenu').css("top",bottom);
}
tablesize();
layout();