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
	<style type="text/css"><%@include file="css/crossing_stylesheet.css" %> </style>
	<title>Vehicle Owner Details Entry</title>  
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>  
    <script>
    $(document).ready(function(){    	
    	entryViewFormSubmit();    	
   	});
     
    function entryViewFormSubmit(){
		$("#entryViewForm").submit(function(event){    	
    	var vrnValue = $("#vrn").val(); 
    	var nameValue = $("#name").val(); 
    	var postcodeValue = $("#postcode").val(); 
    	if(vrnValue == ""){
    	$("#vrnerrormessage").html("*");
    	event.preventDefault();
    	}
    	if(nameValue == ""){
        	$("#nameerrormessage").html("*");
        	event.preventDefault();
       	}
    	
    	if(postcodeValue == ""){
        	$("#postcodeerrormessage").html("*");
        	event.preventDefault();
       	}    	
    	});
	}
    
    function deleteFormSubmit(uid){	 
  	  document.forms["deleteForm"].uid.value=uid;
  	  document.forms["deleteForm"].submit();	  
  	} 
   
    </script> 
    
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
 	<div id="content"> 		
	    <c:choose>
	    <c:when test="${fn:length(vehicleOwnersDetailsObjList) > 0}">	    
	        <div id="leftdiv">
	        <p>
	        <form  method="POST" action='EntryView' name="entryViewForm" id="entryViewForm">
			<div id="entrydiv">
			    <table>
			       <tr><td>VRN</td><td> <input type="text" id="vrn" name="vrn"/><div id="vrnerrormessage"></div><br/></td></tr>
			       <tr><td>Owners Name</td><td> <input type="text" id="name" name="name"/><div id="nameerrormessage"></div><br/></td></tr>
			       <tr><td>Postcode</td><td> <input type="text" id="postcode" name="postcode"/><div id="postcodeerrormessage"></div><br/></td></tr>
			       <tr><td></td><td align="center"><br/><input type="submit" class="addButton" value="Submit" /></td></tr>			    
			    </table>
			</div>
		   </form>
	        </p>
	        </div>		
			<div id="rightdiv">  
			<p>
			<table id="activitytable">
			   	<tr>
					<th>UID</th>
					<th>Vehicle Registration Number</th>
					<th>Owners Name</th>
					<th>Postcode</th>
					<th>Delete</th>	   					                 
				</tr>
			     <c:forEach items="${vehicleOwnersDetailsObjList}" var="vehicleOwnersDetailsObj">
					<tr>					
						<td><c:out value="${vehicleOwnersDetailsObj.uid}" /></td>
						<td><c:out value="${vehicleOwnersDetailsObj.vrn}" /></td>
						<td><c:out value="${vehicleOwnersDetailsObj.name}" /></td>	
						<td><c:out  value="${vehicleOwnersDetailsObj.postcode}"/></td>							
						<td><a id="deleteLink" href="javascript:void(0);" onClick="deleteFormSubmit(${vehicleOwnersDetailsObj.uid});return false;">Delete</a></td>
					</tr>
				</c:forEach>	
			</table>
			</p>
			</div>
		    <div class"clear"></div>
		<!--  forms with with hidden values -->    
		<form  method="GET" action='DeleteView' name="deleteForm">		   
		<input type="hidden" name="uid">
		</form> 	
		</c:when>
		<c:otherwise>
		   <div id="textPara"> No records found.</div>
		</c:otherwise>
		</c:choose> 
	</div> 
	<%@ include file="footer.jsp" %>
</div>
</body>
</html>