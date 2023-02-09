<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.row{
  width: 1200px;
  height: 600px;
}
</style>
</head>
<body>
  <div class="container">
    <div class="row" style="height: 450px">
      <div class="one_third first">
       <img src="${vo.poster }" style="width:300px;height: 300px;">
      </div>
      <div class="one_third">
        <jsp:include page="diary.jsp"></jsp:include>
      </div>
      <div class="one_third">
        맛집명:${vo.name }<br>
        체크인:<span id="cin"></span><br>
        체크아웃<span id="cout"></span>
      </div>
    </div>
  </div>
</body>
</html>