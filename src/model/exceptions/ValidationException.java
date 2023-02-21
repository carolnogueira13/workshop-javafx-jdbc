package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<>(); // 1º string o nome do campo e o 2º string a msg de erro
	
	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	public void adderror(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
	
	

}
