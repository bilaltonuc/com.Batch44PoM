package tests.day20;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class C01_ReadExcel {

    @Test

    public void Test01() throws IOException {

        FileInputStream fis=new FileInputStream("src/test/java/resources/ulkeler.xlsx");

        Workbook workbook=WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sayfa1");
        Row row= sheet.getRow(21);
        Cell cell= row.getCell(2);
        System.out.println(cell);

        String expectedDeger="Bolivya";

        Assert.assertEquals(cell.getStringCellValue(),expectedDeger);

        //5.indexteki satirin hucre bilgisini getirin..

        row=sheet.getRow(5);
        cell=row.getCell(3);
        System.out.println(cell);






    }
}
