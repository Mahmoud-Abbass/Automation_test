package jsconfirm;

import login.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JsConfirmTest extends BaseTest {

    @Test
            public void JsConfirmTest(){
        JavaScriptPage javaScriptPage= homePage.clickOnJavaScriptAlertsLink();
        javaScriptPage.clickOnJsConfirmButton();
        javaScriptPage.acceptAlert();
        String expectedResult ="You clicked: Ok";
        String actualResult = javaScriptPage.getValidationMessage();
        assertTrue (expectedResult.contains(actualResult));
    }

}
