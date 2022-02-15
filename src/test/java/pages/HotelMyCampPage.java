package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {

  public  HotelMyCampPage() {

      PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(id="divMessageResult")
  public WebElement girişYapılamadıElementi;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
   public  WebElement basarılıGırısYazısı;


    public void girişYap() {

      Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
     HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
      hotelMyCampPage.ilkLoginLinki.click();
      hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
      hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
      hotelMyCampPage.loginButonu.click();

    }

    public void bekle(int saniye)  {

      try {
        Thread.sleep(saniye*1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }


}

