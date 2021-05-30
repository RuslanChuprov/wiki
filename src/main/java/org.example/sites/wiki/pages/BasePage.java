package org.example.sites.wiki.pages;

import org.example.web.Web;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebElement  waitForElement (WebElement webElement) {
        return ( new WebDriverWait(Web.driver, 30)
                .until(ExpectedConditions.visibilityOf(webElement)));

    }
}
