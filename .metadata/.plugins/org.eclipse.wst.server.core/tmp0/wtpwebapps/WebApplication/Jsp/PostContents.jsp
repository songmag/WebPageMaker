<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
		<td>${response_post.postName}</td>
		<td>${response_post.permission}</td>
		<td>${response_post.when}</td>
		</tr>
		<tr>
		<td colspan="3">
			<p>
				${response_post.postContents}
			</p>
		</td>
		</tr>
		<tr>
		<td>
			
		</td>
		<c:foreach items ="${comments}" var ="comment">
			<tr><td><p>${comment}</p></td></tr>
		</c:foreach>
	</table>
</body>
</html>