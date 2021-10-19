package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C05_ConcortHotelTest extends TestBase {


    //https://www.concorthotel.com/ adresine git
    //    login butonuna bas
    //    test data username: manager1 ,
    //    test data password : manager1!
    //    Degerleri girildiginde sayfaya girilemedigini test et

    @Test
    public void test(){
        driver.get(ConfigReader.getProperty("CHUrl"));
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        concortHotelPage.Login.click();
        concortHotelPage.userNameBox.sendKeys(ConfigReader.getProperty("CHInvalidUsername"));
        concortHotelPage.passwordBox.sendKeys(ConfigReader.getProperty("CHInvalidPassword"));
        concortHotelPage.LoginButton.click();
        Assert.assertTrue(concortHotelPage.isLoginFailed.isDisplayed());

    }



}
