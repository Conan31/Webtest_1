package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class TestFierfox {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.firefox.bin","/Applications/IBM Firefox.app/Contents/MacOS/firefox");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,10);
    }
    @Test
    public void myTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnK")).click();
        wait.until(titleIs("webdriver - Поиск в Google"));
    }
    @After
    public void stop() {
        driver.quit();
        driver = null;
    }



}
