package tests.day18;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_Webtables {
    HotelMyCampPage hotelMyCampPage;


    //Bir class oluşturun : C02_WebTables
    //● login( ) metodun oluşturun ve oturum açın.
    //●https://www.hotelmycamp.com/ adresine gidin
    //○ Username : manager
    //○ Password : Manager1! ● table( ) metodu oluşturun
    //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
    //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
    //● printRows( ) metodu oluşturun //tr
    //○ table body’sinde bulunan toplam satir(row) sayısını bulun.
    //○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
    //○ 4.satirdaki(row) elementleri konsolda yazdırın.
    @Test
    public  void webTablesTest() {
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();



    }


}
