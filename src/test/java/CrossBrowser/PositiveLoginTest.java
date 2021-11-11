package CrossBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class PositiveLoginTest extends TestBaseCross {
//Bir test method olustur positiveLoginTest()
// https://qa-environment.concorthotel.com/ adresine git
// login butonuna bas
//test data username: manager ,
//test data password : Manager1!
//Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void positiveLoginTest(){
        // cross browser testte test base class'ina geri donuyoruz
        // bunun sebebi @parameters notasyanu
        // dolayisiyla Driver.getDriver() ve pages sayfalarindaki locator'lari kullanamayiz

        //Bir test method olustur positiveLoginTest()
        //https://qa-environment.concorthotel.com/ adresine git

        driver.get(ConfigReader.getProperty("CHQAUrl"));


        //login butonuna bas
        driver.findElement(By.linkText("Log in")).click();
        //test data username: manager ,

        driver.findElement(By.id("UserName")).sendKeys(ConfigReader.getProperty("CHQAValidUsername"));
        //test data password : Manager1!

        driver.findElement(By.id("Password")).sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
        Thread.sleep(4000);
        driver.findElement(By.id("btnSubmit")).click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        WebElement basariliGirisYaziElementi=driver.findElement(By.xpath("//span[text()='ListOfUsers']"));
        Assert.assertTrue(basariliGirisYaziElementi.isDisplayed());



    }










}
