package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {
//Bir test method olustur positiveLoginTest()
// https://qa-environment.concorthotel.com/ adresine git
// login butonuna bas
//test data username: manager ,
//test data password : Manager1!
//Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
            public void positiveLoginTest(){

            Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.Login.click();
        qaConcortPage.userNameBox.sendKeys(ConfigReader.getProperty("CHQAValidUsername"));
        qaConcortPage.passwordBox.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
        qaConcortPage.LoginButton.click();
        Assert.assertTrue(qaConcortPage.basariliGrisiYaziElementi.isDisplayed());
    }










}
