package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class TumKategorilerSearchPage {

    public TumKategorilerSearchPage() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);

    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Tüm Kategoriler\"]")
    public MobileElement TumKategoriler;


    @FindBy(id = "com.pozitron.hepsiburada:id/etSearchBox")
    public MobileElement SearchBox;

    @FindBy(id = "com.pozitron.hepsiburada:id/lytOptionBarFilters")
    public MobileElement OptionBarFilters;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.pozitron.hepsiburada:id/tvFilterName\" and @text=\"Fiyat Aralığı\"]")

    public MobileElement FiyatAraligi;

    @FindBy(id = "com.pozitron.hepsiburada:id/clMinPrice")

    public MobileElement MinFiyat;

    @FindBy(id = "com.pozitron.hepsiburada:id/clMaxPrice")

    public MobileElement MaxFiyat;

    @FindBy(id = "com.pozitron.hepsiburada:id/flFiltersListingBottom")

    public MobileElement FilterButtom;


    @FindBy(id = "com.pozitron.hepsiburada:id/tvApplyFilterButton")

    public MobileElement UrunleriGor;


    @FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.pozitron.hepsiburada:id/ivProduct\"])[3]")

    public MobileElement Urun;


    @FindBy(id = "com.pozitron.hepsiburada:id/product_detail_add_to_cart")

    public MobileElement SepeteEkle;

    public CharSequence minfiyat(int min){
        MinFiyat.sendKeys(minfiyat(min));

        return null;
    }

    public CharSequence maxfiyat(int max){
        MinFiyat.sendKeys(maxfiyat(max));

        return null;
    }



}
