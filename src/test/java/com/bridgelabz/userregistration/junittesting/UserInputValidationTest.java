package com.bridgelabz.userregistration.junittesting;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class UserInputValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Akshatha");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Ak");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("Nagaraju");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("Na");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("akshathanagaraj98@gmail.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("asd..@s.com");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidMobileNumber("91 9110237054");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidMobileNumber("9155-656546");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("akshatha");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("ak123");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPasswordWithOneUpperCHar_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordOneUpperChar("Akshatha");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordWithOneUpperCHar_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordOneUpperChar("akshatha");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPasswordWithOneNumeric_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordWithNumeric("Akshu1234");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordWithOneNumeric_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordWithNumeric("Akshatha");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPasswordWithOneSpecialChar_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordWithSpecialChar("Akshu@123");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordWithOneSpecialChar_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordWithSpecialChar("Akshu123");
        Assertions.assertEquals(false, result);
    }
}