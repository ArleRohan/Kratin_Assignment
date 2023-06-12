<%@page import="com.demo.beans.Medicine"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.demo.dao.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Medicine</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="Navbar.html"%>
	</div>
	<%
	String disease = request.getParameter("disease");
	System.out.println(disease);
	
	Session s = FactoryProvider.getFactory().openSession();
	Query q = s.createQuery("from Medicine");
	List<Medicine> mlist = q.list();
	for(Medicine med : mlist)
	{
		out.println(med.getMedicine_name()+" "+med.getBrand_name());
	}
	
	s.close();
	%>

</body>
</html>