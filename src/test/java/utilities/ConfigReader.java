package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1-Properties objesi olustur

static Properties properties=new Properties();

    //2-Bu klasin amaci configuration.properties dosyasini okumak ve oradaki key value ikililerini kullanarak
    // istedgimiz key e ait value i bize getirmek
static
    {
    String path="configuration.properties";

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            properties=new Properties();
            properties.load(fileInputStream);
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //3-test classlarindan config reader clasina ulasip yukaridaki islemleri yapmamizi saglayacak bir method olusturacagiz

public static String getProperty(String key){

    String value=properties.getProperty(key);

    return value;
}





}
