package Pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.ApkKurulumu;
import utils.Driver;
import java.time.Duration;

public class HepsiBuradaPage {

    public HepsiBuradaPage() {

       PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);

    }
    @FindBy(id = "com.pozitron.hepsiburada:id/menuItemAccountFakeView")
    public MobileElement hesabim;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.pozitron.hepsiburada:id/button\" and @text=\"Giriş yap\"]")

    public MobileElement GirisYap;

    @FindBy(xpath = "//android.widget.EditText")

    public MobileElement Eposta;
    @FindBy(xpath = "//android.widget.Button[@text=\"Giriş yap\"]")

    public MobileElement LoginGirisYap;
    @FindBy(xpath = "//android.widget.EditText")

    public MobileElement SifreGiris;

    @FindBy(xpath = "//android.widget.Button[@text=\"Giriş yap\"]")

    public MobileElement SifreGirisButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/message\"]")

    public MobileElement HosgeldinPopup;





}

