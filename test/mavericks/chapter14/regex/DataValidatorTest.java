package mavericks.chapter14.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {

    @Test
    public void testValidatePhoneNumber(){
        String phoneNumber = "";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber2(){
        String phoneNumber = "09035067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber3(){
        String phoneNumber = "+2349035067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber4(){
        String phoneNumber = "+234903506789695";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber5(){
        String phoneNumber = "2349035067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber6(){
        String phoneNumber = "+234-7015067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber7(){
        String phoneNumber = "234 701 506 7896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber8(){
        String phoneNumber = "7023452367";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidateEmailAddress(){
        String email = "";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertFalse(isEmailValid);
    }

    @Test
    public void testValidateEmailAddress1(){
        String email = "o.oladeji@semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }

    @Test
    public void testValidateEmailAddress2(){
        String email = "ashley@semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }

    @Test
    public void testValidateEmailAddress3(){
        String email = "ASHLEY@semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }

    @Test
    public void testValidateEmailAddress4(){
        String email = "ASHLEY@native.semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }


}