package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

        HomePage homePage;
        LoginPage loginPage;


        @BeforeMethod
        public void setup() {
            homePage = new HomePage();
            loginPage = new LoginPage();
        }

        @Test(groups = "sanity")
        public void verifyUserShouldNavigateToLoginPage() {
            homePage.clickOnLoginLink();
            String expectedMessage = "Welcome, Please Sign In!";//////////fail !
            String actualMessage = loginPage.getWelcomeText();
            Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
        }

        @Test(groups = "smoke")
        public void verifyErrorMessageWithInvalidCredentials() {
            homePage.clickOnLoginLink();
            loginPage.enterEmailId("prime123@gmail.com");
            loginPage.enterPassword("prime123");
            loginPage.clickOnLoginButton();
            String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                    + "No customer account found";
            String actualErrorMessage = loginPage.getErrorMessage();
            Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
        }

        @Test
        public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() throws InterruptedException {
            homePage.clickOnLoginLink();
            loginPage.enterEmailId("hetal1234@gmail.com");
            Thread.sleep(1000);
            loginPage.enterPassword("sairam123");
            Thread.sleep(3000);
            loginPage.clickOnLoginButton();
            ////*****OE TO VERIFY LOGOUT LINK IS DISPLYED***********

            // String expectedLogoutLink = "Log out";
            // String actualLogoutLink = loginPage.getTextFromElement;
            // Assert.assertEquals(actualLogoutLink, expectedLogoutLink, "Logout");
        }

        @Test
        public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
            homePage.clickOnLoginLink();
            loginPage.enterEmailId("hetal1234@gmail.com");
            Thread.sleep(1000);
            loginPage.enterPassword("sairam123");
            Thread.sleep(3000);
            loginPage.clickOnLoginButton();
            homePage.clickOnLogoutLink();
            //   *****verify login link display*****

        }

    }

