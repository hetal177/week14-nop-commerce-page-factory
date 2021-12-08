package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {


    ComputerPage computerpage;
    BuildYourOwnComputerPage buildYourOwnComputer;

    @BeforeMethod
    public void inIt() {
        computerpage = new ComputerPage();
        buildYourOwnComputer = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity", "Regression"})

    public void VerifyUserShouldNavigateToComputerPageSuccessfully() {

        computerpage.clickOnComputerLink();
        computerpage.verifycomputerpagetitle("Computers");
        computerpage.selectDesktopOption();

    }

    @Test(groups = {"Smoke", "Regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        computerpage.clickOnComputerLink();
        computerpage.selectDesktopOption();
        computerpage.verifydesktoppagetitle("Desktops");
    }

    @Test(dataProvider = "build your own computer", dataProviderClass = TestData.class,groups ={"Regression"})
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
        computerpage.clickOnComputerLink();
        computerpage.selectDesktopOption();
        computerpage.verifydesktoppagetitle("Desktops");
        computerpage.clickOnBuildYourOwnComputer();
        buildYourOwnComputer.setSelectProcessor(processor);
        buildYourOwnComputer.setSelectRam(ram);
        buildYourOwnComputer.clickOnHdd(hdd);
        buildYourOwnComputer.clickOnOS(os);
        buildYourOwnComputer.setSelectSoftware(software);
        buildYourOwnComputer.clickOnAddToCart();
        buildYourOwnComputer.verifyMessageProductsAddedToShoppingCart();
    }
}
