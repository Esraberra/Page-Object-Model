package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

public class C05_SeleniumPractice extends TestBase {
//go to url : https://en.wikipedia.org/wiki/Dell
//go to table which name is 'List of companies acquired by Dell Inc.'
//print row 5 of the table on console //table[3]//tr[5]
//also print on console the 2nd and 3rd elements (middle 2 elements) in line 10
//( 2nd and 3rd element


@Test
        public void test(){
    driver.get("https://en.wikipedia.org/wiki/Dell");
    Actions actions=new Actions(driver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    List<WebElement> besincisira=driver.findElements(By.xpath("//table[3]//tr[5]"));
    for (WebElement e: besincisira
         ) {
        System.out.println(e.getText());

    }

    //table[3]//tbody//tr[10]//td[";
    // " ]"; ikinci element
    //table[3]//tbody//tr[10]//td[3]  ucuncu element


    String firstData="//table[3]//tbody//tr[10]//td[";
    String secondData=" ]";
    for (int i = 2; i < 4; i++) {

        String name=driver.findElement(By.xpath(firstData+i+secondData)).getText();
        System.out.println("2nd and 3rd element on the 10th line : "+ name);
    }


}














}
