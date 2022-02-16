package tests.SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_NegativeTest {




        // 1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
        //3 Farkli test Methodunda 3 senaryoyu test et
        //				- yanlisSifre
        //				- yanlisKulllanici
        //				- yanlisSifreKullanici
        //test data yanlis username: manager1 , yanlis password : manager1
        //2) https://www.hotelmycamp.com adresine git
        //3) Login butonuna bas
        //4) Verilen senaryolar ile giris yapilamadigini test et
        HotelMyCampPage hotelMyCampPage;

        @Test
        public void yanlisSifreTesti() {
            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
            hotelMyCampPage = new HotelMyCampPage();
            hotelMyCampPage.ilkLoginLinki.click();
            hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
            hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
            hotelMyCampPage.loginButonu.click();
            Assert.assertTrue(hotelMyCampPage.girişYapılamadıElementi.isDisplayed());
            Driver.close();
        }

        @Test
        public void yanlisUsernameTesti() {
            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
            hotelMyCampPage = new HotelMyCampPage();
            hotelMyCampPage.ilkLoginLinki.click();
            hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
            hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
            hotelMyCampPage.loginButonu.click();
            Assert.assertTrue(hotelMyCampPage.girişYapılamadıElementi.isDisplayed());
            Driver.close();
        }

        @Test
        public void yanlisSifreUsernameTesti() {
            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
            hotelMyCampPage = new HotelMyCampPage();
            hotelMyCampPage.ilkLoginLinki.click();
            hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
            hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
            hotelMyCampPage.loginButonu.click();
            Assert.assertTrue(hotelMyCampPage.girişYapılamadıElementi.isDisplayed());
            Driver.close();
        }

    }

