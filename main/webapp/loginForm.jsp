<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<mate name="viewport" content"width=device-width, initial-scale=1">
<link rel="stlesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<title>LOGIN</title>
</head>
<body>
	<jsp:include page="nav.jsp" />
	<section style="padding: 40px">
		<center>
				<div class="form-group">
					<label class="form-label mt-4"><h3>관리자 로그인</h3></label>
					</div>
	<form class="form-horizontal" action="front" method="post">
		<input type="hidden" name="command" value="LOGIN">
		<div class="form-floating mb-3">
			<div class="col-sm-3">
				<input type="text" class="form-control" name="id"
					required="required" placeholder="id">
			</div>
			<section style="padding: 10px">
			<div class="form-floating mb-3">
				<div class="col-sm-3">
					<input type="password" class="form-control" name="password"
						required="required" placeholder="password">
						<section style="padding: 10px">
					<button type="submit" class="btn btn-danger">로그인</button>
				</div>
			</div>
	</form>
	<jsp:include page="footer.jsp" />
</body>
</html>