package com.annotation.useractivation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserActivationAspect {

    @Before("@annotation(UserActivation)")
    public void checkUserActivation() throws Exception {
        throw new Exception("Not found");
    }
}
