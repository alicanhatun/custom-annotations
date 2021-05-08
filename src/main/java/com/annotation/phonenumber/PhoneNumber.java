package com.annotation.phonenumber;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumber {

    boolean startWithZero() default false;

    String message() default "Telefon numarası uygun değil.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}