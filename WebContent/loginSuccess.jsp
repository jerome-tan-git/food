<%@ page language="java" 
    pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>×¢²á</title>
</head>
<body>
¹§Ï²Äú£¬µÇÂ½³É¹¦£¡
	<!-- <s:iterator value="users">  -->
		<s:property value="username"/>
	<!-- </s:iterator> -->
	
	<br>
	<a href="checksession.action">ä¯ÀÀÒ³Ãæ</a>
	<br><br>
	Ìí¼Ó¿¼Ìâ
	 <form method="post" action="userlogin.action">
	ÎÊÌâ£º<input type="password" name="password" ><br> 
	 ÀàÐÍ£º<input type="text" name="username" ><br>
	´ð°¸Ñ¡Ïî£º
	 ²Î¿¼´ð°¸£º<input type="password" name="password1" ><br>
	 <input type="submit" value="Ìá½»">
	 </form>
	 <br>
	 ±à¼­¿¼Ìâ 
	 <form method="post" action="itemslist.action">	 
	 	ÌâÐÍ£º<input type="text" name="username" ><br>	
	 	<input type="submit" value="ËÑË÷">
	 </form>
	 <form method="post" action="itemslist.action">
	ÎÊÌâ£º<input type="password" name="password" ><br> 
	 ÀàÐÍ£º<input type="text" name="username" ><br>
	´ð°¸Ñ¡Ïî£º
	 ²Î¿¼´ð°¸£º<input type="password" name="password1" ><br>
	 <input type="submit" value="Ñ¡ÖÐ">
	 </form>
	 <form method="post" action="userlogin.action">
		 <input type="submit" value="¸üÐÂ">
	 </form>
	 <form method="post" action="userlogin.action">
		 <input type="submit" value="É¾³ý">
	 </form>
	<a href="beginexam.action"></a>
	<a href="beginexam.action">±à¼­¿¼Ìâ</a>
	<a href="beginexam.action">É¾³ý¿¼Ìâ</a>
	
	<br>
	<a href="beginexam.action">¿ªÊ¼¿¼ÊÔ</a>
	<br>
	<form method="post" action="userlogout.action">
		 <input type="submit" value="µÇ³ö">
	</form>
</body>
</html>