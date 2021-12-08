package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homePage;
    RegisterPage registerpage;


    @BeforeMethod
    public void setup1() {
        homePage = new HomePage();
        registerpage = new RegisterPage();
    }

    @Test

    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(3000);
        registerpage.getTXTFromRegister();
        Thread.sleep(3000);
        String expectedMessage = "Register";
        String actualMessage = registerpage.getTXTFromRegister();
        Assert.assertEquals(actualMessage,expectedMessage, "Register page not displayed");


    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandetory() {
        homePage.clickOnRegisterLink();
        registerpage.clickOnRegisterButton();

        String expectedMessage = "First name is required.";
        String actualMessage = registerpage.getErrorMsgFirstName();
        Assert.assertEquals(expectedMessage, actualMessage, "First name is mandatory");


        String expectedMessage1 = "Last name is required.";
        String actualMessage1 = registerpage.getErrorMsgLastName();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Last name is mandatory");

        String expectedMessage2 = "Email is required.";
        String actualMessage2 = registerpage.getErrorMsgEmail();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Email is mandatory");

        String expectedMessage3 = "Password is required.";
        String actualMessage3 = registerpage.getErrorMsgPassword();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Password is mandatory");

        String expectedMessage4 = "Password is required.";
        String actualMessage4 = registerpage.getErrorMsgConfirmPassword();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Confirm password is mandatory");


    }

    @Test

    public void VerifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerpage.EnterFirstName("Ram");
        registerpage.EnterLastName("sita");
        registerpage.selectDayFromDropDown("11");

        registerpage.selectMonthFromDropDown("02");
        registerpage.selectYearFromDropDown("1941");

        registerpage.EnterEmail("abc@yahoo.com");
        registerpage.EnterPassword("A12345");
        registerpage.EnterConfirmPassword("A12345");
        registerpage.clickOnRegisterButton();

        String expectedMessage5 = "Your registration completed";
        String actualMessage5 = registerpage.getSuccessfulRegistrationMsg();
        Assert.assertEquals(expectedMessage5, actualMessage5, "Your registration completed");

    }

}


