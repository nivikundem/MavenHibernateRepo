/**
 * 
 */
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