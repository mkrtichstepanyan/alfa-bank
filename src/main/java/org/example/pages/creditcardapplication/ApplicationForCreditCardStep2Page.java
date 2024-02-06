package org.example.pages.creditcardapplication;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationForCreditCardStep2Page extends BasePage {
    @FindBy(xpath = "//form//h3")
    private WebElement title;

    @FindBy(xpath = "//input[@name='passportSeries']")
    private WebElement passportSeries;

    @FindBy(xpath = "//input[@name='passportNumber']")
    private WebElement passportNumber;

    @FindBy(xpath = "//input[@name='passportIssuedDate']")
    private WebElement passportIssuedDate;

    @FindBy(xpath = "//input[@name='passportIssuedCode']")
    private WebElement passportIssuedCode;

    @FindBy(xpath = "//input[@data-test-id='passportIssuedBy']")
    private WebElement passportIssuedBy;

    @FindBy(xpath = "//input[@name='passportBirthDate']")
    private WebElement passportBirthDate;

    @FindBy(xpath = "//input[@data-test-id='passportBirthPlace']")
    private WebElement passportBirthPlace;

    @FindBy(xpath = "//input[@data-test-id='passportRegion']")
    private WebElement passportRegion;


    @FindBy(xpath = "//button[@data-test-id='navigationButtonPrevious']")
    private WebElement navigationPreviousButton;

    @FindBy(xpath = "//button[@data-test-id='navigationButtonSubmit']")
    private WebElement continueButton;

    @FindBy(xpath = " //button[@data-test-id='continueDraftModalHeader-closer']")
    private WebElement popUpCloseButton;


    protected ApplicationForCreditCardStep2Page(WebDriver driver) {
        super(driver);
    }

    public boolean isAplicationForCreditCardStep2PageLoaded() {
        return super.isPageLoaded(title, passportSeries,
                passportNumber, passportIssuedDate,
                passportIssuedCode,
                passportBirthDate, passportIssuedBy,
                passportBirthPlace, passportRegion,
                navigationPreviousButton,
                continueButton
        );
    }

    public void writePassportSeries(String passportSeriesText) {
        inputHelper.writeInInput(passportSeries, passportSeriesText);
    }

    public void writePassportNumber(String passportNumberText) {
        inputHelper.writeInInput(passportNumber, passportNumberText);
    }

    public void writePassportIssuedDate(String passportIssuedDateText) {
        inputHelper.writeInInput(passportIssuedDate, passportIssuedDateText);
    }

    public void writePassportIssuedCode(String passportIssuedCodeText) {
        inputHelper.writeInInput(passportIssuedCode, passportIssuedCodeText);
    }

    public void writePassportBirthDate(String passportBirthDateText) {
        inputHelper.writeInInput(passportBirthDate, passportBirthDateText);
    }

    public void writePassportIssuedBy(String passportIssuedByText) {
        inputHelper.writeInInput(passportIssuedBy, passportIssuedByText);
    }

    public void writePassportBirthPlace(String passportBirthPlaceText) {
        inputHelper.writeInInput(passportBirthPlace, passportBirthPlaceText);
    }

    public void writePassportRegion(String passportRegionText) {
        inputHelper.writeInInput(passportRegion, passportRegionText);
    }

    public ApplicationForCreditCardStep3Page clickOnContinueButton() {
        clickHelper.click(continueButton);
        return new ApplicationForCreditCardStep3Page(driver);
    }

    public void closePopup() {
        clickHelper.click(popUpCloseButton);
    }

}
