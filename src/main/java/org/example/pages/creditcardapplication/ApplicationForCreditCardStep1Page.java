package org.example.pages.creditcardapplication;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationForCreditCardStep1Page extends BasePage {
    @FindBy(xpath = "//form[@id='hundredDaysForm']//h2")
    private WebElement title;

    @FindBy(xpath = "//form[@id='hundredDaysForm']//input[@name='fullName']")
    private WebElement fullNameInput;

    @FindBy(xpath = "//form[@id='hundredDaysForm']//input[@name='phone']")
    private WebElement phoneInput;

    @FindBy(xpath = "//form[@id='hundredDaysForm']//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@data-test-id='sex-f']")
    private WebElement sexFemaleButton;

    @FindBy(xpath = "//button[@data-test-id='sex-m']")
    private WebElement sexMaleButton;

    @FindBy(xpath = "//div[@data-test-id='checkbox']")
    private WebElement sopdConfirmationCheckbox;

    @FindBy(xpath = "//form[@id='hundredDaysForm']//input[@name='isAdvertisingAccepted']")
    private WebElement advertisingAcceptionCheckbox;

    @FindBy(xpath = "//form[@id='hundredDaysForm']//button[@type='submit']")
    private WebElement continueButton;


    public ApplicationForCreditCardStep1Page(WebDriver driver) {
        super(driver);
    }

    public boolean isAplicationForCreditCardStep1PageLoaded() {
        return super.isPageLoaded(title, fullNameInput,
                phoneInput, emailInput,
                sexFemaleButton, sexMaleButton,
                sopdConfirmationCheckbox,
                advertisingAcceptionCheckbox, continueButton
        );
    }

    public void writeFullName(String fullName) {
        inputHelper.writeInInput(fullNameInput, fullName);
    }

    public void writePhone(String phoneNumber) {
        inputHelper.writeInInput(phoneInput, phoneNumber);
    }

    public void writeEmail(String email) {
        inputHelper.writeInInput(emailInput, email);
    }

    public void clickOnSexMaleButton() {
        clickHelper.click(sexMaleButton);
    }

    public void clickOnSopdConfirmationCheckbox() {
        clickHelper.click(sopdConfirmationCheckbox);
    }

    public void clickOnAdvertisingAcceptionCheckbox() {
        clickHelper.click(advertisingAcceptionCheckbox);
    }

    public ApplicationForCreditCardStep2Page clickOnContinueButton() {
        clickHelper.click(continueButton);
        return new ApplicationForCreditCardStep2Page(driver);
    }
}
