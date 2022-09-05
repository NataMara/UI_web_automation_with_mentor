package com.web_automation_project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {


    public static WebDriver driver;
    public static BasePage basePage;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
      //  System.setProperty("webdriver.chrome.driver", "/Users/nmary/Desktop/Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        basePage = new BasePage(driver);
    }


    @AfterClass
    public static void afterClass() {
        driver.close();
        driver.quit();
        System.out.println("Test Completed successfully");
    }
}
