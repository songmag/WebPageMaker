function popup()
{	
	var url = "Signup.jsp";
	var name = "회 원 가 입";
	window.open(url,name,"width=550,height=700, toolbar=no,status=no,location=no,scrollbars=yes,menubar=no,resizable=yes,left=50,right=50");
}
function popupclose()
{
	var elem = document.getElementById("fsignup");
	elem.submit();
}
function quickup()
{
	var elem = document.getElementById("submenutoolbar");
	var img = document.getElementById("quick_btn");
	img.style.display = "none";
	elem.style.display = "inline-block";
}
function quickout()
{
	var elem = document.getElementById("submenutoolbar");
	var img = document.getElementById("quick_btn");
	img.style.display = "inline-block";
	elem.style.display = "none";
}
