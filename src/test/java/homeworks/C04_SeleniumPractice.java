package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.WeakHashMap;

public class C04_SeleniumPractice extends TestBase {

    /*

    go to url : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    Fill in capitals by country
     *selenium- actionclass/dragandDrop

     */

@Test
    public void test(){
    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    Actions actions=new Actions(driver);
    WebElement oslo=driver.findElement(By.id("box1"));
    WebElement norway=driver.findElement(By.id("box101"));
            actions.dragAndDrop(oslo,norway).perform();
    WebElement stockholm=driver.findElement(By.id("box2"));
    WebElement Sweeden=driver.findElement(By.id("box102"));
  actions.dragAndDrop(stockholm,Sweeden).perform();
  ///////////////////////////
    WebElement washington=driver.findElement(By.id("box3"));
    WebElement unitedStates=driver.findElement(By.id("box103"));
    actions.dragAndDrop(washington,unitedStates).perform();

    WebElement copenhagen=driver.findElement(By.id("box4"));
    WebElement denmark=driver.findElement(By.id("box104"));
    actions.dragAndDrop(copenhagen,denmark).perform();

    WebElement seoul=driver.findElement(By.id("box5"));
    WebElement korea=driver.findElement(By.id("box105"));
    actions.dragAndDrop(seoul,korea).perform();

    WebElement rome=driver.findElement(By.id("box6"));
    WebElement italy=driver.findElement(By.id("box106"));
    actions.dragAndDrop(rome,italy).perform();

    WebElement madrid=driver.findElement(By.id("box7"));
    WebElement spain=driver.findElement(By.id("box107"));
    actions.dragAndDrop(madrid,spain).perform();

}


}
