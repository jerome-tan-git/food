<%@ page language="java" 
    pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ע��</title>
</head>
<body>
��ϲ������½�ɹ���
	<!-- <s:iterator value="users">  -->
		<s:property value="username"/>
	<!-- </s:iterator> -->
	
	<!-- <a href="hello.html">���ҳ��</a> -->
	<a href="checksession.action">���ҳ��</a>
	<!-- <form method="post" action="userlogout.action">
		 <input type="submit" value="�ǳ�">
	</form>
	 -->
</body>
</html>