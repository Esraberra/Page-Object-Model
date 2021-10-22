package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class QAConcortPage {




   public WebDriver driver;

   public QAConcortPage()
   {
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
    ///////////////////////////
 @FindBy(partialLinkText = "Hotel List")
 public WebElement hotelList;

 @FindBy(partialLinkText = "Hotel Rooms")
 public WebElement hotelRooms;
///////////////////////////////
 @FindBy(className = "hidden-480")

 public WebElement ADDhotel;

 @FindBy(className = "hidden-480")

 public WebElement ADDhotelRoom;

/////////////////////////
 @FindBy(id = "Code")

 public WebElement ADDhotelKodBox;

 @FindBy (id = "IDGroup")
 public WebElement hotelTypeButton;

 @FindBy (xpath = "//option[text()='Hotel Type2']")
 public WebElement hotelType2;

 @FindBy (id = "btnSubmit")
public WebElement saveButton;
 @FindBy(xpath = "//button[@data-bb-handler='ok']")
 public WebElement alertButtonOK;

 @FindBy(xpath = "//div[@class='bootbox-body']")
 public WebElement successRegisterMessage;
 @FindBy(className = "caption-subject font-green-sharp bold uppercase")
 public WebElement ListOfHotelRoomsText;


 @FindBy(id="IDHotel")
 public WebElement selectHotel;

 @FindBy(xpath = "//thead/tr[1]/th")

 public List<WebElement> basliklarListesi;

 @FindBy(xpath = "//tbody")

 public WebElement tbodyTumu ;

 @FindBy(xpath = "//tbody//tr")

 public List<WebElement> tbodyTr;

 @FindBy(xpath = "//tbody/tr[1]")

 public WebElement birinciSatir ;

@FindBy(xpath = "//tbody/tr//td[4]")

public List<WebElement> dördüncüSütunListesi;

 public void ConcortHotelLogin(){
  Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
  QAConcortPage qaConcortPage=new QAConcortPage();
  qaConcortPage.Login.click();
  qaConcortPage.userNameBox.sendKeys(ConfigReader.getProperty("CHQAValidUsername"));
  qaConcortPage.passwordBox.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
  qaConcortPage.LoginButton.click();
 }






}

