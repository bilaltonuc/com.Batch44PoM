package tests.day16;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {

    //1.facebook a gidin
    // //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

    //4-  Basarili giris yapilamadigini test edin

    @Test
    public void test() {

        Driver.getDriver().get("https://www.facebook.com/");
        FacebookPage facebookPage=new FacebookPage();
        Faker faker=new Faker();

        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();



        Assert.assertTrue(facebookPage.girilemediYazisiElemnti.isDisplayed());



    }
  //
    //Actions actions=new Actions(Driver.getDriver());
    // 3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin





}
