package com.web_automation_project;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.web_automation_project.BaseTest.driver;

public class AutoNames {

    public static void main(String[] args) {

        try {
            driver.get("https://www.olx.ua/transport/legkovye-avtomobili/");
            driver.findElement(By.xpath("(//div[@class='css-1qvyz1h'])[2]")).click();
            Assert.assertEquals(driver.findElement(By.xpath("//a[@data-code='alfa-romeo']")).getText(), "Alfa Romeo");

            System.out.println(driver.findElement(By.xpath("//a[@data-code='alfa-romeo']")).getText());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}


