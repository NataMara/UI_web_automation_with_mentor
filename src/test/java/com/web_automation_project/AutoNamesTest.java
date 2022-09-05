package com.web_automation_project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.web_automation_project.Constants.BASE_URL;

public class AutoNamesTest extends BaseTest {


    @Test
    public void category_name() {


        driver.get(BASE_URL);
        basePage.clickOnCookies();
        basePage.clickOnCategoryDropdown();
//add comment
        Assert.assertEquals(basePage.categoryAlfaRomeo.getText().substring(0, 10), "Alfa Romeo",
                "actual result:" + basePage.categoryAlfaRomeo.getText());
        System.out.println("Equal");


    }
}



