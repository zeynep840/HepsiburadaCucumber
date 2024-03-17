package stepdefinitions;


import Pages.HepsiBuradaPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;


public class LoginControl {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();

HepsiBuradaPage hepsiburada=new HepsiBuradaPage();


    @Given("Hesabim Butonu ve Giris Yap Butonuna Tiklanir")
    public void hesabim_butonu_ve_giris_yap_butonuna_tiklanir() throws InterruptedException {
        hepsiburada.hesabim.click();
        hepsiburada.GirisYap.click();

    }


    @Given("Kullanıcı girisi butonuna tiklanir ve email {string} yazilir")
    public void kullanıcı_girisi_butonuna_tiklanir_ve_email_yazilir(String Email) throws InterruptedException {
        Thread.sleep(5000);
        hepsiburada.Eposta.click();
        hepsiburada.Eposta.click();
        hepsiburada.Eposta.sendKeys(Email);


    }
    @Given("Giris Yap butonuna tiklanir")
    public void giris_yap_butonuna_tiklanir() {
        hepsiburada.LoginGirisYap.click();

    }
    @Given("Sifre {string} Yazilir ve Giris Yap butonuna tiklanir")
    public void sifre_yazilir_ve_giris_yap_butonuna_tiklanir(String sifre) throws InterruptedException {
        Thread.sleep(7000);
        hepsiburada.SifreGiris.sendKeys(sifre);
        hepsiburada.SifreGirisButton.click();

    }

    @Given("Kullanici girisi yapildigi dogrulanir")
    public void kullanici_girisi_yapildigi_dogrulanir() throws IOException {

        Assert.assertTrue(hepsiburada.HosgeldinPopup.isDisplayed());
        ReusableMethods.getScreenshot("Kosumrapor");

    }


}
