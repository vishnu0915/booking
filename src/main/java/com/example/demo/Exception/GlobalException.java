//package com.example.demo.Exception;
//
//import java.util.HashMap;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//
//
//public class GlobalException {
//	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorInfo> handleException(Exception ex, HttpServletRequest req) {
//		return new ResponseEntity<>(new ErrorInfo(HttpStatus.NOT_FOUND,404,ex.getMessage(),req.getRequestURI()),HttpStatus.NOT_FOUND);  
//	}
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<ErrorInfo> handleException1(Exception ex, HttpServletRequest req){
//		Map<String, String> errors = new HashMap<>();
//		((BindException) ex)errors.getBindingResult().getAllErrors().forEach(error -> {
//			String field =  ((FieldError) error).getField();
//			String message = error.getDefaultMessage();
//			errors.put(field, message);
//		});
//		return new ResponseEntity<>(new ErrorInfo(HttpStatus.BAD_REQUEST,400,errors.toString(), req.getRequestURI()),HttpStatus.BAD_REQUEST); 
//
//	}


//}
