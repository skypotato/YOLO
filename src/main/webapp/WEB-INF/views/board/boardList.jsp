<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring"	uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt"		uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"		uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c"		uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Yolo</title>

<link href="${ pageContext.request.contextPath }/css/layout.css" rel="stylesheet" type="text/css" media="all"/>
<link href="${ pageContext.request.contextPath }/css/yolo.css" rel="stylesheet" type="text/css" media="all"/>

</head>

<!-- 헤더 -->
<%@ include file="/WEB-INF/views/include/top.jsp" %>

<div class="wrapper row3 board">
  <main id="container" class="clear">
  	
  	<!-- 좌측 메뉴 -->
    <%@ include file="sidebar.jsp" %>
    <!-- container body -->
    <div id="content" class="three_quarter boardList">
      <h2>YOLO</h2>
      <ul>
          <li>
              <img src="img/ex1.jpg" style="float:left"/><br/><br/>
              <span style="font-size:25px; margin-left:25px;">세상에서 제일 높은 번지점프에 도전하기</span>
              <p style="margin-left:200px; margin-top:25px;">뉴질랜드에서 제일 높은 번지 점프가 여기 퀸스타운에 있다 일명 "NEVIS BUNGY" 134m 의 높이에 Nevis 강위에서 뛰어내린다!! (퀸스타운에서 45분정도 걸리고 예약하면...</p>
          </li>

          <li>
              <img src="img/ex2.png" style="float:left"/><br/><br/>
              <span style="font-size:25px; margin-left:25px;">무동력 요트 세계 일주 김승진 선장</span>
              <p style="margin-left:200px; margin-top:25px;">대한민국 최초, 단독 무기항 무원조 요트 세계일주 성공. 2001년 뉴질랜드에서 요트의 매력에 푹 빠져 딸과 함께 요트로 태평양을 건너겠다는 꿈을 꾸었다. 그리고...</p>
          </li>

          <li>
              <img src="img/ex3.jpg" style="float:left"/><br/><br/>
              <span style="font-size:25px; margin-left:25px;">sdaasd</span>
              <p style="margin-left:200px; margin-top:25px;">스킨스쿠버자격증 따기 도전 - 씨엔조이스쿠버 ! 제 인생의 버킷리스트 중 하나였던 스킨스쿠버 도전과 스킨스쿠버자격증 따기, 잠시...</p>
          </li>
      </ul>

    </div>
    <div class="pagination" style="margin-left:110px;">
      <ul>
        <li><a href="#">&laquo; Previous</a></li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><strong>&hellip;</strong></li>
        <li><a href="#">6</a></li>
        <li class="current"><strong>7</strong></li>
        <li><a href="#">8</a></li>
        <li><a href="#">9</a></li>
        <li><strong>&hellip;</strong></li>
        <li><a href="#">14</a></li>
        <li><a href="#">15</a></li>
        <li><a href="#">Next &raquo;</a></li>
      </ul>
    </div>
    <!-- / container body -->
    <div class="clear"></div>
  </main>
</div>

</body>
</html>
