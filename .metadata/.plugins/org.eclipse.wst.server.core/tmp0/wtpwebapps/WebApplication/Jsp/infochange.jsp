<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<body>
	<form method="post" action="BridgeServlet?requestPage=InfoChangeService">	
	<div class="form-group col">
	<label for="id_box" class="col-form-label">Id</label>
	<div class="col-sm-10">
	<input class ="form-control-plaintext"type="text" id="id_box" readonly value="${user.id}">
	</div>
	</div>
	<div class="form-group col">
	<label for="pw_box"  class="col-form-label">PW</label>
	<div class="col-sm-15">
	<input  class="form-control" type="password" id="pw_box" value="${user.pw}">
	</div>
	</div>
	<div class="form-group col">
	<label for="address_box"  class="col-form-label">Addr</label>
	<div class="col-sm-15">
	<input class="form-control" type="text" id="address_box" value="${user.address}">
	</div>
	</div>
	<div class="form-group col">
	<label for="identity_box"  class="row-form-label">Identity</label>
	<div class="row-sm-15">
	<textarea class="form-control-row" cols="40" rows="10" id="identity_box">${user.introduction}</textarea>
	</div>
	</div>
	<input type="submit">	
	</form>
</body>