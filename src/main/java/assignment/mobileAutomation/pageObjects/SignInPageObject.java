package assignment.mobileAutomation.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInPageObject {
    @AndroidFindBy(id = "com.ebay.mobile:id/button_classic")
    public MobileElement loginButton;

//    @AndroidFindBy(id = "om.ebay.mobile:id/edit_text_username")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email or username']")
    public MobileElement userName;

    @AndroidFindBy(id = "com.ebay.mobile:id/et_temp")
    public MobileElement password;

    @AndroidFindBy(id="com.ebay.mobile:id/home")
    public MobileElement cross;

    @AndroidFindBy(id="com.ebay.mobile:id/title")
    public MobileElement title;

    @AndroidFindBy(id="com.ebay.mobile:id/button_create_account")
    public MobileElement createAccount;


}
