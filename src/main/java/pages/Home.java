package pages;

import org.openqa.selenium.By;

public class Home {
    By lblCareers = By.xpath("//li//a[@href='/careers']");

    public By getLblCareers() {
        return lblCareers;
    }


}
