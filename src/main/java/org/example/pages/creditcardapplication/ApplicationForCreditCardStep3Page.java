package org.example.pages.creditcardapplication;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationForCreditCardStep3Page extends BasePage {
    @FindBy(xpath = "//form/h1")
    private WebElement title;

    @FindBy(xpath = "//input[@name='mainIncome']")
    private WebElement mainIncome;

    @FindBy(xpath = "//input[@name='creditLimit']")
    private WebElement creditLimit;

    @FindBy(xpath = "//input[@name='codeWord']")
    private WebElement codeWord;

    @FindBy(xpath = "//input[@data-test-id='receiptRegion']")
    private WebElement receiptRegion;

    @FindBy(xpath = "//input[@data-test-id='receiptCity']")
    private WebElement receiptCity;

    @FindBy(xpath = "//button[@value='delivery']")
    private WebElement deliveryButton;

    @FindBy(xpath = "//button[@value='yourself']")
    private WebElement takeYourselfButton;

    @FindBy(xpath = "//button[@data-test-id='navigationButtonPrevious']")
    private WebElement navigationPreviousButton;

    @FindBy(xpath = "//button[@data-test-id='navigationButtonSubmit']")
    private WebElement continueButton;


    protected ApplicationForCreditCardStep3Page(WebDriver driver) {
        super(driver);
    }

    public boolean isAplicationForCreditCardStep3PageLoaded() {
        return super.isPageLoaded(title, mainIncome,
                creditLimit, codeWord,
                receiptRegion,
                receiptCity, deliveryButton,
                takeYourselfButton, navigationPreviousButton,
                continueButton
        );
    }


    public void writeMainIncome(String mainIncomeText) {
        inputHelper.writeInInput(mainIncome, mainIncomeText);
    }

    public void writeCreditLimit(String creditLimitText) {
        inputHelper.writeInInput(creditLimit, creditLimitText);
    }

    public void writeCodeWord(String codeWordText) {
        inputHelper.writeInInput(codeWord, codeWordText);
    }

    public void writeReceiptRegion(String receiptRegionText) {
        inputHelper.writeInInput(receiptRegion, receiptRegionText);
    }

    public void writeReceiptCity(String receiptCityText) {
        inputHelper.writeInInput(receiptCity, receiptCityText);
    }

    public void clickDeliveryButton() {
        clickHelper.click(deliveryButton);
    }

    public void clickTakeYourselfButton() {
        clickHelper.click(takeYourselfButton);
    }


    public void clickOnNavigationPreviousButton() {
        clickHelper.click(navigationPreviousButton);
    }

    public void clickOnContinueButton() {
        clickHelper.click(continueButton);
    }
}
