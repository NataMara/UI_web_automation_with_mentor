package com.web_automation_project;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.web_automation_project.Constants.BASE_URL;

public class PriceFieldValidationTest extends BaseTest {



    @Test
    public void price_validation() {
        driver.get(BASE_URL);
        basePage.clickOnCookies();

        basePage.priceFrom.sendKeys("ASSDuiouoi");
        // Retrieve typed value
     //   String typedValue = priceFrom.getAttribute("value");

        // Get the length of typed value
     //   int size = typedValue.length();

     //   if (size == 0) {
            System.out.println("Alphabets are not allowed.");
        }

        // Type special Characters
    //    priceFrom.clear();
    //    priceFrom.sendKeys("#%$%&");

        // Retrieve typed value
     //   String typedValue1 = priceFrom.getAttribute("value");

        // Get the length of typed value
    //    int size1 = typedValue1.length();

      //  if (size1 == 0) {
     //       System.out.println("Special characters are not allowed.");
        }

     //   String typeAttributeValue = priceFrom.getAttribute("type");

    //    if (typeAttributeValue.equals("number")) {
      //      System.out.println("Only valid numbers are allowed.");
     //   }
     //   else
     //       System.out.println("There is no restriction of Only numbers.");


  //  }

