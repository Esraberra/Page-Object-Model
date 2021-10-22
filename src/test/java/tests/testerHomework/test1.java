package tests.testerHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UltimateQAPage;
import utilities.Driver;

import java.util.Set;

public class test1 {

    /**
     * Part 1:
     * Open "https://courses.ultimateqa.com/users/sign_up"
     * create random and valid first name, last name, email and password, store for later validating
     * fill in account submission form with data above
     * Click on checkbox with id="user[terms]" to agree with terms and conditions
     * click on "Sign up" button
     * go to https://courses.ultimateqa.com/account
     * validate that first name, last name and email you provided earlier is correct
     * <p>
     * Part 2 (Optional)
     * sign out of the website
     * go to "https://courses.ultimateqa.com/users/sign_in"
     * fill in sign in form with your stored email and password
     * click on "Sign in" button
     * validate that message "Signed in successfully." is displayed
     * <p>
     * NOTE:Captcha on this website is un-avoidable,
     * so you will have to solve it by hand to allow script to continue
     **/

    @Test
    public void login() throws InterruptedException {


        UltimateQAPage ultimateQAPage = new UltimateQAPage();
        ultimateQAPage.login();

        Set<String> windows=Driver.getDriver().getWindowHandles();
        String ikinciWindowhandle="";

        for (String each:windows) {

            if (!each.equals(ultimateQAPage.ilkwindow))
            {
                ikinciWindowhandle=each;
            }

        }
        Driver.getDriver().switchTo().window(ikinciWindowhandle);

        Thread.sleep(15000);


        Thread.sleep(3000);
       Actions actions=new Actions(Driver.getDriver());
       actions.sendKeys(Keys.TAB).perform();
       actions.sendKeys(Keys.TAB).perform();
       actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);

       String ikinciMailKutusu=Driver.getDriver().findElement(By.id("user[first_name]")).getText();

        Assert.assertTrue(ikinciMailKutusu.equals(ultimateQAPage.eMail.getText()));

    }


}