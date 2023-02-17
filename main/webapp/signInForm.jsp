<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<mate name="viewport" content"width=device-width, initial-scale=1">
<link rel="stlesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">

<title>SIGN IN</title>
<script>
	function CheckPassword() {
		var passObj = document.signInForm.password;
		var passCheckObj = document.signInForm.password_Check;

		if (passObj.value !== passCheckObj.value) {
			alert("비밀번호를 확인하세요.")

			passObj.value = "";
			passCheckObj.value = "";

			return false;
		}
		//아이디 중복체크 여부 확인
		var flagObj = document.signInForm.flag;
		var flagid = document.signInForm.Id;

		if (flagObj.value !== flagid.value) {
			alert("아이디 사용 여부를 확인해 주세요.");

			return false;
		}
	}
	function CheckId() {
		var id = document.signInForm.id.value;
		if (id == "") {
			alert("아이디를 입력해 주세요");
		} else {
			var path = "front?command=idcheck&id" + id;
			window.open(path, "idpoput",
					"width=450, height=250, top=150, left=200");
		}
	}
</script>
</head>
<body>
	<jsp:include page="nav.jsp" />
	<section style="padding: 40px">
		<center>
			<div class="form-group">
				<label class="form-label mt-4"><h3>관리자 등록</h3></label>
				<form action="front" method="post" name="signInForm"
					onsubmit="return CheckPassword()">

					<input type="hidden" value="signin" name="command"><br>
					<input type="hidden" value="" name="flag">

					<div class="form-floating mb-3">
						<div class="col-sm-3">
							<input type="text" class="form-control" name="id"
								required="required" placeholder="id"> <input
								type="button" value="중복확인" class="btn btn-danger"
								onclick="CheckId()">
							<%--체크 아이디 확인 / 버튼 옆으로 확인--%>
						</div>
					</div>
					<section style="padding: 10px">
						<div class="form-floating mb-3">
							<div class="col-sm-3">
								<input type="password" class="form-control" name="password"
									required="required" placeholder="password">
							</div>
							<div class="col-sm-8"></div>
							<section style="padding: 10px">
								<div class="form-floating mb-3">
									<div class="col-sm-3">
										<input type="password" class="form-control"
											name="password_Check" required="required"
											placeholder="checked your password">
									</div>
									<div class="col-sm-8"></div>
									<section style="padding: 10px">
										<div class="form-floating mb-3">
											<div class="col-sm-3">
												<input type="text" class="form-control" name="name"
													required="required" placeholder="name">
											</div>
											<div class="col-sm-8"></div>
											<section style="padding: 10px">
												<div class="form-floating mb-3">
													<div class="col-sm-3">
														<input type="password" class="form-control" name="no"
															required="required" placeholder="직원번호를 입력해 주세요.">
													</div>
													<div class="col-sm-8"></div>
													<section style="padding: 10px">
														<div class="d-grid gap-2">
															<input type="submit" value="등록" class="btn btn-danger">
														</div>
				</form>
				<%--<jsp:include page="footer.jsp" /> --%>
</body>
</html>