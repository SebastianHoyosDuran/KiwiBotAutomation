package stepsDefinitions;

import cucumber.api.java.en.*;
import steps.GoCareers;
import steps.GoHome;
import steps.LookForQAPosition;
import steps.SubscribeToNewsletter;

public class LookingForQAPositionStepsDefinitions {


    GoCareers goCareers = new GoCareers();
    GoHome goHome  = new GoHome();
    LookForQAPosition lookForQAPosition = new LookForQAPosition();
    SubscribeToNewsletter subscribeToNewsletter = new SubscribeToNewsletter();

    @Given("^the user is on the main page of Kiwibot$")
    public void theUserIsOnTheMainPageOfKiwibot() {
        goHome.openBrowser();
    }


    @When("^the user can go to the careers module$")
    public void theUserCanGoToTheCareersModule() {
        goCareers.goToCareers();
    }

    @When("^search for remote jobs$")
    public void searchForRemoteJobs() throws InterruptedException {
        lookForQAPosition.activeRemoteJobs();

    }

    @Then("^the user should see the qa position$")
    public void theUserShouldSeeTheQaPosition() {
        lookForQAPosition.isPresentQAPosition();
    }

    @Then("^the user could subscribe  for the newsletter$")
    public void theUserCouldSubscribeForTheNewsletter() {
        subscribeToNewsletter.subscribeToNewsletter();
    }

}
