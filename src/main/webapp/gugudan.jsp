<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
 int dan = Integer.parseInt(request.getParameter("dan"));



%>


<!DOCTYPE html>
<html lang="ko">
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	
	<body>
		<h1>jsp</h1>
		<table border="1">
			<tbody>				
			
			<% for(int i=1; i<=9; i++){ %>
				<tr>
					<td><%= dan %></td>
					<td><%=i %></td>
					<td><%=dan*i %></td>
				</tr>
			<% }%>
				
				
			</tbody>
		</table>
	</body>
	
</html>
