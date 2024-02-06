package org.example.helpers;


import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitHelper {
    Wait<WebDriver> wait;
    private final int DEFAULT_TIME_OUT = 10;

    public WebDriver driver;

    public WaitHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(DEFAULT_TIME_OUT));
    }

    public WebElement waitUntilElementWillBeVisible(WebElement webElement) {
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public WebElement waitUntilElementWillBeVisible(WebElement webElement, int seconds) {
        Wait<WebDriver> wait = new WebDriverWait(this.driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public WebElement waitForElementToBeClickable(WebElement webElement) {
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void checkInvisibilityOfElements(WebElement... elements) {
        wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
    }

    public void waitForAllElementsToBeVisible(WebElement... elements) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    @SneakyThrows
    public void waitForSeconds(int seconds) {
        TimeUnit.SECONDS.sleep(seconds);
    }
}
