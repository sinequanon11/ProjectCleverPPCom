package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class _03_AddToCart {
    DialogContent dc = new DialogContent();

    @And("navigate to women on the top bar")
    public void navigateToWomenOnTheTopBar() {
        dc.movingToElement("womenSelect");
    }

    @And("click on summer dresses")
    public void clickOnSummerDresses() {
        dc.findAndClick("summerDress");
    }

    @And("move to product photo")
    public void moveToProductPhoto() {
        dc.scrollToElement("summerDressProductImage");
        dc.movingToElement("summerDressProductImage");
    }

    @And("Add to cart a random item")
    public void addToCartARandomItem() {
        dc.findAndClick("addToCart");
    }

    @Then("Successfull message should be displayed")
    public void successfullMessageShouldBeDisplayed() {
        dc.findAndContainsText("addToCartSuccessMessage","Product successfully added to your shopping cart");
    }
}
