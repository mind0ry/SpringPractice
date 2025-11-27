<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container {
  margin-top: 50px;
}
.row {
  margin:0px auto;
  width:960px;
}
p {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
</style>
</head>
<body>
  <div class="container">
  <div class="row">
  <form method="post" action="list.do">
    <select name="column" class="input-sm">
      <option value="korname" ${column=="korname"?"selected":"" }>이름</option>
      <option value="description" ${column=="description"?"selected":"" }>내용</option>
    </select>
    <input type="text" name="fd" class="input-sm" size=20 value="${fd!=null?fd:'' }">
    <button class="btn-sm btn-primary">검색</button>
   </form>
  </div>
    <div class="row" style="margin-top:15px;">
      <c:forEach var="vo" items="${list }">
          <div class="col-md-3">
		    <div class="thumbnail">
		      <a href="#">
		        <img src="${vo.image }" style="width:230px;height: 120px"
		          title="${vo.description }"
		        >
		        <div class="caption">
		          <p>${vo.korname } | ${vo.engname }</p>
		        </div>
		      </a>
		    </div>
		  </div>
      </c:forEach>
    </div>
    <div class="row text-center" style="margin-top: 20px">
	  <ul class="pagination">
	   <c:if test="${startPage>1 }">
	    <li><a href="list.do?page=${startPage-1 }&fd=${fd}&column=${column}">&lt;</a></li>
	   </c:if>
	   <c:forEach var="i" begin="${startPage }" end="${endPage }">
	    <li ${i==curpage?"class=active":"" }><a href="list.do?page=${i }&fd=${fd}&column=${column}">${i }</a></li>
	   </c:forEach>
	   <c:if test="${endPage<totalpage }">
	    <li><a href="list.do?page=${endPage+1 }&fd=${fd}&column=${column}">&gt;</a></li>
	   </c:if>
	    
	  </ul>
  </div>
 </div>
</body>
</html>