package dropdown;

import login.BaseTest;
import net.bytebuddy.implementation.EqualsMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    WebDriver driver;
    @Test
    public void DropDownTest (){
        DropDownPage dropDownPage = homePage.clickOnDropDownLink();
        dropDownPage.clickOnDropDownButton();
        dropDownPage.clickOnOptionOne();
        String actualResult = dropDownPage.getValidationSelectionOption();
        String expectedResult = "Option 1";
        assertTrue (actualResult.contains(expectedResult));
    }
}
