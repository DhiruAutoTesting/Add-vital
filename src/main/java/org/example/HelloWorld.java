package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:/Users/DELL-PC/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Login page
        driver.get("https://onehealthassist.com/individual-login");
        Thread.sleep(3000);
        driver.findElement(By.name("phone")).sendKeys("7021302938");
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div[1]/form/div/div[4]/button")).click();
        Thread.sleep(3000);

        //Otp Login
        driver.findElement(By.name("otp1")).sendKeys("1");
        driver.findElement(By.name("otp2")).sendKeys("3");
        driver.findElement(By.name("otp3")).sendKeys("1");
        driver.findElement(By.name("otp4")).sendKeys("3");
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div[2]/form/input[2]")).click();

        //Book lab test
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[5]/a")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/section[2]/div/div[1]/a")).click();
        js.executeScript("window.scrollBy(0,2200)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[22]/div/div[3]/button")).click();

        //Book lab test form for self
//        Thread.sleep(3000);
//        driver.findElement(By.name("pincode")).clear();
//        driver.findElement(By.name("pincode")).sendKeys("400072");
//        driver.findElement(By.name("age")).sendKeys("26");
//        driver.findElement(By.name("gender")).sendKeys("Male");
//        driver.findElement(By.name("address")).sendKeys("B-20, bholenath society,tilak nagar, sakinaka,Mumbai,ghatkopar west anis compound ");
//        driver.findElement(By.name("slotDate")).sendKeys("11-05-2024");
//        driver.findElement(By.id("selectSlot")).sendKeys("09:00-09:30");
//        driver.findElement(By.name("paymentMode")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[2]/div/form/div[2]/div[14]/button")).click();

        //Book lab test for other form
        driver.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[1]/div[3]/input")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-2200)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/form/div[2]/div[2]/input")).sendKeys("400072");
        driver.findElement(By.name("name")).sendKeys("Dhiraj Suryawanshi");
        driver.findElement(By.name("phone")).sendKeys("7021302938");
        driver.findElement(By.name("email")).sendKeys("dhirajsuryawanshi97686@gmail.com");
        driver.findElement(By.name("age")).sendKeys("26");
        driver.findElement(By.id("gender")).sendKeys("Male");
        driver.findElement(By.id("address")).sendKeys("B-20, bholenath society,tilak nagar, sakinaka,Mumbai,ghatkopar west anis compound");
       // Thread.sleep(4000);
        WebElement dateElement = driver.findElement(By.className("ui-datepicker-date"));
        WebElement monthElement = driver.findElement(By.className("ui-datepicker-month"));
        WebElement yearElement = driver.findElement(By.className("ui-datepicker-year"));
        Select dateSelect = new Select(dateElement);
        Select monthSelect = new Select(monthElement);
        Select yearSelect = new Select(yearElement);
        monthSelect.selectByVisibleText("May"); // Select desired month
        yearSelect.selectByVisibleText("2022");
        driver.findElement(By.id("selectSlot"));
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.id("selectSlot"));
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText("06:00-06:30");
       // driver.findElement(By.id("selectSlot")).sendKeys("06:00-06:30");
        driver.findElement(By.name("paymentMode")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/form/div[2]/div[14]/button")).click();










        //driver.close();
    }
}