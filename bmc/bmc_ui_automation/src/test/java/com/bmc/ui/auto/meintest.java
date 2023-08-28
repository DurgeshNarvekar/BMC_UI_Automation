package com.bmc.ui.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meintest {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
