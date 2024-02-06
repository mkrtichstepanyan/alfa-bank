package org.example.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputHelper {
    WebDriver driver;
    WaitHelper waitHelper;

    public InputHelper(WebDriver driver) {
        this.waitHelper = new WaitHelper(driver);
        this.driver = driver;
    }


    public void clearInput(WebElement element) {
        waitHelper.waitUntilElementWillBeVisible(element);
        element.sendKeys(Keys.chord(Keys.CONTROL), Keys.BACK_SPACE);
    }

    public void writeInInput(WebElement inputElement, String text) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputElement);
        waitHelper.waitUntilElementWillBeVisible(inputElement);
        inputElement.sendKeys(text);
    }

    public String getValue(WebElement element) {
        waitHelper.waitUntilElementWillBeVisible(element);
        return element.getText();
    }
}
