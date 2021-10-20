package tests.day15;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClass {

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
//driver clasindan obje üretilemesin istedigiiz icin Driver classi Singleton yaptik
      //  Parametresiz Driver cons olsuturup acces modif private yaptik

        Driver.closeDriver();

    }



}
