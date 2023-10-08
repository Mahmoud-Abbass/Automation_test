package checkbox;

import login.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {


    @Test
    public void testCheckBoxes(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//input[\"@type=checkbox\"][1]")).click();
        driver.findElement(By.xpath("//input[\"@type=checkbox\"][2]")).click();

    }

}
