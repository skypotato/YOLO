<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<main id="container" class="clear">
<div class="sidebar one_quarter first">

	<div class="my-pic">
		<img src="../image/my-pic.png" alt="">
	</div>
	<div class="my-detail">
		<div class="white-spacing">
			<h1>ID(Skypotato)</h1>
			<span>전문가</span>
		</div>
	</div>

	<nav class="sdb_holder">
		<ul>
			<li><a href="#"> 회원정보 관리</a>
				<ul>
					<li><a href="#">개인정보 수정</a></li>
					<li><a href="#">아이디/비밀번호 수정</a></li>
				</ul>
			</li>
			<li><a href="#">글 관리</a>
				<ul>
					<li><a href="#">글 쓰기</a></li>
					<li><a href="#">글 상태 변경</a></li>
				</ul>
			</li>
			<li><a href="#">버킷리스트 관리</a>
				<ul>
					<li><a href="#">버킷리스트 보기</a></li>
					<li><a href="#">버킷리스트 수정</a></li>
				</ul>
			</li>
		</ul>
	</nav>
</div>
<jsp:include page="./contents/information.jsp" />
</main>
