import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Test {
protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\Webdriver\\chromedriver.exe");


driver = new ChromeDriver();//creating object of the chrome driver
driver.manage().window().fullscreen();//to zoom the screen
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//waiting time before opening teh website
driver.get("https://demo.nopcommerce.com/");//open website url on the chrome browser
driver.findElement(By.xpath("//a[@class='ico-register']")).click();//click on the register button
driver.findElement(By.id("FirstName")).sendKeys("Niketa");//Enter compulsory field, username
driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Parekh");//Enter password
driver.findElement(By.name("Email")).sendKeys("niketa246@yahoo.com");//Enter email address
driver.findElement(By.id("Password")).sendKeys("london26");//Enter password
driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("london26");//Enter Confirm password
driver.findElement(By.xpath("//input[@type='submit' and @name='register-button']")).click();//click on regisgter button
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);//waiting time before website closes
driver.close();//close the current chrome window











    }

}
