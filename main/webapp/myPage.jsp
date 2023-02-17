<%@page import="model.adminDTO"%>
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
	<%
	HttpSession session = request.getSession(false);
	if (session != null && session.getAttribute("dto") != null) {
		adminDTO dto = (adminDTO) session.getAttribute("dto");
	%>

	<div class="content">
		<div class="container">
			<h3>my page</h3>
			<ul class="list-group">
				<li class\="list-group-item"><strong>ID </strong><%=dto.getId()%></li>
				<li class="list-group-item"><strong>PASSWORD </strong><%=dto.getPassword()%></li>
				<li class="list-group-item"><strong>NAME </strong><%=dto.getName()%></li>
				<li class="list-group-item"><strong>NO </strong><%=dto.getNo()%></li>
			</ul>
		</div>
		<%
		}
		%>
	</div>

</body>
</html>