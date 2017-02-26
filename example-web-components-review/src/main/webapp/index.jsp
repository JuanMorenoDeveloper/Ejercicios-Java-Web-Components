<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fn" uri="http://proitc.com/functions"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Functions test</title>
</head>
<body>
	<br>
		${initParam.titleStr} 
		<br>
		${initParam['titleStr']}
	<br>
	${fn:spin()}
	<br>
	<c:import url="extra.jsp"/>
	<br>
	<a href="origin">Origin</a>
	<br>
	<fn:message from="from" subject="subject">
	<%-- <%=request.getProtocol() %> --%>	
	</fn:message>
	<br>
	<jsp:useBean id="producto" class="com.proitc.bean.Producto"/>	
	<jsp:setProperty property="nombre" name="producto" param="test"/>
	<jsp:getProperty property="nombre" name="producto"/>
</body>
</html>