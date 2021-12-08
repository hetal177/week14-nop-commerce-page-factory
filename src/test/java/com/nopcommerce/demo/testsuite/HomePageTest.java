package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends TestBase {

        HomePage homePage;
        @BeforeMethod
        public void inIt(){
            homePage = new HomePage();
        }

    }

