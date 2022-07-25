<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<link rel="shortcut icon" href="#">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, height=device-height, initial-scale=1.0, user-scalable=yes">
<meta name="format-detection"
	content="telephone=no, address=no, email=no">
<meta name="keywords" content="">
<meta name="description" content="">
<title>게시판목록</title>
<link rel="stylesheet" href="../css/reset.css" />
<link rel="stylesheet" href="../css/contents.css" />
<script>
</script>
</head>
<body>
	<div class="sub">
		<div class="size">
			<h3 class="sub_title">게시판${loginInfo.email}</h3>
			<div class="bbs">
				<table class="list">
					<p>
						<span><strong>총 ${data.totalCount}개</strong> | ${boardVO.page}/${data.totalPage}페이지</span>
					</p>
					<caption>게시판 목록</caption>
					<colgroup>
						<col width="80px" />
						<col width="*" />
						<col width="100px" />
						<col width="100px" />
						<col width="200px" />
					</colgroup>
					<thead>
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>조회수</th>
							<th>작성자</th>
							<th>작성일</th>
						</tr>
					</thead>
					<tbody>
						<c:if test = "${empty data.list}">
							<tr>
								<td class="first" colspan="5">등록된 글이 없습니다.</td>
							</tr>
						</c:if>
						<c:forEach items="${ data.list }" var="vo" varStatus="status">
						<!-- ${status.current} 현재 for문의 해당하는 번호
							${status.index} 0부터의 순서

							${status.count} 1부터의 순서

							${status.first} 첫 번째인지 여부

							${status.last} 마지막인지 여부

							${status.begin} for문의 시작 번호

							${status.end} for문의 끝 번호

							${status.step} for문의 증가값 -->
							<tr>
								<td>${data.totalCount-status.index-(boardVO.page -1)*boardVO.pageRow}<!-- 총개수-인덱스-(현재 페이지 번호 -1)*페이지당 개수  --></td>
								<td class="txt_l">
									<a href="view.do?no=${vo.no}">${vo.title}</a>
								</td>
								<td>${vo.viewcount}</td>
								<td class="writer">${vo.member_no}</td>
								<td class="date">
									<fmt:formatDate pattern="yyyy-MM-dd" value="${vo.regdate}"/>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<!-- 글작성 -->
				<div class="btnSet" style="text-align: right;">
					<a class="btn" href="write.do">글작성</a>
				</div>
				
				<!-- 페이지처리 -->
				<div class="pagenate clear">
					<ul class='paging'>
						<c:if test="${data.prev == true }">
							<li><a href="index.do?page=${data.startPage-1}&stype=${param.stype}&sword=${param.sword}"></a></li>
						</c:if>
						<c:forEach var="p" begin="${data.startPage}" end="${data.endPage}">
							<li><a href='index.do?page=${p}&stype='${param.stype}'&sword='${param.sword}'' <c:if test='${boardVO.page == p }'>class='current'</c:if>>${p}</a></li>
						</c:forEach>
						<c:if test="${data.next == true }">
							<li><a href="index.do?page=${data.endPage+1}&stype=${param.stype}&sword=${param.sword}">></a></li>
						</c:if>
					</ul>
				</div>
				
				<!--  검색 -->
				<div class="bbsSearch">
					<form method="get" name="searchForm" id="searchForm" action="">
                    	<span class="srchSelect">
							<select id="stype" name="stype" class="dSelect" title="검색분류 선택">
								<option value="all">전체</option>
								<option value="title">제목</option>
								<option value="content">내용</option>
							</select>
						</span>
						<span class="searchWord">
							<input type="text" id="sword" name="sword" value=""  title="검색어 입력">
							<input type="button" id="" value="검색" title="검색">
						</span>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>