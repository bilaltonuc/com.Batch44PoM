package tests.day17;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class C01_HotelMyCampNegativeTest {

    //1 ) Bir Class olustur : NegativeTest
    //2) Bir test method olustur NegativeLoginTest()
    //		 https://www. hotelmycamp.com/ adresine git
    //		login butonuna bas
    //	test data username: manager1 ,
    //	test data password : manager1!
    //	Degerleri girildiginde sayfaya girilemedigini test et
@Test
    public  void test() throws IOException {
        Driver.getDriver().get(" https://www.hotelmycamp.com/");

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys("manager11");
        hotelMyCampPage.passwordBox.sendKeys("manager1!");
        hotelMyCampPage.loginButonu.click();

    TakesScreenshot takesScreenshot=(TakesScreenshot)Driver.getDriver();

    File tumdosya=new File("target/screenShot/tumdosya.png");

    File gecicii=takesScreenshot.getScreenshotAs(OutputType.FILE);

    FileUtils.copyFile(gecicii,tumdosya);




        Assert.assertTrue(hotelMyCampPage.girişYapılamadıElementi.isDisplayed());



    }




}
