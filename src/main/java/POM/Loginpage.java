package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    private WebDriver driver;
    protected Landingpage landingpage;
//    protected Fundingpage fundingpage;

    public Loginpage(WebDriver driver){this.driver = driver;}

    public void enterLoginDetails(String email, String password) throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#app > main > div > form > div:nth-child(3) > label > input")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(4000);
    }
    public Landingpage clickLogin() throws InterruptedException{


        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -350)", "Hello");

        Thread.sleep(4000);
        return new Landingpage(driver);
    }
}
