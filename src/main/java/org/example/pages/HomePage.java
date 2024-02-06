package org.example.pages;

import org.example.pages.creditcardapplication.ApplicationForCreditCardStep1Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@id='popular-products-block']//p")
    public WebElement popularProductsTitle;

    // TODO: 06.02.25 Here can be other elements in the homepage

    @FindBy(xpath = "//a[@rel='noopener noreferrer' and @href='/get-money/credit-cards/bez-poseshheniya-banka/']")
    public WebElement linkCreateCreditCardWithoutVisitinBank;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePageLoaded() {
        return super.isPageLoaded(popularProductsTitle, linkCreateCreditCardWithoutVisitinBank);
    }

    public ApplicationForCreditCardStep1Page goToCreateNewCardWithoutVisitingBankPage() {
        clickHelper.click(linkCreateCreditCardWithoutVisitinBank);
        return new ApplicationForCreditCardStep1Page(driver);
    }
}
