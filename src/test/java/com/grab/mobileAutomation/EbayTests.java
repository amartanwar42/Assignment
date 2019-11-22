package com.grab.mobileAutomation;

import assignment.mobileAutomation.pages.HomePage;
import assignment.mobileAutomation.pages.ProductDetailsPage;
import assignment.mobileAutomation.pages.ProductListPage;
import assignment.mobileAutomation.pages.SignInPage;
import assignment.mobileAutomation.utility.EbayUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class EbayTests extends BaseTest {

    @Test(groups = {"WATCHFLOW"})
    public void watchFlow(){
        new HomePage(driver)
                .searchProduct("TV")
                .clickOnSuggestion();

        new ProductListPage(driver)
                .selectHelpText()
                .sortLowest()
                .selectFirstProduct();

        ProductDetailsPage productDetailsPage= new ProductDetailsPage(driver)
                .clickOnWatch();

        new SignInPage(driver)
                .tapOnSignIn()
                .enterUserName("amar")
                .enterPassword("grab")
                .clickOnSignInCross()
                .clickOnCrossOnAllLoginPage();

        productDetailsPage.verifyProductDetailspage();
    }


    @Test(groups = {"GETPRODUCT"})
    public void getProduct() throws InterruptedException {
        new HomePage(driver)
                .searchProduct("TV")
                .clickOnSuggestion();

        new ProductListPage(driver)
                .selectHelpText()
                .sortLowest();

        EbayUtility ebayUtility = new EbayUtility(driver);
        ArrayList<String> products = ebayUtility.getProducts(10, driver);

        for (String productDetails:products) {
            System.out.println(productDetails);
        }
    }
}
