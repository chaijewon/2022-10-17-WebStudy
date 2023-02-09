<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
$(function(){
	$('.groupBtn').click(function(){
		let no=$(this).attr('data-no')
		$('#n'+no).show()
	})
})
</script>
</head>
<body>
  <div class="wrapper row3">
    <main class="container clear">
     <h2 class="sectiontitle">조편성</h2>
     <div style="height: 5px"></div>
     <c:forEach var="i" items="${list }" varStatus="s">
       <div class="col-md-2">
	    <div class="thumbnail">
	      <span data-no="${s.index }" class="btn btn-sm btn-success groupBtn" style="height: 120px;width: 120px"><h1 class="text-center">${s.index+1 }</h1></span>
	    </div>
	    <div style="display:none" id="n${s.index }">
	      <span style="height: 120px;width: 120px"><h1 class="text-center">${list[s.index].group==0?"조커": list[s.index].group+="조"}</h1></span>
	    </div>
	   </div>
     </c:forEach>
    </main>
  </div>
</body>
</html>