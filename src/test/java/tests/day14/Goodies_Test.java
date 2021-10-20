package tests.day14;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.GoodiesPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class Goodies_Test extends TestBase {


    @Test
    public void test(){

driver.get(ConfigReader.getProperty("goodUrl"));
        GoodiesPage goodiesPage=new
                GoodiesPage(driver);
        Actions actions=new Actions(driver);
        actions.dragAndDrop(goodiesPage.oslo, goodiesPage.norway).perform();
  actions.dragAndDrop(goodiesPage.stockholm, goodiesPage.Sweeden).perform();
  actions.dragAndDrop(goodiesPage.washington, goodiesPage.unitedStates).perform();
  ////////////////////////////////////////
  actions.dragAndDrop(goodiesPage.copenhagen, goodiesPage.denmark).perform();
  actions.dragAndDrop(goodiesPage.rome, goodiesPage.italy).perform();
  actions.dragAndDrop(goodiesPage.madrid, goodiesPage.spain).perform();
  actions.dragAndDrop(goodiesPage.seoul, goodiesPage.korea).perform();
    }





}
