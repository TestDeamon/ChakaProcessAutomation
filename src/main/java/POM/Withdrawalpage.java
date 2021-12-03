package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Withdrawalpage {
    private WebDriver driver;


    public Withdrawalpage(WebDriver driver){this.driver = driver;}

    public void clickWithdrawalBtn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/main/section/section/div/section[2]/div/div[2]/div[1]/div[2]/button[3]")).click();
    }



}
