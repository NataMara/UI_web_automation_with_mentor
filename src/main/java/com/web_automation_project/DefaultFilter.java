package com.web_automation_project;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.web_automation_project.BaseTest.driver;

public class DefaultFilter {

    public static void main(String[] args) {

         driver.get("https://www.olx.ua/transport/legkovye-avtomobili/");
         String category = driver.findElement(By.className("rel combospace")).getText();
        System.out.println(category);
    }
}

