<%@ page language="java" 
    pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册</title>
</head>
<body>
恭喜您，登陆成功！
	<!-- <s:iterator value="users">  -->
		<s:property value="username"/>
	<!-- </s:iterator> -->
	
	<br>
	<a href="checksession.action">浏览页面</a>
	<br><br>
	添加考题
	 <form method="post" action="userlogin.action">
	问题：<input type="password" name="password" ><br> 
	 类型：<input type="text" name="username" ><br>
	答案选项：
	 参考答案：<input type="password" name="password1" ><br>
	 <input type="submit" value="提交">
	 </form>
	 <br>
	 编辑考题 
	 <form method="post" action="itemslist.action">	 
	 	题型：<input type="text" name="username" ><br>	
	 	<input type="submit" value="搜索">
	 </form>
	 <form method="post" action="itemslist.action">
	问题：<input type="password" name="password" ><br> 
	 类型：<input type="text" name="username" ><br>
	答案选项：
	 参考答案：<input type="password" name="password1" ><br>
	 <input type="submit" value="选中">
	 </form>
	 <form method="post" action="userlogin.action">
		 <input type="submit" value="更新">
	 </form>
	 <form method="post" action="userlogin.action">
		 <input type="submit" value="删除">
	 </form>
	<a href="beginexam.action"></a>
	<a href="beginexam.action">编辑考题</a>
	<a href="beginexam.action">删除考题</a>
	
	<br>
	<a href="beginexam.action">开始考试</a>
	<br>
	<form method="post" action="userlogout.action">
		 <input type="submit" value="登出">
	</form>
</body>
</html>