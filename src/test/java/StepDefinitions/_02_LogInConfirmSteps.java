package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class _02_LogInConfirmSteps {
    DialogContent dc = new DialogContent();

    @And("Click on the Sign In Button")
    public void clickOnTheSignInButton(DataTable elements) {
        List<String> listelements = elements.asList(String.class);
        for (String signInButton : listelements) {
            dc.findAndClick(signInButton);
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listelements = elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++)
            dc.findAndSend(listelements.get(i).get(0), listelements.get(i).get(1));
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listelements = elements.asList(String.class);
        for (String signInConfirm : listelements) {
            dc.findAndClick(signInConfirm);
        }
    }

    @Then("Unsuccessful message should be displayed")
    public void unsuccessfulMessageShouldBeDisplayed() {
        dc.findAndContainsText("assertFails", "Authentication failed.");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("assertSignIn", "Welcome to your account. Here you can manage all of your personal information and orders.");
    }

}
