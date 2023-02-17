<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>MOLTIMOLTI</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="home.jsp">MOLTIMOLTI admin</a>
		
		<ul class="nav navbar-nav">
		</ul>
		<ul class="nav navbar-nav navbar-dark">
			<%
			HttpSession session = request.getSession(false);
			if (session != null && session.getAttribute("dto") != null) {
			%>
			<li><a href="iteminto.jsp"><span
					class="glyphicon glyphicon-user"></span>상품관리</a></li>
			<!--  드롭다운 
				* 상품등록
				* 상품 조회
				 -->
			<li><a href="mypage.jsp"><span
					class="glyphicon glyphicon-user"></span>myPage</a>
			<li><a href="front?command=logput"><span
					class="glyphicon glyphicon-user"></span>LOGOUT</a></li>
			<%
			} else {
			%>
			<li class="nav-item"><a class="nav-link" href="loginForm.jsp">LOGIN</a></li>
			<li class="nav-item"><a class="nav-link" href="signInForm.jsp">SIGN IN</a></li>
			<%
			}
			%>
			</div>
		</ul>
	</nav>
	</mate>
</head>
</html>

