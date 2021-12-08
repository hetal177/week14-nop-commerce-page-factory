package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(id ="Email")
    WebElement emailfield;


    @FindBy(name = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    //  By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    // By emailField = By.id("Email");
    //By passwordField = By.name("Password");
    //By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    // By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText(){
        Reporter.log(" Click on WelcomeText " + welcomeText.toString() + "<br>");
        String message = getTextFromElement(welcomeText);
      //  CustomListeners.test.log(Status.PASS,"Get welcomeText");
        return message;
    }

    public void enterEmailId(String email){
        Reporter.log(" EnterEmail " +email+ "to email addressField" +emailfield.toString() + "<br>");
        sendTextToElement(emailfield, email);
       // CustomListeners.test.log(Status.PASS,"Enter EmailId " + email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
        Reporter.log(" enterPassword " +password+ "to password addressField" +passwordField.toString() + "<br>");
    }

    public void clickOnLoginButton(){
        Reporter.log(" click on login button  " + loginButton.toString() + "<br");
        clickOnElement(loginButton);
       // CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }

    public String getErrorMessage(){
        String message = getTextFromElement(errorMessage);
        Reporter.log(" Error Message " + errorMessage.toString() + "<br>");
       // CustomListeners.test.log(Status.PASS,"Get errorMessage");
        return message;
    }

}
