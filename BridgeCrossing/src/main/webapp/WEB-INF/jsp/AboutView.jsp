<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page import="java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<style type="text/css"><%@include file="css/crossing_stylesheet.css" %></style><!--  stylesheet -->
	<title>About View</title> 	
</head>
<body>
	<div id="container">
    <!-- header -->
   	<%@ include file="header.jsp" %>
    <!-- menu -->
	<div id="divmenu">	   
	    <%@ include file="menu.jsp" %>	   			
	</div>   
	<!--content-->
	   <div id="textPara">		   
		    Demo for using <br/><br/>
		    Spring MVC<br/>
		    Hibernate <br/>
		    Maven<br/>
		    MySql<br/>
		    Jetty<br/>		    
		    JSTL<br/>
		    JSP <br/>   	
		 </div>		
	<!-- footer -->
	<%@ include file="footer.jsp" %>
</div>
</body>
</html>