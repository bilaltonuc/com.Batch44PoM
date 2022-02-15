package tests.day16;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class C04_HotelMyCamPozitiveLogin {


    @Test
    public void pozitifLoginTesti() throws IOException {
        // 1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //		https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //		login butonuna bas

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        //	test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys("manager1");

        //	test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButonu.click();

        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://www.hotelmycamp.com/Admin/Profile";

        Assert.assertEquals(actualUrl,expectedUrl);
    }
}



