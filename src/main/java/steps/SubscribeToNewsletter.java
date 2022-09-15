package steps;

import driver.GoogleChromeDriver;
import pages.Careers;

public class SubscribeToNewsletter {
    Careers careers = new Careers();
    public void  subscribeToNewsletter(){
        GoogleChromeDriver.driver.findElement(careers.getTxtEmail()).sendKeys("customeremail@yopmail.com");
        GoogleChromeDriver.driver.findElement(careers.getBtnSubscribe()).click();
        GoogleChromeDriver.driver.findElement(careers.getLblSuccessForm()).isDisplayed();
    }

}
