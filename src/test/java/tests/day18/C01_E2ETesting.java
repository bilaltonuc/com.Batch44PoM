package tests.day18;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;

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
        hotelMyCampPage.girişYap();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    }
}
