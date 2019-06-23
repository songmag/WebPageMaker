<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<style>
.ps {
	display: none;
}
input{
	margin-top :10px;
}
</style>
<form method="post" action="Servletpost" class="md-form">
	<div class="form-group">
		<label for="post_name">제목</label> <input type="text" id="post_name"
			name="post_name" class="form-control"> <label for="open">Permission</label>
		<input type="radio" id="open" name="Permission" checked="true" onchange="pschange()"><label for="open">open</label> <input
			type="radio" name="Permission" onchange="pschange()"> <label
			for="close">close</label> <label for="id_password" class="ps">password</label>
		<input type="password" class="ps" name="post_password" id="id_password">
		<div id="list_file">
			<input type="file" class="btn" id="firstfile" onchange="makefile()">
		</div>
		<div class="form-group">
			<textarea id="id_textarea" name="post_value" scroll="true"
				style="resize : none;" class="form-control"></textarea>
		</div>
		<div id="submitdiv">
			<input type="button" value="제출" class="btn btn-warning">
		</div>
	</div>
</form>
	
