package org.example.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickHelper {
    private WebDriver driver;
    private WaitHelper waitHelper;

    public ClickHelper(WebDriver driver) {
        this.driver = driver;
        this.waitHelper = new WaitHelper(driver);
    }

    public void click(final WebElement target) {
        waitHelper.waitUntilElementWillBeVisible(target);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", target);
        waitHelper.waitForSeconds(1);
        target.click();
    }
}
