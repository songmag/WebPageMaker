<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/divsetter.css">
<link rel="stylesheet" type="text/css" href="css/liststyle.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<!--상대경로가 아닌 절대경로로 표기해야한다.-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>${sessionScope.user.name}의 Homepage</title>
</head>
<body>
	<jsp:include page="Banner.jsp"></jsp:include>
	<div id="contentset" class="set auto-margin">
		<div id="menutoolbar" class="abs header">
			<jsp:include page="menulist.jsp"></jsp:include>
		</div>
		<div id="logindiv" class="abs navi">
			<jsp:include page="loginmodule.jsp"></jsp:include>
		</div>
		<div id="maincontent" class="abs content">
			<jsp:include page="${requestScope.jsp}"></jsp:include>
		</div>
	</div>
<body>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	<script type="text/javascript" src="js/mainlayout.js"></script>
	<script type="text/javascript" src="js/methodset.js"></script>
	<script type="text/javascript" src="js/postin.js"></script>
</html>