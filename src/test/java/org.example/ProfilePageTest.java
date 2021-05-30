package org.example;

import org.example.sites.wiki.Wiki;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class ProfilePageTest extends BaseTest {
        private static Wiki basePage = Web.site.wiki;
        public SoftAssert softAssert = new SoftAssert();
        @Test(groups = {"checkintest"})
        public void test2() {
            basePage
                    .profilePage
                    .openPage()
                    .clickTitleField();
            softAssert.assertTrue(basePage.profilePage.getTitleField().isDisplayed());
            softAssert.assertAll();
        }
}
