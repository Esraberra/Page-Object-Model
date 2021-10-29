package tests.day19;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Arrays;

public class C03__Raporlama extends TestBaseRapor {

    @Test
    public void test1(){
        extentTest=extentReports.createTest("nutella testi");
        Driver.getDriver().get("https://www.amazon.com");
        extentTest.info("istenen adrese gidildi");
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        extentTest.info("nutella arandi");
        WebElement sonucSayisiElementi=Driver.getDriver().findElement(By.xpath("//span[@dir='auto']"));
String actualText=Driver.getDriver().findElement(By.xpath("//span[@dir='auto']")).getText();
String sonucArray[]=actualText.split(" ");
int sonucSayisi=Integer.parseInt(sonucArray[2]);
Assert.assertTrue(sonucSayisi<1000);
extentTest.info("sonuc sayisi 1000``den kücük");

    }

    @Test
    public void test2(){
        extentTest=extentReports.createTest("Samsung testi","Sonuc saiyisi 1000``en az olmali");
        // amazon sayfasina gidip

        Driver.getDriver().get("https://www.amazon.com");
        extentTest.info("amazon sayfasina gidildi");

        // samsung icin arama yapalim

        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        // sonuc sayisinin 1000'den az oldugunu test edelim
aramaKutusu.sendKeys("Samsung"+Keys.ENTER);
        extentTest.info("samsung icin arama yapildi");

WebElement sonucSayisiElementi=Driver.getDriver().findElement(By.xpath("//span[@dir='auto']"));

//1-48 of 130 results for

        String sonucYazisi=sonucSayisiElementi.getText();
        String sonucArrayi[]=sonucYazisi.split(" ");
        //[3] indexi 3. olan kelimeyi getirir.
        String sonucAdedi=sonucArrayi[3];

        sonucAdedi=sonucAdedi.replace(",","");

        System.out.println(sonucAdedi);

        int sayi=Integer.parseInt(sonucAdedi);

        extentTest.info("sonu yazisi int haline getirildi");

        Assert.assertTrue(sayi<1000);

        extentTest.pass("sonuc sayisinin 1000'den az oldugu test edildi");
    }

    @Test
    public void test3(){
        // amazon sayfasina gidip
        // electronic kategorisinde java icin arama yapalim

        extentTest=extentReports.createTest("java testi","ilk urunde java olmali");

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        extentTest.info("amazona gidildi");

        Select select=new Select(Driver.getDriver().findElement(By.id("searchDropdownBox")));

        select.selectByVisibleText("Electronics");

        extentTest.info("dropdown dan electronics secildi");

        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Java"+Keys.ENTER);

        extentTest.info("java kelimesi aratildi");

        // cikan sonuclardan ilkinin isminde java oldugunu test edelim

        WebElement ikinciUrun=Driver.getDriver().findElement(By.xpath("(//div[@class='s-expand-height s-include-content-margin s-latency-cf-section s-border-bottom'])[1]"));

        String ikinciElementYazisi=ikinciUrun.getText();

        Assert.assertTrue(ikinciElementYazisi.contains("Java"));

        extentTest.pass("ilk urun isminde java oldugu test edildi");
    }






}
