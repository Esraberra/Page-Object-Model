package homeworks;

import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class C01_Homework extends TestBase {

    /*
    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
    ~ click on Phones & PDAs
    ~ get the brandName of phones
    ~ click on add to button for all elements
    ~ click on black total added cart button
    ~ get the names of list from the cart
    ~ compare the names from displaying list and cart list

     */

    List <WebElement> listOfCart;

    List<String> displayingList;

    List<String> cartList;

    @Test (priority=1)
    public void clickAllElements() throws InterruptedException {

        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

        driver.findElement(By.linkText("Phones & PDAs")).click();

        List<WebElement> allPhones=   driver.findElements(By.tagName("h4"));

        displayingList =new ArrayList<>();

        for (WebElement each: allPhones)
        {
            System.out.println("Phone names: "+each.getText());
            displayingList.add(each.getText());
        }
        // ~ click on add to button for all elements
        List<WebElement> addToCart=driver.findElements(By.xpath("//span[text()='Add to Cart']"));

        for (WebElement each : addToCart)
        {
            each.click();

        }
        driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("View Cart")).click();

       listOfCart=driver.findElements(By.xpath("//td[2]//a"));

       cartList=new ArrayList<>();

        for (WebElement each:listOfCart)
        {
            System.out.println("productList of cart :"+each.getText());

            cartList.add(each.getText());
        }

    }

    @Test (priority = 2)
    public void getName() {

// ~ get the names of list from the cart
      listOfCart=driver.findElements(By.xpath("//td[2]//a"));

       cartList=new ArrayList<>();

        for (WebElement each:listOfCart)
        {
            // ~ get the names of list from the cart
            System.out.println("productList of cart :"+each.getText());

            cartList.add(each.getText());

        }
        System.out.println("displayinglist : "+displayingList);

        System.out.println("cartlist: "+cartList);

    }

@Test(priority = 3)
// ~ compare the names from displaying list and cart list
    public void compareTwoList(){

    try
    {
        Assert.assertTrue(displayingList.contains(cartList));
        System.out.println("lists are equal");
    }
    catch (Throwable e){
        System.out.println("lists are not equal "+ e.getMessage());

    }

}






}
