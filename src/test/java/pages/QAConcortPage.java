package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class QAConcortPage {




   public WebDriver driver;
   public QAConcortPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement Login;

    @FindBy(id = "UserName")
    public  WebElement userNameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement LoginButton;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement basariliGrisiYaziElementi;

    @FindBy (xpath = "//*[.='Try again please']")
    public WebElement isLoginFailed;

    @FindBy(xpath = "//span[text()='Hotel Management']")

 public WebElement hotelManagement;
 @FindBy(partialLinkText = "Hotel List")
 public WebElement hotelList;

 @FindBy(className = "hidden-480")

 public WebElement ADDhotel;

 @FindBy(id = "Code")

 public WebElement ADDhotelKodBox;



 public void ConcortHotelLogin(){
  Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
  QAConcortPage qaConcortPage=new QAConcortPage();
  qaConcortPage.Login.click();
  qaConcortPage.userNameBox.sendKeys(ConfigReader.getProperty("CHQAValidUsername"));
  qaConcortPage.passwordBox.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
  qaConcortPage.LoginButton.click();
 }






}

