<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session" type="VO.UserVO"></jsp:useBean>
<table class="table" id ="login_table">
<tr>
<td> 아이디 </td>
<td><jsp:getProperty property="id" name="user"/></td> 
</tr>
<tr>
<td> 전공 </td>
<td><jsp:getProperty name="user" property="major"/></td>
</tr>
<tr>
<td>
<a href="/WebApplication/BridgeServlet?requestPage=InfoChangeServlet"><input type="button" class ="btn btn-warning" value = "정보수정" style="font-size:10px;"></a>
</td>
<td>
<a href="/WebApplication/BridgeServlet?requestPage=PostInServlet"><input type="button" class ="btn btn-warning" value = "게시글 작성" style="font-size:10px;" onclick="setPost()"></a>
</td>
</tr>
</table>