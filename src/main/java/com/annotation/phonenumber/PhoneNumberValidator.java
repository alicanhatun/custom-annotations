package com.annotation.phonenumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    private static final String NUMERIC_REGEX = "[0-9]+";

    private static final String NUMERIC_REGEX_START_WITH_ZERO = "0[0-9]+";

    private static final Pattern NUMERIC_PATTERN = Pattern.compile(NUMERIC_REGEX);

    private static final Pattern NUMERIC_PATTERN_START_WITH_ZERO = Pattern.compile(NUMERIC_REGEX_START_WITH_ZERO);

    private boolean startWithZero;

    public void initialize(PhoneNumber constraint) {
        startWithZero = constraint.startWithZero();
    }

    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {

        if (isNotEmpty(phoneNumber)) {
            if (startWithZero) {
                return NUMERIC_PATTERN_START_WITH_ZERO.matcher(phoneNumber).matches();
            }
            else {
                return NUMERIC_PATTERN.matcher(phoneNumber).matches();
            }
        }
        return false;
    }

    public static boolean isNotEmpty(String value) {
        return !isEmpty(value);
    }

    public static boolean isEmpty(String value) {
        return value == null || "".equals(value);
    }
}
