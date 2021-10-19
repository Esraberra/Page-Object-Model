package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

public class C02_ConcortHotelLoginNegative extends TestBase {
//Bir test method olustur NegativeLoginTest()
// https://www.concorthotel.com/ adresine git
// login butonuna bas
// test data username: manager1 ,
// test data password : manager1!
// Degerleri girildiginde sayfaya girilemedigini test et



    @Test
    public void test(){

        driver.get("https://www.concorthotel.com/");

        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);

        concortHotelPage.Login.click();

concortHotelPage.userNameBox.sendKeys("manager1");

concortHotelPage.passwordBox.sendKeys("manager1!");

concortHotelPage.LoginButton.click();
        Assert.assertTrue(concortHotelPage.isLoginFailed.isDisplayed(),"yazi görünmüyor FAILED");
    }


}
