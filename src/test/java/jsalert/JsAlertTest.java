package jsalert;

import login.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptPage;

import static org.testng.Assert.assertEquals;

public class JsAlertTest extends BaseTest {
    @Test
    public void jsAlertTest(){
        JavaScriptPage javaScriptPage = homePage.clickOnJavaScriptAlertsLink();
        javaScriptPage.selectclickForJsAlertButton();
        javaScriptPage.acceptAlert();
        String expectedResult ="You successfully clicked an alert";
        String actualResult = javaScriptPage.getValidationMessage();
        assertEquals(actualResult,expectedResult);

    }
}
