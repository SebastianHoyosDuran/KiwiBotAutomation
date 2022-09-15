package pages;

import org.openqa.selenium.By;

public class Careers {

    By chckbxRemoteJobs = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[1]/div/div/ul/li/label/span");

    By lblTitleJob = By.xpath("//li[@class='rec-job-title']//a[contains(text(),'QA Engineer')]");

    By txtEmail = By.xpath("//input[@type='email']");

    By btnSubscribe = By.xpath("//input[@type='submit' and @value='Subscribe']");

    By lblSuccessForm = By.xpath("//div[@class='success w-form-done']");

    By btnOpenPositions = By.xpath("//a[@href='#Open-positions']");

    public By getChckbxRemoteJobs() {
        return chckbxRemoteJobs;
    }

    public By getLblTitleJob() {
        return lblTitleJob;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getBtnSubscribe() {
        return btnSubscribe;
    }

    public  By getLblSuccessForm(){
        return  lblSuccessForm;
    }

    public  By getBtnOpenPositions(){
        return  btnOpenPositions;
    }
}
