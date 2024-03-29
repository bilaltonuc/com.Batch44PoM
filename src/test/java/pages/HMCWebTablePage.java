package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {
   public HMCWebTablePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//thead//tr//th")
    public List<WebElement> headarBirinciSatırDatalar;

    @FindBy(xpath = "//tbody")
    public WebElement tumBodyWebElementi;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalariList;


    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;





}
