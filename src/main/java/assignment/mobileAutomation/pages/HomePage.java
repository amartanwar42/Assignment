package assignment.mobileAutomation.pages;

import assignment.mobileAutomation.pageObjects.HomePageObject;
import assignment.mobileAutomation.utility.AppiumUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends AppiumUtility {

    private HomePageObject homePageObject;
    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        homePageObject=new HomePageObject();
        PageFactory.initElements(new AppiumFieldDecorator(driver), homePageObject);
    }

    public HomePage searchProduct(String product){
        waitForElementToBeClickable(homePageObject.searchBox,30).click();
        waitForElementToBeClickable(homePageObject.searchTextBox,30).sendKeys(product);
        return this;
    }

    public HomePage clickOnSuggestion(){
        waitForElementToBeClickable(homePageObject.suggestion,30).click();
        return this;
    }

}
