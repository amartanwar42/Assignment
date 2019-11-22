package assignment.mobileAutomation.utility;

import assignment.mobileAutomation.pages.ProductListPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.ArrayList;

public class EbayUtility  extends AppiumUtility{

    ProductListPage productListPage;
    public EbayUtility(AppiumDriver<MobileElement> driver) {
        super(driver);
        productListPage=new ProductListPage(driver);
    }


    public ArrayList getProducts(int n, AppiumDriver driver) throws InterruptedException {
        ArrayList<String> arrayList= new ArrayList();

        for (int i=1;i<=n;i++){
            String productDetails = this.getProductDetails(1);
            arrayList.add(productDetails);
        }
      return arrayList;

    }

    public String getProductDetails(int index){
        String details = null;

        if(index>0){

            productListPage.verifyListPage();
            WebElement element = driver.findElement(By.xpath(String.format("(//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[%s]/android.widget.LinearLayout[1]/android.widget.TextView)[1]", index+1)));
            String productName = element.getText();

            WebElement element1 = driver.findElement(By.xpath(String.format("(//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[%s]/android.widget.LinearLayout[1]/android.widget.TextView)[1]/../..//android.widget.TextView[contains(@content-desc,'$')]", index+1)));
            String productPrice = element1.getText();

            details=String.format("Product Name: %s  Product Price: %s",productName,productPrice);
            scrollDown(3);
            return details;
        }

        else {
            Reporter.log("Please enter value greater than 0",true);
        }
        return details;
    }

}
