package org.example.alphabank.positivetests.creditcardapplication;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.example.BaseTest;
import org.example.pages.HomePage;
import org.example.pages.creditcardapplication.ApplicationForCreditCardStep1Page;
import org.example.pages.creditcardapplication.ApplicationForCreditCardStep2Page;
import org.example.pages.creditcardapplication.ApplicationForCreditCardStep3Page;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Slf4j
public class CreateCreditCardWithoutVisitingBankTest extends BaseTest {
    HomePage homePage;
    ApplicationForCreditCardStep1Page applicationForCreditCardStep1Page;
    ApplicationForCreditCardStep2Page applicationForCreditCardStep2Page;
    ApplicationForCreditCardStep3Page applicationForCreditCardStep3Page;

    @BeforeMethod
    public void goToUrl() {
        log.info("Open alfabank home page");
        driver.get("https://alfabank.ru/");
        homePage = new HomePage(driver);

        log.info("Home Page is Loaded Successfully");
        Assertions.assertThat(homePage.isHomePageLoaded())
                .withFailMessage("Home page is not loaded")
                .isTrue();
    }

    @Test
    public void validateCreateCreditCardWithoutVisitingBankWithValidDataTest() {
        log.info("Go to Create credit card without visiting bank page");
        applicationForCreditCardStep1Page = homePage.goToCreateNewCardWithoutVisitingBankPage();

        log.info("Page should be loaded successfully");
        applicationForCreditCardStep1Page.isAplicationForCreditCardStep1PageLoaded();

        log.info("Write correct full name");
        applicationForCreditCardStep1Page.writeFullName("Степанян Мкртыч Суренович");

        log.info("Write correct phone number");
        applicationForCreditCardStep1Page.writePhone("9011231231");

        log.info("Write correct email");
        applicationForCreditCardStep1Page.writeEmail("mkrtichstepanyan1990@gmail.com");

        log.info("Click on Male sex button");
        applicationForCreditCardStep1Page.clickOnSexMaleButton();

        log.info("Accept spod checkbox");
        applicationForCreditCardStep1Page.clickOnSopdConfirmationCheckbox();

//        log.info("Accept advertising checkbox");
//        applicationForCreditCardStep1Page.clickOnAdvertisingAcceptionCheckbox();

        log.info("Click on Continue button");
        applicationForCreditCardStep2Page = applicationForCreditCardStep1Page.clickOnContinueButton();

        log.info("Close Popup");
        applicationForCreditCardStep2Page.closePopup();

        log.info("Page should be loaded successfully");
        applicationForCreditCardStep2Page.isAplicationForCreditCardStep2PageLoaded();

        log.info("Write correct passport series");
        applicationForCreditCardStep2Page.writePassportSeries("1111");

        log.info("Write correct passport number");
        applicationForCreditCardStep2Page.writePassportNumber("111111");

        log.info("Write correct passport issued date");
        applicationForCreditCardStep2Page.writePassportIssuedDate("12.10.2023");

        log.info("Write correct passport issued code");
        applicationForCreditCardStep2Page.writePassportIssuedCode("111111");

        log.info("Write correct passport issued by");
        applicationForCreditCardStep2Page.writePassportIssuedBy("ГЮМРИ 016");

        log.info("Write correct passport Birth date");
        applicationForCreditCardStep2Page.writePassportBirthDate("14.11.1990");

        log.info("Write correct passport Birth place");
        applicationForCreditCardStep2Page.writePassportBirthPlace("ГЮМРИ");

        log.info("Write correct passport Birth place");
        applicationForCreditCardStep2Page.writePassportRegion("Москва");


        log.info("Click on Continue button");
        applicationForCreditCardStep3Page = applicationForCreditCardStep2Page.clickOnContinueButton();

        log.info("Page should be loaded successfully");
        applicationForCreditCardStep3Page.isAplicationForCreditCardStep3PageLoaded();

        log.info("Write correct main income");
        applicationForCreditCardStep3Page.writeMainIncome("100000");

        log.info("Write correct main income");
        applicationForCreditCardStep3Page.writeMainIncome("100000");

        log.info("Write correct credit limit");
        applicationForCreditCardStep3Page.writeCreditLimit("500000");

        log.info("Write correct code word");
        applicationForCreditCardStep3Page.writeCodeWord("myCodeWord1");

        log.info("Write correct receipt region");
        applicationForCreditCardStep3Page.writeReceiptRegion("Москва");

        log.info("Write correct receipt city");
        applicationForCreditCardStep3Page.writeReceiptCity("Москва");


        waitHelper.waitForSeconds(10);
//        log.info("Click on Continue button");
//        applicationForCreditCardStep3Page.clickOnContinueButton();
    }
}
