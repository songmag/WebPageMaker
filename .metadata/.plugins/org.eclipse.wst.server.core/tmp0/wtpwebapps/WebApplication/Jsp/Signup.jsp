<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/WebApplication/css/signup.css"> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form method = "post" action ="../BridgeServlet?requestPage=SignupServlet">
<table id = "signup" class="table">
<tr><th colspan ="2"> 
<h2>회 원 가 입</h2></th></tr>
<tr>
<td> ID </td><td><input type = "text" id = "id" name="id" autocomplete=off></td>
<tr>
<td> PW  </td><td ><input type = "password" name="pw" autocomplete=off></td>
</tr>
<tr>
<td> Name  </td><td><input type = "text" name="name" autocomplete=off></td>
<tr>
<td> Major </td><td><input type ="text" name ="major" autocomplete=off></td> 
<tr>
<td colspan = "2"> 자기소개 </td>
</tr>
<tr> <td colspan="2"> <textarea rows="7" cols="50" name="identity" autocomplete=off></textarea> </td>
</tr>
<tr>
<td> 메뉴 1 </td><td><input type="text" name ="menulist" class ="menulist" autocomplete=off></td>
</tr>
</table>
<input type ="button" onclick ="addinput()" value="add menu" class="btn btn-success">
<input type="submit" value="회원가입"  class = "btn btn-success">
</form>
</body>
<script type="text/javascript" src="/WebApplication/js/methodset.js"></script>
<script type="text/javascript" src="/WebApplication/js/popup.js"></script>
</html>