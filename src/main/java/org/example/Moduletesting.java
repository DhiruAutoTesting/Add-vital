package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Moduletesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/DELL-PC/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://onehealthassist.com/patient-profile");
        // Login page
        driver.findElement(By.id("phone_number")).sendKeys("7021302938");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"replace_div\"]/div[1]/form/div/div[4]/button")).click();
        Thread.sleep(3000);

        //OTP Page
        driver.findElement(By.name("otp1")).sendKeys("1");
        driver.findElement(By.name("otp2")).sendKeys("3");
        driver.findElement(By.name("otp3")).sendKeys("1");
        driver.findElement(By.name("otp4")).sendKeys("3");
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div[2]/form/input[2]")).click();
        Thread.sleep(3000);
        driver.get("https://onehealthassist.com/patient-profile");
        Thread.sleep(4000);

        // Sign Up new user Otp Login
//        driver.findElement(By.name("otp1")).sendKeys("1");
//        driver.findElement(By.name("otp2")).sendKeys("3");
//        driver.findElement(By.name("otp3")).sendKeys("1");
//        driver.findElement(By.name("otp4")).sendKeys("3");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div/form/div[2]/div[2]/button")).click();
//        Thread.sleep(3000);
//       driver.get("https://onehealthassist.com/patient-profile");
//       Thread.sleep(3000);

        //New Patient web sign up
//        driver.findElement(By.name("full_name")).sendKeys("New user of patient testing");
//        driver.findElement(By.name("dob")).sendKeys("07/07/1997");
//        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/form/div/div[2]/div/div[4]/label[1]")).click();
//        driver.findElement(By.name("email")).sendKeys("Testinguser123@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("Testing@123");
//        driver.findElement(By.name("state")).sendKeys("Maharashtra");
//        driver.findElement(By.id("inputDistrict")).sendKeys("Mumbai City");
//        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/form/div/div[2]/div/div[8]/input")).sendKeys("400072");
        //Thread.sleep(3000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 300)");
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/form/div/div[2]/div/div[9]/button")).click();
//        Thread.sleep(4000);
//        js.executeScript("window.scrollBy(0,-200)");
//
//        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div/div/div[4]/button")).click();
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div/div/div[4]/a/button")).click();

        // (1) Medical Records (X-Ray file uploading)

        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/aside/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/nav/div/div[2]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("diagnosticfile")).sendKeys("D:\\Sample Reports\\xray sample two.jpg");
        driver.findElement(By.name("fileName")).sendKeys("Sample Xray File");
        driver.findElement(By.id("diaDate")).sendKeys("05/15/2024");
        driver.findElement(By.name("report_type")).sendKeys("X-Ray");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();

        // (2) Medical Records (diagnostic file uploading)

//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/nav/div/div[2]/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("diagnosticfile")).sendKeys("D:\\Sample Reports\\Diagnostic File Sample Image.webp");
//        driver.findElement(By.name("fileName")).sendKeys("Diagnostic File");
//        driver.findElement(By.id("diaDate")).sendKeys("05/15/2024");
//        driver.findElement(By.name("report_type")).sendKeys("diagnostic");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();

        // (3) PAT files
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/nav/div/div[2]/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("diagnosticfile")).sendKeys("D:\\Sample Reports\\Pat File Sample Reports.jpg");
//        driver.findElement(By.name("fileName")).sendKeys("Pat File");
//        driver.findElement(By.id("diaDate")).sendKeys("05/15/2024");
//        driver.findElement(By.name("report_type")).sendKeys("PAT");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();

        // (4) Angiography File

//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/nav/div/div[2]/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("diagnosticfile")).sendKeys("D:\\Sample Reports\\Angiography Sample Report.jpg");
//        driver.findElement(By.name("fileName")).sendKeys("Angiography File");
//        driver.findElement(By.id("diaDate")).sendKeys("05/15/2024");
//        driver.findElement(By.name("report_type")).sendKeys("Angiography");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();

        // (5) CT Scan File
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/nav/div/div[2]/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("diagnosticfile")).sendKeys("D:\\Sample Reports\\Ct Scan Sample Reports.jpg");
//        driver.findElement(By.name("fileName")).sendKeys("CT Scan File");
//        driver.findElement(By.id("diaDate")).sendKeys("05/15/2024");
//        driver.findElement(By.name("report_type")).sendKeys("CT Scan");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();

        // (6) Ultrasound File
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/nav/div/div[2]/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("diagnosticfile")).sendKeys("D:\\Sample Reports\\Ultrasound Sample File.mp4");
//        driver.findElement(By.name("fileName")).sendKeys("Ultrasound File");
//        driver.findElement(By.id("diaDate")).sendKeys("05/15/2024");
//        driver.findElement(By.name("report_type")).sendKeys("Ultrasound");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();

        // (7) Lab Report File
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/nav/div/div[2]/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("diagnosticfile")).sendKeys("D:\\Sample Reports\\Lab Sample Report.jpg");
//        driver.findElement(By.name("fileName")).sendKeys("Lab Report File");
//        driver.findElement(By.id("diaDate")).sendKeys("05/15/2024");
//        driver.findElement(By.name("report_type")).sendKeys("Lab Report");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();


        // (8) Others File
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/nav/div/div[2]/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("diagnosticfile")).sendKeys("D:\\Sample Reports\\Others Sample Reportes.png");
//        driver.findElement(By.name("fileName")).sendKeys("Other Files");
//        driver.findElement(By.id("diaDate")).sendKeys("05/15/2024");
//        driver.findElement(By.name("report_type")).sendKeys("Others");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button")).click();

        //Upload Prescriptions

//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[1]/div[2]/a")).click();
//        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[4]/div/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("prescriptionFile")).sendKeys("D:\\Sample Reports\\Prescription image.png");
//        driver.findElement(By.name("date")).sendKeys("05/16/2024");
//        Thread.sleep(2000);
//        driver.findElement(By.id("prefixInput")).sendKeys("Dhiraj Suryawanshi");
//        driver.findElement(By.xpath("//*[@id=\"prescriptionForm\"]/div[3]/button")).click();

        //My Vaccination certificates
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[1]/div[3]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[5]/div[1]/div/button")).click();
        driver.findElement(By.id("vaccinationFile")).sendKeys("D:\\Sample Reports\\Sample Vaccination Report.jpg");
        Thread.sleep(2000);
        driver.findElement(By.id("vaccinationName")).sendKeys("Corona Vaccine");
        driver.findElement(By.id("vaccinationDate")).sendKeys("05/16/2024");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/form/div[3]/button")).click();

        //find Doctors
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/header/nav[1]/ul/li[3]/a")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/a[1]/button")).click();
        js.executeScript("window.scrollBy(0, 400)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[4]/div[2]/div/div[1]/form/div/div[1]/div/div/div/ul/div[1]/div/div[10]/div/li/span[2]")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 300)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[4]/div[2]/div/div[1]/form/div/div[2]/div[1]/div/div/ul[3]/li/p[7]/span")).click();
        js.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[4]/div[2]/div/div[1]/form/div/div[2]/div[2]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("pay_at_clinic")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/form/div/div/div[2]/div/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div/button/a")).click();






        // Close the browser
        // driver.quit();
    }
}
