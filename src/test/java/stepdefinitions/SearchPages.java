package stepdefinitions;

import Pages.HepsiBuradaPage;
import Pages.TumKategorilerSearchPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import utils.ReusableMethods;
import java.io.IOException;

public class SearchPages {

    TumKategorilerSearchPage search= new TumKategorilerSearchPage();
    HepsiBuradaPage hepsiburada= new HepsiBuradaPage();
    @Given("Hepsiburada uygulamasi acilir Tuum Kategoriler tiklanir Arama barinda Lenovo {string} aratilir")
    public void hepsiburada_uygulamasi_acilir_tuum_kategoriler_tiklanir_arama_barinda_lenovo_aratilir(String aranilacak_icerik) throws InterruptedException {
        Assert.assertTrue(hepsiburada.hesabim.isDisplayed());
        Thread.sleep(3000);
         search.TumKategoriler.click();
         search.SearchBox.sendKeys(aranilacak_icerik+ Keys.ENTER);
    }
    @Given("Fiyat Araligi filtresi tiklanir")
    public void fiyat_araligi_filtresi_tiklanir() {
        search.OptionBarFilters.click();


    }
    @Given("Min {int} fiyat araligi uygulanir")
    public void min_fiyat_araligi_uygulanir(int min) throws InterruptedException {
        search.FiyatAraligi.click();
        search.MinFiyat.click();

        search.FilterButtom.click();
        Thread.sleep(1000);
        search.UrunleriGor.click();
        search.minfiyat(min);



    }

    @Given("Max {int} fiyat araligi uygulanir")
    public void max_fiyat_araligi_uygulanir(int max) throws InterruptedException {

        Thread.sleep(1000);

        search.maxfiyat(max);



    }
    @Given("Listelenen urunlerden birinin detayina gidilir")
    public void listelenen_urunlerden_birinin_detayina_gidilir() {
        search.Urun.click();

    }

    @Given("Sepete Ekle butonunun gorundugu dogrulanir")
    public void sepete_ekle_butonunun_gorundugu_dogrulanir() throws IOException {

        Assert.assertTrue(search.SepeteEkle.isDisplayed());
        ReusableMethods.getScreenshot("Kosumrapor");




    }

}
