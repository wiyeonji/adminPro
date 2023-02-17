<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<mate name="viewport" content"width=device-width, initial-scale=1">
<link rel="stlesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<title>WELCOME</title>
<style type="text/css">
.content {
	height: 400px;
}

footer {
	background-color: black;
	color: white;
	padding: 15 px;
}
</style>
</head>
<body>
	<jsp:include page="nav.jsp" />
	<div class="content">
		<h3>
			총 회원수:<%=request.getAttribute("count")%>명
		</h3>
	</div>

</body>
</html>