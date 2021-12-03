package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Landingpage {
    private WebDriver driver;
    public Landingpage(WebDriver driver){this.driver = driver;}

    public void closeHelpModal() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("helpcrunch-popup-close-button")).click();
    }

    public void editAccountDetails(String fullName) throws InterruptedException {


        //Close help modal
//        Thread.sleep(6000);
//        Actions actions = new Actions(driver);
//        //span[contains(@class,'Trsdu')]
//        WebElement target =  driver.findElement(By.xpath("//*[@id=\"ltr\"]/div[1]/div[2]/div/div[1][contains(@class, 'helpcrunch-notification-header')]"));
//        actions.moveToElement(target).perform();

//        WebElement closeBtn = driver.findElement(By.id("helpcrunch-popup-close-button"));
//        actions.moveToElement(closeBtn).perform();
//        driver.findElement(By.id("helpcrunch-popup-close-button")).click();


//        css_locator = 'div.quote-header-section span[data-reactid="35"]';
//        driver.FindElement(By.CssSelector("div[id = '123'][class = 'test'][type = 'round']"));
//        driver.FindElement(By.CssSelector("div[contains("Puma")]")); Or driver.FindElement(By.CssSelector("div[text()="Puma")]"));

        //Click Account drop down
        Thread.sleep(3000);
        driver.findElement(By.className("dropdown")).click();
        Thread.sleep(3000);
        //Choose Settings
        // Working on the third dropdown, viz, Old Style Select menu
//        WebElement drpdn = driver.findElement(By.id("oldSelectMenu"));
//        System.out.println("Clicking on the drop down");
//        Select se = new Select(drpdn);
//        List<WebElement> opt = se.getOptions();
//        System.out.println("The total number of options in the dropdown is : " +opt.size());
        List<WebElement> options = driver.findElements(By.cssSelector(".dropdown-content a"));

        System.out.println(options.size());

        Thread.sleep(2000);

        //Click Settings
        options.get(7).click();
        Thread.sleep(3000);


        Actions actions = new Actions(driver);
        WebElement target =  driver.findElement(By.className("uploads__input"));
        actions.moveToElement(target).perform();


        //Select disclosure field
        driver.findElement(By.cssSelector(".inline.kyc-field__group input")).sendKeys(fullName);
        Thread.sleep(4000);

        //Click Submit
        driver.findElement(By.xpath("/html/body/div[1]/section/form/div/div[3]/button")).click();

        Thread.sleep(4000);

        //Close investment modal
        driver.findElement(By.className("modal-header__close")).click();
    }

    public void enterBVN(String bvn) throws InterruptedException {
        //Click Edit BVN link
        driver.findElement(By.className("accounts-settings__edit")).click();

        //Enter BVN
        driver.findElement(By.name("bvn")).sendKeys(bvn);

        //Click Submit
        driver.findElement(By.tagName("button")).click();
    }

    public void completeVerification(String fullName) throws InterruptedException {
        //Enter Full name to complete verification
        driver.findElement(By.name("Disclosure Name")).sendKeys(fullName);

        //Click continue arrow
        driver.findElement(By.xpath("/html/body/div[3]/section/form/div/div[3]/button")).click();
    }
}
