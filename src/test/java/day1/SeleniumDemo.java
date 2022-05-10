package day1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Users\\Ander\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http:facebook.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
