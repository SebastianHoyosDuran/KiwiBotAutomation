package steps;

import driver.GoogleChromeDriver;
import pages.Home;

public class GoCareers {

    Home home = new Home();

    public void  goToCareers(){
        GoogleChromeDriver.driver.findElement(home.getLblCareers()).click();
    }
}
