package forgetpassword;

import login.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.internal.invokers.InvokeMethodRunnable;
import pages.ForgotPasswordPage;
import pages.ServerPage;

import static org.testng.AssertJUnit.assertTrue;

public class ForgetPasswordTest extends BaseTest {

    @Test
    public void testForgotPassword() throws InterruptedException {
       ForgotPasswordPage forgotPasswordPage= homePage.clickOnForgotPasswordLink();
       forgotPasswordPage .insertEmail("abbas@gmail.com");
       ServerPage serverPage = forgotPasswordPage.clickRetriveButton();
       String actualResult = serverPage.getValidationText();
       String expectedResult ="Internal Server Error";
        assertTrue(actualResult.contains(expectedResult));

    }

}
