package org.example;

import org.example.sites.wiki.Wiki;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class LoginPageTest extends BaseTest {
    private static Wiki basePage = Web.site.wiki;
    public SoftAssert softAssert = new SoftAssert();
    @Test //(groups = {"checkintest"})
    public void test1(){
        basePage
                .loginPage
                .openPage()
                .typeTextToLoginField(Credentials.LOGIN)
                .typeTextToPasswordField(Credentials.PASSWORD);
      //assertTrue(false);



    }
}
