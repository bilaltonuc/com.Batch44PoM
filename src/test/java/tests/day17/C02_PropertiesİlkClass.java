package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesİlkClass {

    @Test
    public void pozitifLoginTesti() {
        // Hotel My Camp sitesine positive login testini POM'a tam uygun olarak yapiniz

        //https://www. hotelmycamp.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // Driver.getDriver().get("buraya properties dosyasina git HMCUrl'e karsilik gelen degeri getir");
        //		login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();

        //	test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        //	test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassWord"));
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.loginButonu.click();
        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

          Assert.assertTrue(hotelMyCampPage.basarılıGırısYazısı.isDisplayed());


    }


}
