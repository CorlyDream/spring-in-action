<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<ol>
		<c:forEach items="${spittleList }" var="spittle">
			<li>
				<div>${spittle.message }</div>
				<div>
					<span>${spittle.time }</span>
					<span>${spittle.latitude }</span>
					<span>${spittle.longitude }</span>
				</div>
			</li>
		</c:forEach>
	</ol>
</body>
</html>