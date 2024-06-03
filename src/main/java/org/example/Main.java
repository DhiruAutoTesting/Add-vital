package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class Main {
    public static <javascriptExecutor> void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:/Users/DELL-PC/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://onehealthassist.com/individual-login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.manage().deleteAllCookies();

        //Login page
        driver.findElement(By.id("phone_number")).sendKeys("7021302938");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"replace_div\"]/div[1]/form/div/div[4]/button")).click();
        Thread.sleep(3000);
        //driver.manage().deleteAllCookies();

        //OTP Page
        driver.findElement(By.name("otp1")).sendKeys("1");
        driver.findElement(By.name("otp2")).sendKeys("3");
        driver.findElement(By.name("otp3")).sendKeys("1");
        driver.findElement(By.name("otp4")).sendKeys("3");
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div[2]/form/input[2]")).click();
        Thread.sleep(3000);
        driver.get("https://onehealthassist.com/patient-profile");
        Thread.sleep(4000);

        //Scrolling down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

//        Add family
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/aside/ul/li[8]/a")).click();
        //driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/button")).click(); //Use this line if there is no family member added
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div/div[1]/div/button")).click(); //"use this command if atleast one family member is added"
        //"use this command if atleast one family member is added"
        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Dhiraj Suryawanshi testing one");
        driver.findElement(By.name("dob")).sendKeys("05-06-2023");
        driver.findElement(By.name("gender")).sendKeys("Male");
        driver.findElement(By.id("phone")).sendKeys("7021302938");
        driver.findElement(By.name("email")).sendKeys("dhirajsuryawanshi97686@gmail.com");
        driver.findElement(By.name("height")).sendKeys("144");
        driver.findElement(By.name("weight")).sendKeys("70");
        driver.findElement(By.name("blood_group")).sendKeys("A+");
        driver.findElement(By.name("relation")).sendKeys("Uncle");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 100)");

        //Tap on save button
        driver.findElement(By.name("submit")).click();
        //status successfully run.

        //Add infant
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
        //Adding infants
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/aside/ul/li[7]/a")).click();
        Thread.sleep(5000);
        //Use this line when atleast one infant already added.
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/button")).click();
        //driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div/button")).click();//If there is no infant added then unable this line of code.
        driver.findElement(By.name("name")).sendKeys("Dodo Suryawanshi");
        driver.findElement(By.name("gender")).sendKeys("Boy");
        driver.findElement(By.name("dob")).sendKeys("07-07-1997");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/form/div/div[6]/select")).sendKeys("A+");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/form/div/div[7]/button")).click();
        Thread.sleep(3000);

        //Pill management
//        js.executeScript("window.scrollBy(0,600)");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/aside/ul/li[10]/a")).click();
//        js.executeScript("window.scrollBy(0,-600)");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.name("medicine_name")).sendKeys("Dol0 650");
//        driver.findElement(By.name("quantity")).sendKeys("10");
//        driver.findElement(By.name("taken")).sendKeys("Lunch");
//        driver.findElement(By.name("Intake")).sendKeys("Before Meal");
//        driver.findElement(By.name("valid_date")).sendKeys("07-07-1997");
//        driver.findElement(By.name("valid_time")).sendKeys("10:20","AM");
//        driver.findElement(By.name("submit")).click();

        //Add pet
//        Thread.sleep(3000);
//        js.executeScript("window.scrollBy(0,300)");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/aside/ul/li[9]/a")).click();
//        driver.findElement(By.className("tbl_btn")).click();
//        driver.findElement(By.className("input_p")).sendKeys("Dolly mamachi");
//        driver.findElement(By.name("species")).sendKeys("Marathi");
//        driver.findElement(By.name("breed")).sendKeys("Pune");
//        driver.findElement(By.name("dob")).sendKeys("08-08-1995");
//        driver.findElement(By.id("gender")).sendKeys("Male");
//        driver.findElement(By.name("color")).sendKeys("White");
//        driver.findElement(By.name("weight")).sendKeys("30");
//        driver.findElement(By.name("height")).sendKeys("155");
//        driver.findElement(By.name("distinctive_marks")).sendKeys("Cut on the leg");
//        js.executeScript("window.scrollBy(0,400)");
//        Thread.sleep(3000);
//        driver.findElement(By.name("submit")).click();
//        Thread.sleep(3000);

        //Add vital
        //Add Blood pressure
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/aside/ul/li[11]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("vital_date")).sendKeys("05/05/2024");
        driver.findElement(By.name("vital_time")).sendKeys("10:10 ,AM");
        driver.findElement(By.name("highBP")).sendKeys("123");
        driver.findElement(By.name("lowBP")).sendKeys("111");
        driver.findElement(By.id("save-button")).click();
        Thread.sleep(3000);

        //Add Pulse rate
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[1]/div[2]/div/p")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@class='tbl_btn']")).click();
//        driver.findElement(By.xpath("//input[@name='pulse_date']")).sendKeys("05/21/2024");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@value='10:29']")).sendKeys("08:33,PM");
//        driver.findElement(By.xpath("//input[@name='pulsehigh']")).sendKeys("133");
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();
//        Thread.sleep(2000);

        //Add Blood Glucose

        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[1]/div[3]/div/h6")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div/button")).click();
        //driver.manage().deleteAllCookies();
        Thread.sleep(4000);
        driver.findElement(By.name("glucose_date")).sendKeys("05/18/2024");
        driver.findElement(By.name("glucose_time")).sendKeys("04:04,AM");
        driver.findElement(By.name("highGlucose")).sendKeys("173");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div[3]/button']")).click();

        // Add tempreture

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[2]/div[4]/div[1]/div/button")).click();
        driver.findElement(By.name("tem_date")).sendKeys("01:01,PM");
        driver.findElement(By.name("hightemp")).sendKeys("33");
        Thread.sleep(1000);
        driver.findElement(By.id("save-button")).click();

        //

        //driver.findElement(By)

        //Add Health policy

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/aside/ul/li[12]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("C:\\Users\\DELL-PC\\Desktop\\waves.jpg");
        Thread.sleep(2000);
        driver.findElement(By.name("company_name")).sendKeys("TATA AIA");
        driver.findElement(By.name("date_from")).sendKeys("05/05/2024");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dueDateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("due_date")));

        // Clear the input field
        dueDateField.clear();

        // Send the date
        dueDateField.sendKeys("06/06/2024");
        driver.findElement(By.name("agent_name")).sendKeys("Dhiraj Suryawanshi");
        driver.findElement(By.name("mobile")).sendKeys("7021302938");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[3]/button")).click();




//        js.executeScript("window.scrollBy(0,-500)");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/header/nav[1]/ul/li[5]/a")).click();
//        js.executeScript("window.scrollBy(0,400)");
//        driver.findElement(By.xpath("/html/body/div[5]/section[2]/div/div[1]/a")).click();


        //driver.close();


    }
}