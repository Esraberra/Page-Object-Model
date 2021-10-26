package homeworks;



import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HrsHotelTest {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void HrsHotel() throws InterruptedException {

        //1-Hotel Reservierung Sitesine gidiniz(https://www.hrs.de/)
        driver.get("https://www.hrs.de/");
        //2-Site acilisinda Cookiesleri kabul et
        WebElement cookies=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookies.click();
        //3-Registrieren buttonuna tiklayiniz
        WebElement registrieren= driver.findElement(By.xpath("//a[@id='RegistrationButton']"));
        registrieren.click();
        Thread.sleep(3000);
        //4-Vorname -Nachname-Email-Onay klikleme yapiniz
        driver.switchTo().frame(4);
        WebElement vorname= driver.findElement(By.xpath("//div//input[@placeholder='Max']"));
        vorname.click();
        Faker faker=new Faker();
        Actions actions=new Actions(driver); // mouse tiklama icin actions olusturduk
        actions.click(vorname)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password(6,12))
                .sendKeys(Keys.TAB).sendKeys().click().perform();
        //5-ve son olarak "Jetz kostenlos anmelden" butonuna tiklama yapiniz
        WebElement anmelden= driver.findElement(By.xpath("ve son olarak \"Jetz kostenlos anmelden\" butonuna tiklama"));
        anmelden.click();

    }
}