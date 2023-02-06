<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="start_day" value="2023-02-01"/>
<c:set var="end_day" value="2023-03-01"/>
<c:set var="today" value="2023-02-06"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <c:if test="${start_day<=today && end_day>=today}">
    성공
  </c:if>
  <c:if test="${!(start_day<=today && end_day>=today)}">
    실패
  </c:if>
</body>
</html>