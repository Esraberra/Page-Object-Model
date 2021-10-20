package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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







}

