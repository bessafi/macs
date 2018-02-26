package com.bombardier.macs;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
/*
 * Bessafi
 * 
 * */
public class ApiStatus {

    private HttpStatus status;
    private String message;
   
    public ApiStatus() {
        super();
    }

    public ApiStatus(final HttpStatus status, final String message) {
        super();
        this.status = status;
        this.message= message;
    }

    
    public ApiStatus(final HttpStatus status,boolean isPart, boolean isCahier, boolean isWc) {
        super();
        this.status = status;
        if(status.equals(HttpStatus.METHOD_NOT_ALLOWED))  { this.message ="Validation exception";}
    	else if(status.equals(HttpStatus.NOT_FOUND)&& isPart)  {this.message = "Part(s) not found";}
    	else if(status.equals(HttpStatus.NOT_FOUND) && isCahier)  {this.message = "Cahier(s) not found";}
    	else if(status.equals(HttpStatus.BAD_REQUEST))  {this.message = "Invalid parameters";}
    	else   {this.message = "";}
    }
    
    public ApiStatus(final HttpStatus status,boolean addToolOrDrw, boolean addNewPart) {
        super();
        this.status = status;
         if(status.equals(HttpStatus.METHOD_NOT_ALLOWED)&& addToolOrDrw)  {this.message = "Invalid Input";}
    	else if(status.equals(HttpStatus.METHOD_NOT_ALLOWED) && addNewPart)  {this.message = "Invalid Input";}
    	else if(status.equals(HttpStatus.BAD_REQUEST))  {this.message = "Invalid parameters";}
    	else   {this.message = "";}
    }
    
    
	//return ResponseEntity.status(status)
	//	       .contentType(MediaType.TEXT_PLAIN)
	//       .body(getMessage(status));
	
	//ResponseEntity response = new  ResponseEntity<String>(status);
	//response.status(status).contentType(MediaType.TEXT_PLAIN).body(getMessage(status));
	//return response;
	
//}   

private String getMessage(HttpStatus status){
	if(status.equals(HttpStatus.METHOD_NOT_ALLOWED)) return "Validation exception";
	else if(status.equals(HttpStatus.NOT_FOUND)) return "Part(s) not found";
	else if(status.equals(HttpStatus.BAD_REQUEST)) return "Invalid parameters";
	else  return "";
}
    //

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(final HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

  
}
