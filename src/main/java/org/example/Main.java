package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        TimeUnit.SECONDS.sleep(1);

        WebElement search = driver.findElement(
                By.cssSelector("#APjFqb"));

        search.sendKeys("Selenium");

        search.sendKeys(Keys.ENTER);

        TimeUnit.SECONDS.sleep(5);

        driver.close();;



    }
}