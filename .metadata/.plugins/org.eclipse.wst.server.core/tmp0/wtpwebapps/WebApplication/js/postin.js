
var d_width = $('#contentset').width();
var d_height = $('#contentset').height();
setSize();
function makefile() {
	var list = $('#list_file input');
	if (list.length >= 2) {
		$.each(list, function(index, item) {
			if ($(item).val() == "") {
				$(item).remove();
				return;
			}
		})
		append_input_file();
	} else {
		append_input_file();
		return;
	}
}
function append_input_file() {
	var file_input = $("<input>").css("display", "block").attr("class", "btn")
			.attr("type", "file").attr("name", "file_list").attr("onchange",
					"makefile()");
	$('#list_file').append(file_input);
}
onload = function(){ 
	setInterval(function() {
		if (d_width != $('#contentset').width() & d_height != $('#contentset').height()) {
			setSize();
			return;
		}
		else{
			return;
		}
	}, 500);
}
function setSize() {
	var area = $('#id_textarea');
	$('#post_name').css("width", d_width-300);
	area.css("width", d_width-300);
	area.css("height", d_height-300);
	var ps = $('#id_password');
	ps.css("width", d_width-300);
	var submitdiv = $('#submitdiv').css("margin-left", $(area).width() - 100);
	d_width = $('#contentset').width();
	d_height  = $('#contentset').height();
}
function pschange() {
	var ps = $('.ps');
	if (ps.css("display") == "block") {
		ps.css("display", "none");
	} else {
		ps.css("display", "block");
	}
}