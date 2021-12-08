package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class RegisterPage extends Utility {
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement genderMaleRadioBtn;


    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerBtn;

    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerTxt;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameErrorMsg;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameErrorMsg;

    @FindBy(css = "#Email-error")
    WebElement emailErrorMsg;

    @FindBy(css = "#Password-error")
    WebElement passwordErrorMsg;

    @FindBy(css = "#ConfirmPassword-error")
    WebElement confirmPasswordErrorMsg;

    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationSuccessfulMsg;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkbox;


    public void clickOnRadiobtn() {
        Reporter.log(" Click on gender button " + genderMaleRadioBtn.toString() + "<br>");
        clickOnElement(genderMaleRadioBtn);
        // CustomListeners.test.log(Status.PASS, "click on Radio button");
    }

    public void EnterFirstName(String FirstName) {
        Reporter.log(" Enterfirstname " + FirstName + "to Firstname addressField" + firstName.toString() + "<br>");
        sendTextToElement(firstName, FirstName);
        //  CustomListeners.test.log(Status.PASS, "Enter firstname " + FirstName);
    }

    public void EnterLastName(String LastName) {
        Reporter.log(" EnterLastName " + LastName + "to lastname addressField" + lastName.toString() + "<br>");
        sendTextToElement(lastName, LastName);
        // CustomListeners.test.log(Status.PASS, "Enter firstname " + LastName);
    }

    public void selectDayFromDropDown(String Day) {
        Reporter.log("select day from dropDown " + day.toString() + "<br>");
        clickOnElement(day);
        //  CustomListeners.test.log(Status.PASS, "Select Day from DropDown");
    }

    public void selectMonthFromDropDown(String Month) {

        Reporter.log("select month from dropDown " + month.toString() + "<br>");
        clickOnElement(month);
        // CustomListeners.test.log(Status.PASS, "Select Month from DropDown");
    }

    public void selectYearFromDropDown(String Year) {

        Reporter.log("select year from dropDown " + year.toString() + "<br>");
        clickOnElement(year);
        // CustomListeners.test.log(Status.PASS, "Select year from DropDown");
    }

    public void EnterEmail(String EMAIL) {

        Reporter.log("enter email " + email.toString() + "<br>");
        sendTextToElement(email, EMAIL);
        //CustomListeners.test.log(Status.PASS, "Enter Email " + EMAIL);
    }


    public void EnterConfirmPassword(String Password) {

        Reporter.log("Enter Confirmed password " + password.toString() + "<br>");
        sendTextToElement(password, Password);
        // CustomListeners.test.log(Status.PASS, "Enter Password " + Password);
    }

    public void EnterPassword(String ConfirmPassword) {

        Reporter.log("Enter password " + password.toString() + "<br>");
        sendTextToElement(confirmpassword, ConfirmPassword);
        // CustomListeners.test.log(Status.PASS, "Enter Password " + ConfirmPassword);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Click on Register button  " + registerBtn.toString() + "<br>");
        clickOnElement(registerBtn);
    }

    public String getTXTFromRegister() {
        Reporter.log("get text from Register " + registerTxt.toString() + "<br>");
        return getTextFromElement(registerTxt);

    }

    public String getErrorMsgFirstName() {
        Reporter.log("get error from fistname " + firstNameErrorMsg.toString() + "<br>");
        return getTextFromElement(firstNameErrorMsg);
    }

    public String getErrorMsgLastName() {
        Reporter.log("get error from Lastname " + lastNameErrorMsg.toString() + "<br>");
        return getTextFromElement(lastNameErrorMsg);

    }

    public String getErrorMsgEmail() {
        Reporter.log("get error from Email " + emailErrorMsg.toString() + "<br>");
        return getTextFromElement(emailErrorMsg);
    }

    public String getErrorMsgPassword() {
        Reporter.log("get error from password " + passwordErrorMsg.toString() + "<br>");
        return getTextFromElement(passwordErrorMsg);
    }

    public String getErrorMsgConfirmPassword() {
        Reporter.log("get error from confirmed Password " + confirmPasswordErrorMsg.toString() + "<br>");
        return getTextFromElement(confirmPasswordErrorMsg);
    }

    public String getSuccessfulRegistrationMsg() {
        Reporter.log("get error from registration  " + registrationSuccessfulMsg.toString() + "<br>");
        return getTextFromElement(registrationSuccessfulMsg);
    }

    public void selectcheckbox() {
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        int size = AllCheckboxes.size();
        System.out.println(size);


        for (int i = 0; i < size; i++) {

            AllCheckboxes.get(i).click();

        }
    }
}
