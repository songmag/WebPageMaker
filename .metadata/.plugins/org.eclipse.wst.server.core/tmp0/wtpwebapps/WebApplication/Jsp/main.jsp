<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome Profile Maker</title>
</head>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>
	#image_list, #sign_in{ 
		position:fixed;
	}
	#sign_in{
		z-index: 2;
		padding :40px;
	}
</style>
<body>
	<div id="background">
		<div id="sign_in">
			<jsp:include page="loginmodule.jsp"></jsp:include>
		</div>
		<img id="image_list" src = "../img/Main2.jpg">
	</div>
</body>
<script type = "text/javascript" src ="../js/maininterval.js"></script>
<script type = "text/javascript" src ="../js/popup.js"></script>
</html>