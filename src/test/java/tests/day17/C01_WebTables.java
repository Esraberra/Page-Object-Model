package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;

public class C01_WebTables {

    @Test  (groups = "birinci grup")

    public void test(){
//Bir class oluşturun : C02_WebTables
        //● login() metodun oluşturun ve oturum açın.
        //● https://www.concorthotel.com//admin/HotelRoomAdmin adresine gidin
        //          ○ Username : manager
        //          ○ Password : Manager1!
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
        qaConcortPage.hotelManagement.click();
        qaConcortPage.hotelRooms.click();

        //1. pages sayfasinda metod oluşturun : printData(int row, int column);

String actualData=qaConcortPage.printData(3, 5);
        //    a. Satır(row) ve sütun(column) numarasını girdiğinizde, printData metodu bu    hücredeki(cell) veriyi yazdırmalıdır.
        //2. Baska bir Test metodu oluşturun: printDataTest();
        //    a. Ve bu metodu printData() methodunu cagirmak icin kullanin.
        //    b. Örnek: printData (3,5); => 3. satır, 5. Sütundaki veriyi yazdırmalıdır


        //    c. yazdirilan datanin olmasi gereken dataya esit oldugunu test edin

        //asserti bu klasta yapmak istiyorsak istenen datanin bu klasa dönmesini saglamaliyiz return lü method
        //olacak

        Assert.assertEquals(actualData,"USA","data is diffrent expected one FAILED");
        Driver.closeDriver();
    }





}
