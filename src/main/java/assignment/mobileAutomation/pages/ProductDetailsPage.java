package assignment.mobileAutomation.pages;

import assignment.mobileAutomation.pageObjects.ProductDetailsPageObject;
import assignment.mobileAutomation.utility.AppiumUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductDetailsPage extends AppiumUtility {

    private ProductDetailsPageObject productDetailsPageObject;

    public ProductDetailsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        productDetailsPageObject=new ProductDetailsPageObject();
        PageFactory.initElements(new AppiumFieldDecorator(driver),productDetailsPageObject);
    }

    public ProductDetailsPage clickOnWatch(){
        waitForElementToBeVisible(productDetailsPageObject.productDetailsPage);
        scrollDown(3);
        waitForElementToBeClickable(productDetailsPageObject.watchButton).click();
        return this;
    }

    public ProductDetailsPage verifyProductDetailspage(){
        try{
            waitForElementToBeVisible(productDetailsPageObject.watchButton);
        }
        catch (Exception e){
            Assert.fail("Failed to find the product details page");
        }
        return this;
    }
}
