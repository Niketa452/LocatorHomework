import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeLoginLogout {
protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\Webdriver\\chromedriver.exe");//calling the chrome diver path
    driver = new ChromeDriver();//creating an object for the chrome driver
driver.manage().window().fullscreen();//to zoom the screen
driver.get("https://opensource-demo.orangehrmlive.com/");//Enter the url and open the webpage
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wating time before the next action
driver.findElement(By.id("txtUsername")).sendKeys("Admin");//Enter username
driver.findElement(By.name("txtPassword")).sendKeys("admin123");//Enter password
driver.findElement(By.className("button")).click();//Click on login button
driver.findElement(By.linkText("Welcome Admin")).click();//Click on 'Welcome Admim' button to Logout#
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//waiting time before the next action
driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();//Logout
Thread.sleep(5000);//waiting time before closing
driver.close(); //close the current chrome window


    }
}
