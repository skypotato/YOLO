<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring"	uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt"		uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"		uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c"		uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Yolo</title>
<meta charset="utf-8">
<link href="${ pageContext.request.contextPath }/css/layout.css" rel="stylesheet" type="text/css" media="all">
<link href="${ pageContext.request.contextPath }/css/yolo.css" rel="stylesheet" type="text/css">


<script type="text/javascript" src="${ pageContext.request.contextPath }/se2/js/service/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/board/boardWrite.js"></script>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery.form.min.js"></script>

<script type="text/javascript">
		$(document).ready(function() {
			var oEditors = [];
			nhn.husky.EZCreator.createInIFrame({
			    oAppRef: oEditors,
			    elPlaceHolder: "board",
			    sSkinURI: "${ pageContext.request.contextPath }/se2/SmartEditor2Skin.html",
			    fCreator: "createSEditor2"
			});
		})
</script>
		
</head>

<!-- 헤더 -->
<%@ include file="/WEB-INF/views/include/top.jsp" %>

<div class="wrapper row3 board">
  <main id="container" class="clear">

    <!-- container body -->
    <%@ include file="sidebar.jsp" %>

    <div id="content" class="three_quarter">
      <div style="margin:0 0 20px 0">
      <span style="float:left; width:5%">제목</span>
      <input type="text" style="width:95%"/>
      
      <div style="margin-top:15px;">
      	<textarea name="board" id="board" style="width:95%; height:600px"></textarea>
      </div>
      
      </div>
     </div>
    <!-- / container body -->
    <div class="clear"></div>
  </main>
</div>

</body>
</html>
