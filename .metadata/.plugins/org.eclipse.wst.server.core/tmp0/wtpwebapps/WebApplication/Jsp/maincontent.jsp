
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class = "table table-striped table-hover" >
	<tr>
	<th>NO</th>
	<th>ID</th>
	<th>Content Name</th>
	<th>Whence</th>
	<th>Permission</th>
	</tr>
	<c:forEach var="post" items="${sessionScope.currentMenu}"> 
	<tr>
	<td>${post.number }</td>
	<td>${post.name }</td>
	<td>${post.content }</td>
	<td>${post.permission }</td>
	<td>${post.when }</td>
	</tr>
	</c:forEach>
</table>