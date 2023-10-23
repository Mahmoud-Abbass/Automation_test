package wait;

import login.BaseTest;
import net.bytebuddy.implementation.EqualsMethod;
import org.testng.annotations.Test;
import org.testng.internal.invokers.InvokeMethodRunnable;
import pages.DynamicLoadPage;
import pages.OnePage;
import pages.TwoPage;

import static org.testng.Assert.assertTrue;

public class DynamicLoadingTest extends BaseTest {
    @Test(priority = 1)
    public void testDynamicLoading(){
        DynamicLoadPage dynamicLoadPage = homePage.clickOnDynamicLoadPage();
        OnePage onePage = dynamicLoadPage.ClickOnExampleOne();
        onePage.clickOnStartButton();
        String actualResult =onePage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertTrue(actualResult.contains(expectedResult));
    }
    @Test(priority = 2)
    public void testDynamicLoadingTwo(){
        DynamicLoadPage dynamicLoadPage = homePage.clickOnDynamicLoadPage();
        TwoPage twoPage = dynamicLoadPage .ClickOnExampleTwo();
        twoPage .clickOnStartButton();
        String actualResult = twoPage.getValidationMessage();
        String expectedResult= "Hello World!";
        assertTrue(actualResult.contains(expectedResult));
    }
}
