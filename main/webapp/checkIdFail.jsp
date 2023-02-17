<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용 불가 아이디</title>
<script type="text/javascript">

	function closePopup() {
		
		
		var idObj = opener.signInForm.id;
		
		var flagObj = opener.signInForm.flag;
		
		
		idObj.value = "";
		flagObj.value = "";
		idObj.focus();
		
		
		self.close();
	}

</script>
</head>
<body bgcolor="lime" onunload="closePopup()">
	<%=request.getParameter("id") %>는 사용 가능이 불가한 아이디입니다.
	<br><br><br>
	<input type="button" value="확인" onclick="closePopup()">
</body>
</html>