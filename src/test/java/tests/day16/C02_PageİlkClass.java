package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageİlkClass {

    //amazona gidelim


    @Test
     public void test() {
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna nutella yazıp aratalım

        AmazonPage amazonPage=new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        //arama sonuçlarının nutella ıcerdıgını test edelım
        String actualResultt=amazonPage.actualResult.getText();
        Assert.assertTrue(actualResultt.contains("nutella"));
        Driver.close();


    }
    @Test
    public void test2() {

       Driver.getDriver().get("https://www.amazon.com");

       AmazonPage amazonPage=new AmazonPage();
       amazonPage.amazonAramaKutusu.sendKeys("java");

       String sonucYazısıstr=amazonPage.actualResult.getText();
       Assert.assertTrue(sonucYazısıstr.contains("java"));



    }





}
