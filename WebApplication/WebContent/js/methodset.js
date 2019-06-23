function addinput(){
	var tb = document.getElementById('signup');
	var tr = tb.appendChild(document.createElement('tr'));
	var td = tr.appendChild(document.createElement('td'));
	var number= tb.getElementsByClassName('menulist').length+1;
	var text = document.createTextNode('메뉴 '+number);
	td.appendChild(text);
	var td = tr.appendChild(document.createElement('td'));
	var input = document.createElement('input');
	input.setAttribute('class','menulist');
	input.setAttribute('name','menulist');
	td.appendChild(input);
}
function setPost()
{
	var p_list = $('#maincontent');
	var p_in = $('#postin');
	p_list.css('display',"none");
	p_in.css('display',"inline-block");
}
function setList()
{
	var p_list = $('#maincontent')
	var p_in =$('#postin');
	p_list.css('display',"inline-block");
	p_in.css('display',"none");
}