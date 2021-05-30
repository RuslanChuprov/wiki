package org.example.sites.wiki.pages;

import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class BeginnerPage extends BasePage {


    public WebElement getTitleField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div/table/tbody/tr/td/a[1]"));
    }

    public BeginnerPage waitForTitleField() {
        waitForElement(getTitleField());
        return Web.site.wiki.beginnerPage;

    }

    public WebElement getBtn()  {
        WebElement element;
        try {
            element = Web.driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        }
        catch (NoSuchElementException e)
        {
           throw new AssertionError("No such element");
        }

        return element;


    }

}



