<form method="post">
	<div class="container">
		<label target="id">ID</label>
		<input name="id" id="id" value="<%=session.getAttribute("s_id")%>">
		<label target="pw">PW </label>
		<input type="password" name="password" id="pw">
		<label target="major">Major</label>
		<input type="text" name="major" id="major" value="<%=session.getAttribute("s_major")%>">
		<label target="identity">Identity</label>
		<textarea cols="50" row="50" scroll="true" style="resize:none;"><%=session.getAttribute("s_identity") %></textarea>
	</div>
</form>