package org.example.pages;

import org.example.helpers.ClickHelper;
import org.example.helpers.InputHelper;
import org.example.helpers.WaitHelper;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;
    protected WaitHelper waitHelper;
    protected ClickHelper clickHelper;
    protected InputHelper inputHelper;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        inputHelper = new InputHelper(driver);
        clickHelper = new ClickHelper(driver);
    }

    public boolean isPageLoaded(WebElement... elements) {
        try {
            waitHelper.waitForAllElementsToBeVisible(elements);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
