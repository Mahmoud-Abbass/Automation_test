package frame;

import login.BaseTest;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FrameTest extends BaseTest {
    @Test
    public void frameTest(){
        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickOnWYSIWYGEditorLink();
        wysiwygEditorPage.clearText();

        wysiwygEditorPage.insertText("Abbas");
        wysiwygEditorPage.clickOnIncreaseIndentButton();
    }
}
