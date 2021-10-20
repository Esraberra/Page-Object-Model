package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
//1) smokeTest paketi altinda yeni bir Class olustur: NegativeTest
//3 Farkli test Methodunda 3 senaryoyu test et
// - yanlisSifre
// - yanlisKulllanici
// - yanlisSifreKullanici
//test data yanlis username: manager1 , yanlis password : manager1!
//2) https://qa-environment.concorthotel.com/ adresine git
//3) Login butonuna bas
//4) Verilen senaryolar ile giris yapilamadigini test et
    @Test
    public void falseUserName(){

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.Login.click();
        qaConcortPage.userNameBox.sendKeys("CHQAInvalidUsername");
        qaConcortPage.passwordBox.sendKeys("CHQAValidPassword");
        qaConcortPage.LoginButton.click();
        Assert.assertTrue(qaConcortPage.isLoginFailed.isDisplayed());

    }
      @Test
    public void falsePassword(){

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.Login.click();
        qaConcortPage.userNameBox.sendKeys("CHQAValidUsername");
        qaConcortPage.passwordBox.sendKeys("CHQAInvalidPassword");
        qaConcortPage.LoginButton.click();
        Assert.assertTrue(qaConcortPage.isLoginFailed.isDisplayed());

    }

      @Test
    public void falsePasswordandUser(){

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.Login.click();
        qaConcortPage.userNameBox.sendKeys("CHQAInvalidUsername");
        qaConcortPage.passwordBox.sendKeys("CHQAInvalidPassword");
        qaConcortPage.LoginButton.click();
        Assert.assertTrue(qaConcortPage.isLoginFailed.isDisplayed());

        Driver.closeDriver();
    }
}


