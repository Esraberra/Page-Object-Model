package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonPage  {

    WebDriver driver;
//bir page sayfasi olusturulunca mutlaka yapmamiz gereken sey driver icin bir cons olusturup this driver=driver; yapmak

public AmazonPage(WebDriver driver)
{
    this.driver=driver;

    PageFactory.initElements(driver,this);
}
    @FindBy (id="twotabsearchtextbox")

    public WebElement aramaKutusu;

@FindBy (xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;

@FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
    public WebElement dropDownMenu;
@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public WebElement ilkÜrun;
}
