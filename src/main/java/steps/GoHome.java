package steps;

import driver.GoogleChromeDriver;

public class GoHome {

    public void  openBrowser(){
        GoogleChromeDriver.ChromeDriver("https://www.kiwibot.com/");
    }

}
