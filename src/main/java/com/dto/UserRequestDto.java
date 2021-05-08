package com.dto;

import com.annotation.phonenumber.PhoneNumber;

public class UserRequestDto {

    @PhoneNumber
    private String phoneNumber;

    @PhoneNumber(startWithZero = true)
    private String gsmNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }
}
