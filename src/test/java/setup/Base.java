package setup;

import POM.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    private WebDriver driver;
    protected Homepage homepage;
    @BeforeTest
    public void setup() throws InterruptedException{
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\IdeaProjects\\ChakaProcessAutomation\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://test.chaka.ng/");
        homepage = new Homepage(driver);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
