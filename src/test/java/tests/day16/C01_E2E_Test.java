package tests.day16;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_E2E_Test {
/*
3. https://qa-environment.concorthotel.com/ adresine gidin.
 4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
 a. Username : manager  b. Password  : Manager1!
 5. Login butonuna tıklayın.
 6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
 7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
 8. Save butonuna basin.
 9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
10. OK butonuna tıklayın.
11. Hotel rooms linkine tıklayın.
12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
 */
@Test
    public void roomCreateTest() throws InterruptedException {

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
    qaConcortPage.alertButtonOK.click();
    qaConcortPage.hotelRooms.click();
    qaConcortPage.ADDhotelRoom.click();

    }


}
