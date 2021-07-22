package io.educative.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HeadToHeadConstraintValidator implements ConstraintValidator<HeadToHead, String>{

	//custom business logic to validate the annotation
	
	@Override
	public void initialize(HeadToHead headToHeadScore) {
		
	}
		
	@Override
	public boolean isValid(String headToHeadScore, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean isValid = headToHeadScore.matches("[0-9]{1,2}-[0-9]{1,2}");
	    return isValid;
	}
}