package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleneniumScript {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        
        String pageSource = driver.getTitle();
        System.out.println("pageSource = " + pageSource);

        String title = driver.getTitle();
        System.out.println("title = " + title);

        if(currentUrl.equals("https://www.google.com/") && title.equals("Google")){
            System.out.println("succeded");
        }

        else{
            System.out.println("worng");
        }

        driver.navigate().to("https://www.amazon.com");

        //Thread.sleep(millis:2000);

        title = driver.getTitle();
        System.out.println("title = " + title);

        if(currentUrl.equals("https://www.amazon.com")&& title.equals(("Amazon.com"))){
            System.out.println("succeded");
        }

        else{
            System.out.println("worng");
        }
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



        driver.quit();

    }
}
