package steps;

import driver.GoogleChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import pages.Careers;

public class LookForQAPosition {
    Careers careers = new Careers();
    JavascriptExecutor js = (JavascriptExecutor) GoogleChromeDriver.driver;
    public void  activeRemoteJobs() throws InterruptedException {
        GoogleChromeDriver.driver.findElement(careers.getBtnOpenPositions()).click();
        Thread.sleep(3000);
        GoogleChromeDriver.driver.findElement(careers.getChckbxRemoteJobs()).click();
    }

    public void  isPresentQAPosition(){
        GoogleChromeDriver.driver.findElement(careers.getLblTitleJob()).isDisplayed();
    }
}
