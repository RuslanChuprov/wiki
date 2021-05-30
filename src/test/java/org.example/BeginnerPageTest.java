package org.example;

import io.qameta.allure.Step;
import org.example.sites.wiki.Wiki;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class BeginnerPageTest extends BaseTest {
    private static Wiki basePage = Web.site.wiki;
    public SoftAssert softAssert = new SoftAssert();
    @Test
        public void test3(){
        basePage
                .profilePage
                .openPage()
                .clickTitleField()
                .waitForTitleField();
        softAssert.assertTrue(basePage.beginnerPage.getBtn().isDisplayed());
        softAssert.assertAll();

    }
}
