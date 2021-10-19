package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C03_PositiveTestConfigReader extends TestBase {

    //1 ) Bir Class olustur : PositiveTest
    //2) Bir test method olustur positiveLoginTest()
    // https://www.concorthotel.com/ adresine git
    // login butonuna bas
    // test data username: manager ,
    // test data password : Manager1!
    // Degerleri girildiginde sayfaya basaril

    @Test
    public void positiveTestConfig()
    {
        driver.get(ConfigReader.getProperty("CHUrl"));
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);

        concortHotelPage.Login.click();

        concortHotelPage.userNameBox.sendKeys(ConfigReader.getProperty("CHValidUsername"));
        concortHotelPage.passwordBox.sendKeys(ConfigReader.getProperty("CHValidPassword"));
        concortHotelPage.LoginButton.click();

        Assert.assertTrue(concortHotelPage.basariliGrisiYaziElementi.isDisplayed());


    }






}
