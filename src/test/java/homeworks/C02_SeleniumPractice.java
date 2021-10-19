package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C02_SeleniumPractice extends TestBase {

// 1) https://gmibank.com/ ADRESiNE GiDiN
// 2) Sign In BUTONUNA TIKLAYIN
// 3) USERNAME "deneme@gmi.bank.com", PASSWORD "Deneme44" KULLANARAK GiRiS YAPIN
// 4) SAYFAYA YANLIS SiFRE VE PASSWORD iLE GiRiS YAPILAMADIGINI DOGRULAYIN
// 5) SAYFAYA YANLIS SiFRE VE PASSWORD iLE GiRiS YAPILAMADIGINI
//    FARKLI BiR WEBELEMENT KULLANARAK 2. KEZ DOGRULAYIN
// <div role="alert" class="Toastify__toast-body">translation-not-found[error.http.401]</div>

    @Test
    public void test(){

        driver.get("https://gmibank.com/");



        // 2) Sign In BUTONUNA TIKLAYIN
        driver.findElement(By.xpath("(//a[@class='dropdown-toggle nav-link'])[2]")).click();
        driver.findElement(By.xpath("//*[span='Sign in']")).click();

        // 3) USERNAME "deneme@gmi.bank.com", PASSWORD "Deneme44" KULLANARAK GiRiS YAPIN
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("deneme@gmi.bank.com", Keys.TAB);

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("Deneme44", Keys.ENTER);


// 4) SAYFAYA YANLIS SiFRE VE PASSWORD iLE GiRiS YAPILAMADIGINI DOGRULAYIN
        WebElement hataliGiris = driver.findElement(By.xpath("//strong"));

        if(hataliGiris.isEnabled()){
            System.out.println("Yanlis username ve password ile giris, TEST PASS");
        } else {
            System.out.println("Yanlis username ve password ile giris, TEST FAILED");
        }
        // 5) SAYFAYA YANLIS SiFRE VE PASSWORD iLE GiRiS YAPILAMADIGINI
        //    FARKLI BiR WEBELEMENT KULLANARAK 2. KEZ DOGRULAYIN
        // <div role="alert" class="Toastify__toast-body">translation-not-found[error.http.401]</div>
        WebElement hataliGiris2 = driver.findElement(By.xpath("//div[@role='alert']"));

        if(hataliGiris2.isEnabled()){
            System.out.println("Yanlis username ve password ile giris, TEST 2 PASS");
        } else {
            System.out.println("Yanlis username ve password ile giris, TEST 2 FAILED");
        }
        driver.close();
    }
}