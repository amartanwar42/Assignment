package assignment.mobileAutomation.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductListPageObject {
    @AndroidFindBy(accessibility = "When you save a search, we'll let you know when a new item is listed double tap to dismiss")
    public MobileElement helpText;

    @AndroidFindBy(id = "com.ebay.mobile:id/button_sort")
    public MobileElement sortButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.CheckedTextView")
    public MobileElement lowestPrice;

    @AndroidFindBy( xpath= "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")
    public MobileElement firstProduct;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]")
    public MobileElement productName;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.TextView")
    public MobileElement productPrice;
}
