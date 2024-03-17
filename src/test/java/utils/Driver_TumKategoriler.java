package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver_TumKategoriler {





       private static AndroidDriver<AndroidElement> appiumDriver;
        private static IOSDriver<IOSElement> iosDriver;

        static final String TELEFONADI="PIXEL 2";
        static final String ANDROIDVERSION="10.0";
        static final String PLATFORM="Android";
        static final String OTOMASYON_ISMI="UiAutomator2";



        public static AndroidDriver getAndroidDriver()  {
            URL appiumServerURL = null;
            try {
                appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            if (appiumDriver == null) {

                DesiredCapabilities caps =new DesiredCapabilities();
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, TELEFONADI);
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ANDROIDVERSION);
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM);
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, OTOMASYON_ISMI);
                caps.setCapability("appPackage","com.pozitron.hepsiburada");
                caps.setCapability("appActivity","com.hepsiburada.ui.product.list.filters.item.FilterItemListActivity - Hepsiburaday");
                caps.setCapability(MobileCapabilityType.NO_RESET,false);


                if (ConfigReader.getProperty("platformName").equals("Android")) {

                    assert appiumServerURL != null;
                    appiumDriver = new AndroidDriver<AndroidElement>(appiumServerURL,caps);
                    appiumDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                }else {

                    assert appiumServerURL != null;
                    iosDriver = new IOSDriver<IOSElement>(appiumServerURL,caps);
                    iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

                    throw new UnsupportedOperationException("iOS CİHAZLARDA KULLANILMAZ");

                }

            }

            return appiumDriver;
        }


        public static void quitAppiumDriver(){
            if (appiumDriver != null) {
                appiumDriver.closeApp();
                appiumDriver = null;
            }
        }
    }

