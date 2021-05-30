package org.example.sites.wiki.pages;

import io.qameta.allure.Step;
import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage  {

    public LoginPage typeTextToLoginField(String login) {
        getLoginField().sendKeys(login, Keys.ENTER);
        return Web.site.wiki.loginPage;
    }

    public LoginPage typeTextToPasswordField(String password) {
        waitForElement(getPasswordField()).sendKeys(password, Keys.ENTER);
        return Web.site.wiki.loginPage;
    }

    @Step
    public LoginPage openPage() {
        Web.driver.get("https://ru.wikipedia.org/w/index.php?title=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%92%D1%85%D0%BE%D0%B4&returnto=%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F+%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        return Web.site.wiki.loginPage;
    }


    public WebElement getLoginField() {
        return Web.driver.findElement(By.xpath("//*[@id='wpName1']"));

    }


    public WebElement getPasswordField() {
        return Web.driver.findElement(By.xpath("//*[@id='wpPassword1']"));

    }
}
