package tests.day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_WindowHandleRaporlu extends TestBaseRapor {
    @Test
    public void testReusableIle(){
        extentTest=extentReports.createTest("window handle test","new window yazisini test eder");

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("istenen adrese gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("istenen linke tiklandi");
        ReusableMethods.switchToWindow("New Window");
        extentTest.info("yeni sayfaya gecildi");
        WebElement newWindowYaziElementi=Driver.getDriver().findElement(By.tagName("h3"));
        extentTest.info("test edecegimiz yazi locate edildi");
        Assert.assertTrue(newWindowYaziElementi.isDisplayed());
        extentTest.info("yazinin görünür oldugu test edildi");

    }







}
