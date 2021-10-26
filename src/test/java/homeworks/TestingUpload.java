package homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestingUpload {
    /*
    Uploading a file from Desktop to https://www.naukri.com/

    with TestNg
     */

    WebDriver driver;

    @BeforeMethod

public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();


    driver.get("https://demoqa.com/upload-download");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}


    @Test
    public void test(){
        String fileXpath="/Users/esrakucuk/Desktop";
        //locate element:file_upload
    //  String projectDir=  System.getProperty("user.dir");
       // WebElement bewerbenButton=driver.findElement(By.linkText("Jetzt bewerben"));
      //  bewerbenButton.click();
        WebElement uploadButton =driver.findElement(By.id("uploadFile"));
        uploadButton.sendKeys(fileXpath);
        SoftAssert softAssert=new SoftAssert();

String actualText=driver.findElement(By.id("uploadedFilePath")).getText();
String expectedText="C:\\fakepath\\Desktop";
softAssert.assertEquals(actualText,expectedText,"file has not been uploaded failed!!!");
softAssert.assertAll();
    }

@AfterMethod
    public void tearDown(){
        driver.close();
}





}





