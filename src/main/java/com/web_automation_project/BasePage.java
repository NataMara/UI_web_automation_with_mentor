package com.web_automation_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //@FindBy(xpath = "(//input[@placeholder='Від:'])[1]")
   // public WebElement priceFrom;

    @FindBy(className = "3rd-category-choose-label")
    public WebElement categoryDropdown;

    @FindBy(className = "a-category-1532")
    public WebElement mainCategory;

    @FindBy(xpath = "//*[text()='Alfa Romeo']")
    public WebElement categoryAlfaRomeo;

    @FindBy(className = "cookie-close")
    public WebElement cookies;

    @FindBy(xpath = "(//input[@placeholder='Від:'])[1]")
    public WebElement priceFrom;


    public BasePage clickOnCategoryDropdown(){
        categoryDropdown.click();
        return this;
    }

    public BasePage clickOnCookies(){
        cookies.click();
        return this;

    }



}
