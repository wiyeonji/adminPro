<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복 확인</title>
<script type="text/javascript">
function closePopup(){
	
	var of = window.opener.signInForm;
	
	of.flag.value = "<%=request.getParameter("id")%>";
	
	of.password.focus();
	
	self.close();
}
</script>
</head>
<body>
<%=request.getParameter("id") %>는 사용 가능한 아이디입니다.
<input type="button" value="확인" onClick= "closePopup()">

</body>
</html>