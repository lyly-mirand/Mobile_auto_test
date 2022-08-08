import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class switchCkick {

    @Test
    public void switchCkick() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities1 = new DesiredCapabilities();
        capabilities1.setCapability("deviceName", "Pixel");
        capabilities1.setCapability("udid", "emulator-5554");
        capabilities1.setCapability("platformName", "Android");
        capabilities1.setCapability("platformVertion", "11");
        capabilities1.setCapability("app", "C:\\Users\\ea_samigullaeva\\Downloads\\Android-NativeDemoApp-0.2.1.apk");

        MobileDriver driver1 = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities1);
        Thread.sleep(2000);

        MobileElement openPage = (MobileElement) driver1.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
        openPage.click();
        Thread.sleep(2000);

        MobileElement switchClick = (MobileElement) driver1.findElementByAccessibilityId("switch");
        switchClick.click();
        driver1.quit();


    }
}
