package assignment.mobileAutomation.utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class AppiumUtility {
    public AppiumDriver driver;
    Logger logger = Logger.getLogger(AppiumUtility.class);

    public AppiumUtility(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public WebElement waitForElementToBeClickable(WebElement id) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(id));
        return id;
    }

    public WebElement waitForElementToBeClickable(WebElement id, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(id));
        return id;
    }

    public WebElement waitForElementToBeVisible(WebElement id) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfAllElements(id));
        return id;
    }


    public void swipe(int startX, int startY, int endX, int endY, int durationInMilliSeconds) {
        new TouchAction(driver)
                .press(point(startX, startY))
                .waitAction(waitOptions(Duration.ofMillis(durationInMilliSeconds)))
                .moveTo(point(endX, endY)).release().perform();
        Reporter.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Swipe done",true);
    }

    public void scrollDown(int n) {
        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();
        Reporter.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Swipe started",true);
        swipe(width / 2, height * 2 / 3, width / 2, height / n, 1000);

    }

    public void sleepWait(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
