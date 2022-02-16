package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.security.Key;
import java.time.Duration;

public class C01_E2ETesting {

    @Test
    public void createHotel() {
        //1. Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.hotelmycamp.com adresine git.

        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
        //	a. Username : manager
        //	b. Password  : Manager1!
        //5. Login butonuna tıklayın.
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelListLinki.click();
        hotelMyCampPage.addHotelLinki.click();

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(hotelMyCampPage.addHotelCodeKutusu)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Select select=new Select(hotelMyCampPage.addHotelDropdown);
        select.selectByVisibleText("Hotel Type1");

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",hotelMyCampPage.addHotelSaveButonu);
        hotelMyCampPage.bekle(3);
        javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampPage.addHotelSaveButonu);
      hotelMyCampPage.bekle(3);

        Assert.assertTrue(hotelMyCampPage.başarılıOlduk.isDisplayed());









    }
}
