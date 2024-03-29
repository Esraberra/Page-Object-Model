package tests.day18;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcel {

/*
1) Yeni bir Class olusturalim WriteExcel
2) Yeni bir test method olusturalim writeExcelTest()
3) Adimlari takip ederek 1.satira kadar gidelim
4) 4.hucreye yeni bir cell olusturalim
5) Olusturdugumuz hucreye “Nufus” yazdiralim
6) 2.satir nufus kolonuna 1500000 yazdiralim
7) 10.satir nufus kolonuna 250000 yazdiralim
8) 15.satir nufus kolonuna 54000 yazdiralim
9) Dosyayi kaydedelim
10)Dosyayi kapatalim
 */

    @Test
    public void writeExcelTest() throws IOException {
        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);
        workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue(1500000);
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");
        workbook.getSheet("Sayfa1").getRow(9).createCell(4).setCellValue(250000);
        workbook.getSheet("Sayfa1").getRow(14).createCell(4).setCellValue(54000);

        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);
fos.close();
fis.close();
workbook.close();


    }











}
