package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BuildYourOwnComputerPage extends Utility {
    @FindBy(id = "product_attribute_1")
    WebElement selectProcessor;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    WebElement verifyPrice;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addCartButton;
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement addedToCartMessage;
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeTab;

    public void setSelectProcessor(String processor) {

     selectByVisibleTextFromDropDown(selectProcessor, processor);
    }

    public void setSelectRam(String ram) {
        selectByVisibleTextFromDropDown(selectRam, ram);
    }

    public void clickOnHdd(String hdd) {
        clickOnElement(By.xpath("//label[contains(text(),'" + hdd + "')]"));
    }

    public void clickOnOS(String os) {
        clickOnElement(By.xpath("//label[contains(text(),'" + os + "')]"));
    }

    public void setSelectSoftware(String software) {
        if (software == "Microsoft Office [+$50.00]") {
            clickOnElement(By.xpath("//label[contains(text(),'" + software + "')]"));
            clickOnElement(By.xpath("//label[contains(text(),'" + software + "')]"));
        } else {
            clickOnElement(By.xpath("//label[contains(text(),'" + software + "')]"));
        }
    }

    public void clickOnAddToCart() {
        clickOnElement(addCartButton);
    }

    public void verifyMessageProductsAddedToShoppingCart() {
        String expText = "The product has been added to your shopping cart";
        String actText=getTextFromElement(addedToCartMessage);

        Assert.assertEquals(expText, actText, "Product added to cart message not displayed");
    }

}

