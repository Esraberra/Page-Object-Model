package tests.day14;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C04_AmazonConfigReader extends TestBase {
// amazon sayfasina gidip
// nutella icin arama yapin
// sonuc sayisini yazdirin ve sonuc yazisinin nutella icerdigini test edin


    @Test
    public void test(){
        driver.get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage=new AmazonPage(driver);

        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonSearchWord"), Keys.ENTER);

        System.out.println(amazonPage.sonucYazisiElementi.getText());

        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains(ConfigReader.getProperty("amazonSearchWord")));
    }





}
