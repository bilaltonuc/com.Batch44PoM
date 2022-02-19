package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_ReusableRunner {

    @Test
    public  void Test() {
            //ulkeler excelındekı sayfa 1 de 11.indexdekı satırın 2.indextekı hucresının azzarbeycan oldugunu test edın

        String path="src/test/java/resources/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData=ResusableMethod.hucreGetır(path,"Sayfa1",11,2).toString();
       // method static olmasaydı boylede yapılabılırdı ResusableMethod resusableMethod=new ResusableMethod();
       // String actualData = resusableMethod.hucreGetır(path, "Sayfa1", 11, 2).toString();
        Assert.assertEquals(actualData,expectedData);

    }

}
