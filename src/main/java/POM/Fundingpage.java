package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Fundingpage {
    private WebDriver driver;
    public Fundingpage(WebDriver driver){this.driver = driver;}

    //Fund wallet
    public void fundWallet(String amount) throws InterruptedException {
        //Select Wallet Menu
        driver.findElement(By.linkText("Wallets")).click();

        Thread.sleep(5000);

        //Select Fund Button
        driver.findElement(By.cssSelector(".accounts-wallet__buttons button")).click();

        Thread.sleep(2000);
        //Enter Amount Field
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/label/input")).sendKeys(amount);
        Thread.sleep(2000);

        //Select Continue
        driver.findElement(By.cssSelector("button.btn__primary:nth-child(2)")).click();

        Thread.sleep(2000);

        //Select Monify
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/button[4]")).click();
//        driver.findElements(By.className("btn btn-fund")).get(3).click();


//        999999999999999999999999999999999999999999999
        Thread.sleep(9000);
        //Select Pay with Card
        driver.findElements(By.className("text-section")).get(1).click();


        Thread.sleep(3000);
        //Select Card for payment
        Select selectCard = new Select(driver.findElement(By.id("Select_a_Test_Card")));
        selectCard.selectByValue("4111111111111111");
        Thread.sleep(1000);

        //Select continue
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div/form/div[4]/div/button")).click();

        Thread.sleep(6000);

        //Select close modal
        driver.findElement(By.className("modal-header__close")).click();

        Thread.sleep(4000);
    }
}
