package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps  {
    DialogContent dc=new DialogContent();
    @Given("Naviagate to cleverppc")
    public void naviagateToCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Create an account")
    public void createAnAccount() {
        dc.findAndClick("signInButton");
        dc.findAndSend("emailDc","davidwoods3@gmail.com");
        dc.findAndClick("createAccountButton");
    }

    @And("Fill the registration form")
    public void fillTheRegistrationForm() {
        dc.findAndClick("mrMrs");
        dc.findAndSend("firstName","David");
        dc.findAndSend("lastName","Woods");
        dc.findAndSend("passwordSend","12345");
        dc.findAndClick("birthdayday");
        dc.findAndClick("birthdaymonth");
        dc.findAndClick("birthdayyear");
        dc.findAndClick("registerButton");
    }
    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        dc.findAndContainsText("successMessage","Your account has been created.");
    }

}
