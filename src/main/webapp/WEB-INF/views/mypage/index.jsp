<%@page import="javax.persistence.metamodel.SetAttribute"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setAttribute("row0", "./mainav.jsp");
	request.setAttribute("row1", "./header.jsp");
	request.setAttribute("row2", "./breadcrumb.jsp");
	request.setAttribute("row3", "./sidebar.jsp");
	request.setAttribute("row4", "./footer.jsp");
	request.setAttribute("row5", "./copyright.jsp");
%>
<jsp:forward page="./template.jsp" />