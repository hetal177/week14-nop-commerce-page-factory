package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @FindBy(linkText = "Computers")
    //li[@class='active last']//a[normalize-space()='Computers']
    WebElement computerLink;

    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerPageTitle;

    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktop;

    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    @FindBy(xpath = "//div[@class='picture']//img[@title='Show details for Build your own computer']")
    WebElement buildYourOwnComputer;



    public void clickOnComputerLink() {

        clickOnElement(computerLink);
    }

    public void verifycomputerpagetitle(String title) {
        Reporter.log(" Comptuer page " + title + " dispalyed " + computerPageTitle.toString() + "<br>");
        verifyText(computerPageTitle, "Computers");
    }

    public void selectDesktopOption() {
        clickOnElement(computerLink);
        clickOnElement(desktop);

    }

    public void verifydesktoppagetitle(String title) {
        Reporter.log(" desktop page " + title + " dispalyed " + desktopText.toString() + "<br>");
        verifyText(computerPageTitle, "Desktops");
    }

    public void clickOnBuildYourOwnComputer() {
        Reporter.log(" desktop page " + buildYourOwnComputer.toString() + "<br>");
        clickOnElement(buildYourOwnComputer);

    }
}





