<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">SpringMVC</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">카페
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="../food/find.do"></a></li>
          <li><a href="#">맛집 추천</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>

</body>
</html>