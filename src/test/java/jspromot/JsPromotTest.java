package jspromot;

import login.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptPage;

import static org.testng.Assert.assertEquals;

public class JsPromotTest extends BaseTest {
    @Test
    public void JsPromotTest (){

        JavaScriptPage javaScriptPage = homePage.clickOnJavaScriptAlertsLink();
        javaScriptPage.clickOnJsPromotButton();
        javaScriptPage.sendALertValue("Abbas");
        javaScriptPage.clickOkAfterSendKey();
        String expectedResult ="You entered: Abbas";
        String actualResult = javaScriptPage.getValidationMessage();
        assertEquals(actualResult,expectedResult);
    }
}
