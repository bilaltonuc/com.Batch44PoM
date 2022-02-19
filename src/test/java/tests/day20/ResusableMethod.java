package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ResusableMethod {

    public static Cell hucreGetır(String path, String sayfaİsmi, int satır, int hucreBilgisi) {
    Cell cell=null;
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
           cell= workbook.getSheet(sayfaİsmi).getRow(satır).getCell(hucreBilgisi);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  cell;
    }
}
