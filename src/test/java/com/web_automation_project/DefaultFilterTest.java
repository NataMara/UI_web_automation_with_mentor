package com.web_automation_project;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.web_automation_project.Constants.BASE_URL;

public class DefaultFilterTest extends BaseTest {

    @Test(priority = 1)
    public void filter() {


            driver.get(BASE_URL);
            basePage.clickOnCookies();

            Assert.assertEquals(basePage.mainCategory.getText(), "Легкові автомобілі",
                    "actual result:" + basePage.mainCategory.getText());
            System.out.println("Equal");


    }

}

