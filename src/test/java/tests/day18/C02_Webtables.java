package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class C02_Webtables {
    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;


    //Bir class oluşturun : C02_WebTables
    //● login( ) metodun oluşturun ve oturum açın.
    //●https://www.hotelmycamp.com/ adresine gidin
    //○ Username : manager
    //○ Password : Manager1! ● table( ) metodu oluşturun


    //● printRows( ) metodu oluşturun //tr
    //○ table body’sinde bulunan toplam satir(row) sayısını bulun.
    //○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
    //○ 4.satirdaki(row) elementleri konsolda yazdırın.
    @Test
    public  void webTablesTest() {
        hotelMyCampPage=new HotelMyCampPage();
        hmcWebTablePage=new HMCWebTablePage();
        hotelMyCampPage.girisYap();
        //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        List<WebElement> headerDataList=hmcWebTablePage.headarBirinciSatırDatalar;
        System.out.println("tablodakı sutun sayısı:"+headerDataList.size());
        //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.

        System.out.println(hmcWebTablePage.tumBodyWebElementi.getText());

        List<WebElement> bodyTumData=hmcWebTablePage.tumBodyDatalariList;
        System.out.println("body'dekı data sayısı::"+bodyTumData.size());




    }


}
