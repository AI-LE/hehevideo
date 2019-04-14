<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h2>File upload demo</h2>
<form action="<%=basePath%>FileUploadServlet"  method="post" enctype="multipart/form-data">
    <input type="file" name="filename" size="45"><br>
    <input type="submit" name="submit" value="submit">
</form>
</body>
</html>