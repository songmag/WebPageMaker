<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="carousel slide" data-ride="carousel">
	<div class="container carousel-inner">
	<c:forEach var="img_src" items="${img}" varStatus="status">
		<c:if test="${status.index eq 0}">
			<div class="carousel-item active">
				<img src="${img_src}" width="1200" height="200">
			</div>
		</c:if>
		<c:if test="${status.index ne 0}">
			<div class="carousel-item">
				<img src="${img_src}" width="1200" height="200">
			</div>
			</c:if>
		</c:forEach>
	</div>
</div>