package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumDemo {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Selenium World.");


        String content;
        String xpath;

        System.setProperty("webdriver.edge.driver","C:\\Users\\Ander\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http:facebook.com");
        System.out.println(driver.getTitle());
        driver.manage().deleteAllCookies();
        driver.get("http:facebook.com");

        // till
        Thread.sleep(200);
        content = " ";
        driver.findElement(By.cssSelector("#content > div > div > div > div._8esl > div > img")).getTagName();
        driver.manage().deleteAllCookies();
        System.out.println(content);

        // till
        Thread.sleep(200);
        driver.manage().deleteAllCookies();
        String pass="testSelenium@gmail.com";
        driver.findElement(By.cssSelector("#pass")).getText();
        System.out.println(pass);

        driver.get("https://yahoo.com");
        System.out.println(driver.getTitle());
        driver.manage().deleteAllCookies();
        driver.get("https://yahoo.com");

        Thread.sleep(200);
        xpath = "/html//div[@id='consent-page']/div/div//form//button[@name='agree']";
        driver.findElement(By.xpath(xpath)).click();

        Thread.sleep(200);

        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();

    }
}
