package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

    WebDriver driver;
    // facebook login sayfasina gidin
// kullanici adi : techproed
// sifre : 12345
// yazdigimizda giris yapamadigimizi test edin
    public FacebookPage(WebDriver driver)
    {
        this.driver=driver;

        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
    public WebElement kullaniciAdi;
    @FindBy (xpath = "//input[@type='password']")
    public WebElement sifre;
@FindBy(xpath = "//div[@class='_9ay7']")
public WebElement girilemediYazisi;

public void cookiesGec(){
    driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
}





}