package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.driver.DriverFactory;
import org.example.helpers.InputHelper;
import org.example.helpers.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@Slf4j
public class BaseTest {

    protected DriverFactory driverFactory;
    protected WebDriver driver;

    protected WaitHelper waitHelper;
    protected InputHelper inputHelper;

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser) {
        log.info("Class Name: {}", this.getClass().getName());
        driverFactory = new DriverFactory();
        driverFactory.setUpDriver(browser);
        driver = driverFactory.getDriver();
        waitHelper = new WaitHelper(driver);
        inputHelper = new InputHelper(driver);
    }

    @AfterClass
    public void quit() {
        driverFactory.closeDriver();
    }
}
