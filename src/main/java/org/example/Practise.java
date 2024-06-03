    package org.example;

    import org.openqa.selenium.By;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class Practise {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:/Users/DELL-PC/Downloads/chromedriver-win64/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();


                // Login page
                driver.get("https://onehealthassist.com/individual-login");
                Thread.sleep(3000);
                driver.findElement(By.name("phone")).sendKeys("7021302938");
                driver.findElement(By.xpath("//button[@class='Continue_button w-100 Continue_button_click']")).click();
                Thread.sleep(3000);

                // OTP Login
                driver.findElement(By.name("otp1")).sendKeys("1");
                driver.findElement(By.name("otp2")).sendKeys("3");
                driver.findElement(By.name("otp3")).sendKeys("1");
                driver.findElement(By.name("otp4")).sendKeys("3");
                driver.findElement(By.xpath("//input[@value='Continue']")).click();
                Thread.sleep(3000);

                // Navigate to patient profile
                driver.get("https://onehealthassist.com/patient-profile");
                Thread.sleep(2000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0, 400)");
                Thread.sleep(3000);

                //Move to add vital
               driver.findElement(By.xpath("//a[@href='https://onehealthassist.com/vitals']")).click();
               Thread.sleep(3000);
//               driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[1]/div[2]/div/p")).click();
//               Thread.sleep(2000);
//               driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/button")).click();
//               Thread.sleep(3000);
//               driver.findElement(By.xpath("//input[@name='pulse_date']")).sendKeys("05/20/2024");
//               driver.findElement(By.xpath("//input[@name='pulse_time']")).sendKeys("01:02,PM");
//               driver.findElement(By.xpath("//input[@name='pulsehigh']")).sendKeys("100");
//               Thread.sleep(4000);
//               driver.findElement(By.id("save-button")).click();
                 //Thread.sleep(4000);

            //Blood Glucose
            driver.findElement(By.xpath("//div[@ href='#BloodGlucoseTab']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@name='glucose_date']")).sendKeys("05/25/2024");
            driver.findElement(By.xpath("//input[@name='glucose_time']")).sendKeys("02:00,AM");
            driver.findElement(By.xpath("//input[@name='highGlucose']")).sendKeys("100");
            Thread.sleep(4000);
            driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div[3]/button")).click();
            //Tempreture
            Thread.sleep(3000);
//            driver.findElement(By.xpath("//div[@href='#TemperatureTab']")).click();
//            driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[2]/div[4]/div[1]/div/button")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//input[@name='tem_date']")).sendKeys("05/25/2024");
//            driver.findElement(By.xpath("//input[@name='tem_date']")).sendKeys("03:00,AM");
//            driver.findElement(By.xpath("//input[@name='hightemp']")).sendKeys("20");
//            Thread.sleep(4000);
//            driver.findElement(By.xpath("/html/body/div[5]/div/div/form/div[3]/button")).click();
//            Thread.sleep(4000);

            //Respiration rate
//            driver.findElement(By.xpath("//*[@href='#RespirationRateTab']")).click();
//            Thread.sleep(5000);
//            driver.findElement(By.xpath("//button[@class='tbl_btn px-3 mt-5' and @data-bs-toggle='modal' and @data-bs-target='#exampleModal4'] ")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//input[@name='oxygen_date']")).sendKeys("05/27/2024");
//            driver.findElement(By.xpath("//*[@name='oxygen_time']")).sendKeys("07:07,AM");
//            driver.findElement(By.xpath("//input[@name='oxygen_level' and @class='w-100']")).sendKeys("777");
//            Thread.sleep(5000);
//            driver.findElement(By.xpath("//div[@id='exampleModal4']//button[@id='save-button']")).click();

            //Add Weight
            driver.findElement(By.xpath("//div[@class='vitels_show_box btn6']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[2]/div[2]/div[6]/div[1]/div/button")).click();
            Thread.sleep(4000);
            driver.findElement(By.name("weight_date")).sendKeys("05/29/2024");
            driver.findElement(By.name("weight_time")).sendKeys("12:30,PM");
            driver.findElement(By.xpath("//input[@name='weight']")).sendKeys("99");
            Thread.sleep(4000);
            driver.findElement(By.xpath("//div[@id='exampleModal5']//button[@type='submit']")).click();



        }
        }