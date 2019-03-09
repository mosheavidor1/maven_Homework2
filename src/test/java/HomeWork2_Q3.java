import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class HomeWork2_Q3 {

        private static WebDriver driver;

        @BeforeClass
        public static void bc() throws MalformedURLException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.youtube.com/");
            driver.manage().window().maximize();
        }



        @Test


        public void Test01_run() {


            //WebElement YouTubeButton = driver.findElement(By.id("logo-icon-container"));
            driver.get("https://www.cnn.com/");
            System.out.println("hello");



        }

        @Test


        public void Test02_run() {

            driver.get("https://www.ynet.co.il/");


        }


        @AfterClass
        public static void ac() {
            driver.quit();
        }

    }




