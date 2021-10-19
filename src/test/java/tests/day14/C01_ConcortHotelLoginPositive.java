package tests.day14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

public class C01_ConcortHotelLoginPositive extends TestBase {
    //1 ) Bir Class olustur : PositiveTest
    //2) Bir test method olustur positiveLoginTest()
    // https://www.concorthotel.com/ adresine git
    // login butonuna bas
    // test data username: manager ,
    // test data password : Manager1!
    // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void positiveTest()

    {
        driver.get("https://www.concorthotel.com/");

        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        concortHotelPage.Login.click();
        concortHotelPage.userNameBox.sendKeys("manager");
        concortHotelPage.passwordBox.sendKeys("Manager1!");
        concortHotelPage.LoginButton.click();

        Assert.assertTrue(concortHotelPage.basariliGrisiYaziElementi.isDisplayed());
    }
}
