package tests.day15;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_EndToEndTest {

    //1. Tests packagenin altına class olusturun: D17_CreateHotel
    //2. Bir metod olusturun: createHotel
    //3. https://qa-environment.concorthotel.com/ adresine git.
    //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
    //    a. Username : manager
    //    b. Password  : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna tıklayın.
    //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
    //10. OK butonuna tıklayın.

    @Test
    public void createHotel() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
        qaConcortPage.hotelManagement.click();
        qaConcortPage.hotelList.click();
        qaConcortPage.ADDhotel.click();

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(qaConcortPage.ADDhotelKodBox).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).sendKeys(faker.name().name()).sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).perform();

        qaConcortPage.hotelTypeButton.click();
        qaConcortPage.hotelType2.click();
        qaConcortPage.saveButton.click();
        String expectedSuccessMessage="Hotel was inserted successfully";
        Thread.sleep(3000);
        System.out.println("*****************");
        System.out.println(qaConcortPage.successRegisterMessage.getText());
        Assert.assertTrue(qaConcortPage.successRegisterMessage.isDisplayed());




    }





}
