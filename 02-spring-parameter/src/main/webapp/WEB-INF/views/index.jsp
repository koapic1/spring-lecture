<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Spring</h1>
	<!-- <img src="images/layout/spring_logo.png"> -->
	<ul>
		<li><a href="Parameter01.do?data01=10&data02=20&data03=30&data03=40">parameter01-query-string으로 데이터 보내보기</a></li>
		<li><a href="Parameter02.do?data01=10&data02=20&data03=30&data03=40">parameter02-query-string으로 데이터 보내보기</a></li>
		<li><a href="Parameter03.do?data01=10&data02=20&data03=30&data03=40">parameter03-query-string으로 데이터 보내보기</a></li>
		<li><a href="parameter/10/20/30">parameter06-rest 로 데이터 보내보기</a></li>
	</ul>
	
	<form action="Parameter04.do" method="get">
	<legend>Parameter04</legend>
		<div><label><span>data01</span><input type="text" name="data01"></label></div>
		<div><label><span>data02</span><input type="text" name="data02"></label></div>
		<div>
			<label><span>data03-30</span><input type="checkbox" name="data03" value="30"></label>
			<label><span>data03-40</span><input type="checkbox" name="data03" value="40"></label>
		</div>
		<button>Parameter04.do 로 전송</button>
	</form>
	<hr>
	<form action="Parameter05.do" method="get">
	<legend>Parameter05</legend>
		<div><label><span>data01</span><input type="text" name="data01"></label></div>
		<div><label><span>data02</span><input type="text" name="data02"></label></div>
		<div>
			<label><span>data03-30</span><input type="checkbox" name="data03" value="30"></label>
			<label><span>data03-40</span><input type="checkbox" name="data03" value="40"></label>
		</div>
		<button>Parameter05.do 로 전송</button>
	</form>
</body>
</html>