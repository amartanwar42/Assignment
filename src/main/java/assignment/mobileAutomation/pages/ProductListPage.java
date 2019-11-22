package assignment.mobileAutomation.pages;

import assignment.mobileAutomation.pageObjects.ProductListPageObject;
import assignment.mobileAutomation.utility.AppiumUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage extends AppiumUtility {

    private ProductListPageObject productListPageObject;
    public ProductListPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        productListPageObject= new ProductListPageObject();
        PageFactory.initElements(new AppiumFieldDecorator(driver),productListPageObject);
    }

    public ProductListPage selectHelpText(){
        waitForElementToBeClickable(productListPageObject.helpText,30).click();
        return this;
    }

    public ProductListPage sortLowest(){
        waitForElementToBeClickable(productListPageObject.sortButton).click();
        waitForElementToBeClickable(productListPageObject.lowestPrice,30).click();
        return this;
    }

    public ProductListPage selectFirstProduct(){
        waitForElementToBeClickable(productListPageObject.firstProduct,30).click();
        return this;
    }

    public ProductListPage verifyListPage(){
        waitForElementToBeClickable(productListPageObject.firstProduct,30);
        return this;
    }
}
