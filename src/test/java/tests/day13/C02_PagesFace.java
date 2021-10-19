package tests.day13;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class C02_PagesFace extends TestBase {

    @Test
    public void test(){
        driver.get("https://www.facebook.com");
        FacebookPage page=new FacebookPage(driver);
    page.cookiesGec();
        page.kullaniciAdi.sendKeys("techproed");
        page.sifre.sendKeys("12234"+ Keys.ENTER);
        Assert.assertTrue(page.girilemediYazisi.isDisplayed(),"Failed");
    }



}
