package assignment.mobileAutomation.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailsPageObject {
    @AndroidFindBy(accessibility = "Watch")
    public MobileElement watchButton;

    @AndroidFindBy(id = "com.ebay.mobile:id/imageview_image")
    public MobileElement productDetailsPage;
}
