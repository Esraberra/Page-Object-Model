package tests.day25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TestwithDataProvider {


    @DataProvider
    public static Object[] aranacakKelimeListesi() {
        String arr[]={"Nutella", "Java","Apple"};
        return arr;
    }



    @Test(dataProvider = "aranacakKelimeListesi")
    public void test(String aranacak) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(aranacak+Keys.ENTER);        // parametre olarak girilen deger icin arama yapin
        // sonuc sayisini yazdirin ve sonuc yazisinin aradigimiz parametre degerini icerdigini test edin
        Thread.sleep(3000);
        WebElement sonucYazisiElementi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println(sonucYazisiElementi.getText());

        Assert.
                assertTrue(sonucYazisiElementi.getText().
                        contains(aranacak));

    }
}