package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class UltimateQAPage {



public WebDriver driver;

public UltimateQAPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}



    @FindBy(id = "user[first_name]")
    public WebElement firstName;


    @FindBy(id = "user[last_name]")
    public WebElement lastName;

    @FindBy(id = "user[email]")
    public WebElement eMail;

    @FindBy(id = "user[password]")
    public WebElement password;

    @FindBy(id ="user[terms]" )
    public WebElement termsConditions;

@FindBy(xpath = "//input[@type='submit']")
public WebElement signUpButton;

    public String ilkwindow=Driver.getDriver().getWindowHandle();
public void login(){

    Driver.getDriver().get(ConfigReader.getProperty("ultimateQaSignUp"));

    UltimateQAPage ultimateQAPage=new UltimateQAPage();
    Faker faker=new Faker();
    ultimateQAPage.firstName.sendKeys(faker.name().firstName());
    ultimateQAPage.lastName.sendKeys(faker.name().lastName());
    ultimateQAPage.eMail.sendKeys(faker.internet().emailAddress());
    ultimateQAPage.password.sendKeys(faker.internet().password());
    ultimateQAPage.termsConditions.click();
    ultimateQAPage.signUpButton.click();
}





}
