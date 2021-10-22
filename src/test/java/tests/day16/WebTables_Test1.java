package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class WebTables_Test1 {

    /*
  Bir class oluşturun : D18_WebTables

● login() metodun oluşturun ve oturum açın.

● http://qa-environment.koalaresorthotels.com /admin/HotelRoomAdmin adresine gidin
○ Username : manager
○ Password : Manager2!

● table() metodu oluşturun

○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody  //tbody//tr[2]/td

○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.



//table//th[5]   //tbody//td[5]

○
     */

@Test
    public void login() throws InterruptedException {
    Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
    QAConcortPage qaConcortPage=new QAConcortPage();
    qaConcortPage.ConcortHotelLogin();
    qaConcortPage.hotelManagement.click();
    qaConcortPage.hotelRooms.click();

    System.out.println("column numbers in tbody : "+ qaConcortPage.columnNumbersInTbody.size());


    System.out.println("tüm body ve basliklar "+Driver.getDriver().findElement(By.xpath("//table")).getText());

//table body’sinde bulunan toplam satir(row) sayısını bulun.
//
//○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.

Thread.sleep(3000);
    System.out.println(" tbody toplam row number : "+qaConcortPage.tbodyTr.size());
    System.out.println("table bodysinde bulunan tüm satilar :");
    for (WebElement each:qaConcortPage.tbodyTr
         ) {
        System.out.println(each.getText());

    }
   //printCells() metodu oluşturun //td
    // table body’sinde bulunan toplam hücre(cell) sayısını bulun.
    //○ Table body’sinde bulunan hücreleri(cells) konsolda yazdırın.

    System.out.println("tbody cell  numbers : "+ qaConcortPage.tbodyCellNumbers.size());

    for (WebElement each: qaConcortPage.tbodyCellNumbers
         ) {
        System.out.println(each.getText());

    }
    //////////////////////////
  //  4.satirdaki(row) elementleri konsolda yazdırın.

    System.out.println( "4. satirdaki tüm elementler :"+Driver.getDriver().findElement(By.xpath("//tbody/tr[4]")).getText());


  //  5.column daki elementleri konsolda yazdırın.

 List<WebElement> CloumnElements=Driver.getDriver().findElements(By.xpath("//tbody//td[5]"));
    System.out.println( "5. column elements are : ");
    for (WebElement each: CloumnElements
         ) {
        System.out.println(each.getText());

    }
}

















}
