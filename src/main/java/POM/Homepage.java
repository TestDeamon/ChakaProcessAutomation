package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    protected Loginpage loginpage;
    public Homepage(WebDriver driver){this.driver = driver;}

    public Loginpage clickLoginLink() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.linkText("Log In")).click();
//        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/ul/li[1]/a")).click();
        return new Loginpage(driver);
    }

}
