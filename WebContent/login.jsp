<%@ page language="java" import="java.util.*" 
	
    pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"
	+request.getServerPort()+path+"/";
%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户登陆注册</title>
</head>
<body>
登陆<br>
	 <form method="post" action="userlogin.action">
	 用户名：<input type="text" name="username" ><br>
	 密码：<input type="password" name="password" ><br>
	 确认密码：<input type="password" name="password1" ><br>
	 <input type="submit" value="提交">
	</form>
注册<br>
	 <form method="post" action="userbuilt.action">
	 用户名：<input type="text" name="username" ><br>
	 密码：<input type="password" name="password" ><br>
	 确认密码：<input type="password" name="password1" ><br>
	 <input type="submit" value="提交">
	</form>
</body>
</html>