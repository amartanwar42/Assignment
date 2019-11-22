package assignment.mobileAutomation.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObject {
    @AndroidFindBy(id = "com.ebay.mobile:id/search_box")
    public MobileElement searchBox;

    @AndroidFindBy(id = "com.ebay.mobile:id/search_src_text")
    public MobileElement searchTextBox;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement suggestion;
}
