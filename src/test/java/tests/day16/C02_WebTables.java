package tests.day16;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTables {

    /*
    Bir class oluşturun : C02_WebTables
● login() metodun oluşturun ve oturum açın.
● https://www.concorthotel.com//admin/HotelRoomAdmin adresine gidin
 ○ Username : manager
 ○ Password : Manager1!
● table() metodu oluşturun
 ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
 ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
● printRows() metodu oluşturun //tr
 ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
 ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
 ○ 4.satirdaki(row) elementleri konsolda yazdırın.
     */

@Test
    public void test(){
    Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
    QAConcortPage qaConcortPage=new QAConcortPage();
    qaConcortPage.ConcortHotelLogin();
    qaConcortPage.hotelManagement.click();
    qaConcortPage.hotelRooms.click();

    for (WebElement each :qaConcortPage.basliklarListesi
         ) {
        System.out.println(each.getText());

    }
    System.out.println("Table column numbers "+qaConcortPage.basliklarListesi.size());
//eger tüm tablo badisini hücrelere ayirmadan tek bir strin olarak görmek istersek
    //tüm body i tek  bir Webelement olarak locate edebilirz
    //tabloda happy hotel var mi gibi sorular icin ideal bir cözüm olur.
    System.out.println(qaConcortPage.tbodyTumu.getText());
    Assert.assertTrue(qaConcortPage.tbodyTumu.getText().contains("HAPPY HOTEL"));

    System.out.println("tablodaki satir sayisi : "+qaConcortPage.tbodyTr.size());

    System.out.println(qaConcortPage.birinciSatir.getText());
    for (int i = 1; i <qaConcortPage.tbodyTr.size() ; i++) {
        System.out.println(i+1 + " . satir" + qaConcortPage.tbodyTr.get(i).getText());


    }
//4. satirdaki elementleri consolda yazdir
    for (WebElement each: qaConcortPage.dördüncüSütunListesi
         ) {
        System.out.println(each.getText());

    }
}




}




