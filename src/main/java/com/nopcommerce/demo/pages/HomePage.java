package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {

        PageFactory.initElements(driver, this);//create constructor
    }



    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersLink;

    @FindBy(xpath = "//h1[normalize-space()='Electronics']")
    WebElement electronicsLink;

    @FindBy(xpath = "(//h1[normalize-space()='Apparel']")
    WebElement apparelLink;

    @FindBy(xpath = "//h1[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsLink;

    @FindBy(linkText = "Books")
    WebElement booksLink;

    @FindBy(xpath = "//h1[normalize-space()='Jewelry']")
    WebElement jewelryLink;

    @FindBy(xpath = "//h1[normalize-space()='Gift Cards']")
    WebElement giftCardsLink;

    @FindBy(linkText = "Log in")
    WebElement loginLink;


    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(xpath ="//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;


    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;

    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;


    public void clickOnLoginLink() {
        Reporter.log(" Click on login Link " + logoutLink.toString() + "<br>");
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink() {
        Reporter.log(" Click on registerlink " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
    }

    public void clickOnComputerLink() {
        Reporter.log(" Click on computerLink " + computersLink.toString() + "<br>");
        clickOnElement(computersLink);
    }
    public void clickOnElectronicLink() {
        Reporter.log(" Click on ElectronicsLink " + electronicsLink.toString() + "<br>");
        clickOnElement(electronicsLink);
    }
    public void clickOnApparelLink() {
        Reporter.log(" Click on apparelLink " + apparelLink.toString() + "<br>");
        clickOnElement(apparelLink);
    }
    public void clickOnDigitalDownloadsLink() {
        Reporter.log(" Click on digital link " + digitalDownloadsLink.toString() + "<br>");
        clickOnElement(digitalDownloadsLink);
    }
    public void clickOnBookLink() {
        Reporter.log(" Click on bookslink " + booksLink.toString() + "<br>");
        clickOnElement(booksLink);
    }
    public void clickOnJewelryLink() {
        Reporter.log(" Click on jewelryLink " + jewelryLink.toString() + "<br>");
        clickOnElement(jewelryLink);
    }
    public void clickOnGiftCardsLink() {
        Reporter.log(" Click on giftcards " + giftCardsLink.toString() + "<br>");
        clickOnElement(giftCardsLink);
    }
    public void clickOnNopCommerceLogoLink() {
        Reporter.log(" Click on nopcommerceLogo " + nopcommerceLogo.toString() + "<br>");
        clickOnElement(nopcommerceLogo);
    }
    public void clickOnMyAccountLink() {
        Reporter.log(" Click on myAccountLink " + myAccountLink.toString() + "<br>");
        clickOnElement(myAccountLink);
    }
    public void clickOnLogoutLink() {
        Reporter.log(" Click on logoutLink " + logoutLink.toString() + "<br>");
        clickOnElement(logoutLink);
    }

    public String getTextLogout(){
        Reporter.log(" Click on logoutlink " + logoutLink.toString() + "<br>");
        return getTextFromElement(logoutLink);
    }
}
