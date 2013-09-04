<%--
	* createdate:2013-4-11 上午07:27:18
	* Copyright: Tianjin Zoomkey Software Development Co.,Ltd.
	* JSP页面功能描述: hcms  
	* @author <a href="mailto:yangyikui@zoomkey.com.cn">yangyikui</a>
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %> 
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html lang="true">
<head>
	<title>标题</title>
	 
<script language="JavaScript">

</script>
</head>
<body id="content">  
<html:form action="/login.do?method=Login" method="post">
	用户名：<input type="text" name="name"/><br/>
 　  密 码：<input type="password" name="pwd"/><br/>
   <input type="submit" name="submitAdd" value="登录"/>
   <html:link forward="index.jsp">注册</html:link>
</html:form>
	
</body>
</html:html>