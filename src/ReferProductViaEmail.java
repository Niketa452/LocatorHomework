import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ReferProductViaEmail {
    protected static WebDriver driver;//calling webdriver
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\Webdriver\\chromedriver.exe");//calling the chromedriver path
        driver = new ChromeDriver();//creating chrome driver object
        driver.manage().window().fullscreen();//to maximise the web page.
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//waiting time before opening teh website
        driver.get("https://demo.nopcommerce.com/");//web page url given
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();//to click on register button for registration
        driver.findElement(By.id("FirstName")).sendKeys("Niketa");//registration form compulsory fields to be filled, Enter name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Parekh");//Enter surname
        driver.findElement(By.name("Email")).sendKeys("hellojava1@gmail.com");//Enter email
        driver.findElement(By.id("Password")).sendKeys("london26");//Enter password
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("london26");//Enter Confirm password
        driver.findElement(By.xpath("//input[@type='submit' and @name='register-button']")).click();//click on register button
        driver.findElement(By.xpath("//img")).click();//returning back to the home page for purchasing
        driver.findElement(By.linkText("Computers")).click();//click on computers category
        driver.findElement(By.linkText("Notebooks")).click();//click on notebook category
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();//selecting preferred notebook
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();//clicking on the email a friend button to refer the product
        driver.findElement(By.className("friend-email")).sendKeys("karishma@gmail.com");//Enter friend's email address
        driver.findElement(By.xpath("//textarea")).sendKeys("Hi, this looks like a great product. Consider buying?");
        driver.findElement(By.name("send-email")).click();//Click on send button
        Thread.sleep(5000);//waiting time before closing
        driver.close();//chrome browser close
















    }




}
