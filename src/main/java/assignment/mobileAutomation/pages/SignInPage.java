package assignment.mobileAutomation.pages;

import assignment.mobileAutomation.pageObjects.SignInPageObject;
import assignment.mobileAutomation.utility.AppiumUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends AppiumUtility {

    private SignInPageObject signInPageObject;

    public SignInPage(AppiumDriver driver) {
        super(driver);
        signInPageObject=new SignInPageObject();
        PageFactory.initElements(new AppiumFieldDecorator(driver),signInPageObject);
    }

    public SignInPage tapOnSignIn(){
        waitForElementToBeClickable(signInPageObject.loginButton).click();
        return this;
    }

    public SignInPage enterUserName(String userName){
        waitForElementToBeClickable(signInPageObject.userName).sendKeys(userName);
        return this;
    }

    public SignInPage enterPassword(String password){
        waitForElementToBeClickable(signInPageObject.password).sendKeys(password);
        return this;
    }

    public SignInPage clickOnSignInCross(){
        waitForElementToBeClickable(signInPageObject.cross).click();
        return this;
    }

    public SignInPage clickOnCrossOnAllLoginPage(){
        waitForElementToBeVisible(signInPageObject.createAccount);
        waitForElementToBeClickable(signInPageObject.cross).click();
        return this;
    }

}
