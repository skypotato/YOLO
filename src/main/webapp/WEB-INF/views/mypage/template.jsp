<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String row0 = (String) request.getAttribute("row0");
	String row1 = (String) request.getAttribute("row1");
	String row2 = (String) request.getAttribute("row2");
	String row3 = (String) request.getAttribute("row3");
	String row4 = (String) request.getAttribute("row4");
	String row5 = (String) request.getAttribute("row5");
%>
<!DOCTYPE html>
<html>
<head>
<title>MYPAGE</title>
<meta charset="utf-8">
<link href="../css/layout.css" rel="stylesheet" type="text/css"
	media="all">
</head>
<body id="top">
	<div class="wrapper row0">
		<jsp:include page="<%=row0%>" />
	</div>
	<div class="wrapper row1">
		<jsp:include page="<%=row1%>" />
	</div>
	<div class="wrapper row2">
		<jsp:include page="<%=row2%>" />
	</div>
	<div class="wrapper row3">
		<jsp:include page="<%=row3%>" />
	</div>
	<div class="wrapper row4">
		<jsp:include page="<%=row4%>" />
	</div>
	<div class="wrapper row5">
		<jsp:include page="<%=row5%>" />
	</div>
</body>
</html>