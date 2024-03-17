package stepdefinitions;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApkKurulumu {
    AndroidDriver<AndroidElement>driver;


    @Given("Hepsiburada {string} {string} {string} {string} {string} cihazında uygulama kurulur")
    public void hepsiburada_cihazında_uygulama_kurulur(String cihazismi, String versionName, String platformname, String AutomationName, String dosyayolu) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,cihazismi);// capabilities.setCapability("deviceName","Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,versionName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformname);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName);
        capabilities.setCapability(MobileCapabilityType.APP,dosyayolu);
        // UiAutomator 2 otomasyon ismi sadece android 6 dan yuksek olan android sistemleri icin calisir
        // UiAutomator otomasyon ismi sadece android 6 ve 6 dan dusuk olan android sistemleri icin calisir
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(10000);
    }


}
