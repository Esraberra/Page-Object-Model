package tests.day17ExcelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_ReadExcel {
//. Dosya yolunu bir String degiskene atayalim
//8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
//9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
//10. WorkbookFactory.create(fileInputStream)
//11. Worksheet objesi olusturun workbook.getSheetAt(index)
//12. Row objesi olusturun sheet.getRow(index)
//13. Cell objesi olusturun row.getCell(index)
    @Test
    public void test() throws IOException {
        String dosyaYolu="src/test/java/resources/ulkeler.xlsx";
        FileInputStream file=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(file);
      //  Sheet sheet=workbook.getSheet("Sayfa 1");
    //    Row row= sheet.getRow(2);
    //    Cell cell= row.getCell(3);
   //     System.out.println(cell);
//Sheet clasini Numbers mac book da okumadi
        Cell cell=workbook.getSheet("Sayfa1").getRow(5).getCell(3);
        System.out.println(cell);
        Assert.assertEquals(cell.toString(),"Luanda");
        //cell in data türü Cell Luanda ise String o yüzden toString yapiyoruz


        //indexi 3 olan satirdaki indexi 2 olan hücredeki yaziyi büyük harfle yazdir.

        Cell cell1=workbook.getSheet("Sayfa1").getRow(3).getCell(2);
        System.out.println(cell1.toString().toUpperCase());
        System.out.println( workbook.getSheet("Sayfa2").getLastRowNum());
        System.out.println(  workbook.getSheet("Sayfa2").getPhysicalNumberOfRows());
    }
@Test
    public void test1() throws IOException {
    List<String> ikinciSütun =new ArrayList<>();
    String dosyaYolu="src/test/java/resources/ulkeler.xlsx";
    FileInputStream file=new FileInputStream(dosyaYolu);
    Workbook workbook= WorkbookFactory.create(file);
    for (int i = 0; i < workbook.getSheet("Sayfa1").getLastRowNum(); i++) {
        ikinciSütun.add(workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString());
        
    }
    System.out.println(ikinciSütun);



    //A ile baslayan sehirler
    List<String> aileBaslayanSehirler=new ArrayList<>();
    for (String e:ikinciSütun
         ) {
        if (e.startsWith("A")) {
            aileBaslayanSehirler.add(e);

        }

    }
    System.out.println(aileBaslayanSehirler);
    //eger tüm datayi javada kullanilanilir bir collectiona cevirmek istesek
   // map icin unique degerlere sahip bir key olacak sütun
//key=Turkey
    //value=Ankara, Türkiye, Ankara
    Map<String, String> map=new HashMap<>();
    String key="";
    String value="";
    for (int i = 0; i < workbook.getSheet("Sayfa1").getLastRowNum(); i++) {
        key=workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
        value=workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString()+ " , "+
             workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString()+ " , "+
                workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString();
        map.put(key,value);
    }
    System.out.println(map);

}

}
