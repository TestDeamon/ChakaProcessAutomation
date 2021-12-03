package Chaka;

import POM.Fundingpage;
import POM.Landingpage;
import POM.Loginpage;
import POM.Withdrawalpage;
import org.testng.annotations.Test;
import setup.Base;

public class ChakaTests extends Base {
    Loginpage loginpage;
    Landingpage landingpage;
    Fundingpage fundingpage;
    Withdrawalpage withdrawalpage;


    String fullName = "Alola David Femi";

    @Test
    public void test() throws InterruptedException {
        loginpage =  homepage.clickLoginLink();
        loginpage.enterLoginDetails("davorigaga@mailinator.com", "Password@1");
        Thread.sleep(2000);
        landingpage = loginpage.clickLogin();
        Thread.sleep(6000);

//        landingpage.closeHelpModal();
//
        landingpage.editAccountDetails(fullName);
        Thread.sleep(3000);
        landingpage.enterBVN("2231527528");
        Thread.sleep(3000);
        landingpage.completeVerification(fullName);
        Thread.sleep(3000);


        //Funding Wallet
//        fundingpage.fundWallet("20");
        

    }
}
