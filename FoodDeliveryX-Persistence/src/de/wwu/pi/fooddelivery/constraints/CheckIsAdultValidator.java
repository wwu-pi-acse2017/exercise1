package de.wwu.pi.fooddelivery.constraints;

import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckIsAdultValidator implements ConstraintValidator<IsAdult, Date> {

	@Override
	public void initialize(IsAdult arg0) {
		// Nothing to initialize
	}

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext constraintContext) {
		Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, -18);
        cal.add(Calendar.DATE, -1);
        
        if(date != null && cal.getTime().after(date)) return true;
        
        return false;
	}

}
