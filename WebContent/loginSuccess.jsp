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
	
	<br>
	<a href="checksession.action">���ҳ��</a>
	<br><br>
	��ӿ���
	 <form method="post" action="userlogin.action">
	���⣺<input type="password" name="password" ><br> 
	 ���ͣ�<input type="text" name="username" ><br>
	��ѡ�
	 �ο��𰸣�<input type="password" name="password1" ><br>
	 <input type="submit" value="�ύ">
	 </form>
	 <br>
	 �༭���� 
	 <form method="post" action="itemslist.action">	 
	 	���ͣ�<input type="text" name="username" ><br>	
	 	<input type="submit" value="����">
	 </form>
	 <form method="post" action="itemslist.action">
	���⣺<input type="password" name="password" ><br> 
	 ���ͣ�<input type="text" name="username" ><br>
	��ѡ�
	 �ο��𰸣�<input type="password" name="password1" ><br>
	 <input type="submit" value="ѡ��">
	 </form>
	 <form method="post" action="userlogin.action">
		 <input type="submit" value="����">
	 </form>
	 <form method="post" action="userlogin.action">
		 <input type="submit" value="ɾ��">
	 </form>
	<a href="beginexam.action"></a>
	<a href="beginexam.action">�༭����</a>
	<a href="beginexam.action">ɾ������</a>
	
	<br>
	<a href="beginexam.action">��ʼ����</a>
	<br>
	<form method="post" action="userlogout.action">
		 <input type="submit" value="�ǳ�">
	</form>
</body>
</html>