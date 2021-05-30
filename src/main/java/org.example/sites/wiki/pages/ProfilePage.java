package org.example.sites.wiki.pages;

import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage extends BasePage{

    /*public WebDriver driver;*/

    public ProfilePage openPage() {
        Web.driver.get("https://ru.wikipedia.org/w/index.php?title=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%94%D0%BE%D0%BC%D0%B0%D1%88%D0%BD%D1%8F%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0&source=personaltoolslink&namespace=0");
        return Web.site.wiki.profilePage;
    }
    public WebElement getTitleField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"n-featured\"]/a"));
    }

    public LoginPage backPage() {
        Web.driver.manage().window().maximize();
        return Web.site.wiki.loginPage;
    }
    public BeginnerPage clickTitleField() {
        waitForElement(getTitleField()).click();
        return Web.site.wiki.beginnerPage;

    }

}
