<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
.container{
   margin-top:30px;
}
.row{
   width: 700px;
   margin: 0px auto;
}
</style>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
// 스크립트로 화면 제어 
</script>
</head>
<body>
   <div class="container">
     <h1 class="text-center">회원 가입</h1>
     <div class="row">
       <table class="table">
        <tr>
          <th class="text-right" width=15%>ID</th>
          <td width=85%>
            <input type=text id=id size=15 class="input-sm" readonly>
            <input type=button value="아이디중복체크" class="btn btn-sm btn-danger" id="idCheckBtn">
          </td>
        </tr>
        <tr>
          <th class="text-right" width=15%>우편번호</th>
          <td width=85%>
            <input type=text id=post size=15 class="input-sm" readonly>
            <input type=button value="우편번호검색" class="btn btn-sm btn-success" id="postBtn">
          </td>
        </tr>
        <tr>
          <th class="text-right" width=15%>주소</th>
          <td width=85%>
            <input type=text id=addr size=50 class="input-sm" readonly>
          </td>
        </tr>
       </table>
     </div>
   </div>
</body>
</html>






