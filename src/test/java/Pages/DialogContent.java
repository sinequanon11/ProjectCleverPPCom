package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "a[class='login']")
    private WebElement signInButton;

    @FindBy(css = "input[id='email_create']")
    private WebElement emailDc;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;

    @FindBy(css = "input[id='id_gender1']")
    private WebElement mrMrs;

    @FindBy(css = " input[id='customer_firstname']")
    private WebElement firstName;

    @FindBy(css = "input[id='customer_lastname']")
    private WebElement lastName;

    @FindBy(css = "input[id='passwd']")
    private WebElement passwordSend;

    @FindBy(xpath = "(//select[@id='days'])/option[2]")
    private WebElement birthdayday;

    @FindBy(xpath = "(//select[@id='months'])/option[2]")
    private WebElement birthdaymonth;

    @FindBy(xpath = "(//select[@id='years'])/option[2]")
    private WebElement birthdayyear;

    @FindBy(css = "button[id='submitAccount']")
    private WebElement registerButton;

    @FindBy(css = "p[class='alert alert-success']")
    private WebElement successMessage;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement eMailConfirm;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passWordConfirm;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    private WebElement signInConfirm;

    @FindBy(xpath = "//p[@class='info-account']")
    private WebElement assertSignIn;

    @FindBy(xpath = "//li[normalize-space()='Authentication failed.']")
    private WebElement assertFails;

    @FindBy(css = "a[title='Women']")
    private WebElement womenSelect;

    @FindBy(css = "a[title='Summer Dresses']")
    private WebElement summerDress;

    @FindBy(css = "a[class='button ajax_add_to_cart_button btn btn-default']>span")
    private WebElement addToCart;

    @FindBy(css = "span[class='title']")
    private WebElement addToCartSuccessMessage;

    @FindBy(xpath = "(//img[@title='Printed Summer Dress'])[1]")
    private WebElement summerDressProductImage;

    WebElement myElement;

    public void findAndSend(String strlement, String value) {

        switch (strlement) {
            case "emailDc":
                myElement = emailDc;
                break;
            case "firstName":
                myElement = firstName;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "passwordSend":
                myElement = passwordSend;
                break;
            case "eMailConfirm":
                myElement = eMailConfirm;
                break;

            case "passWordConfirm":
                myElement = passWordConfirm;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strlement) {

        switch (strlement) {
            case "signInButton":
                myElement = signInButton;
                break;
            case "createAccountButton":
                myElement = createAccountButton;
                break;
            case "mrMrs":
                myElement = mrMrs;
                break;
            case "birthdayday":
                myElement = birthdayday;
                break;
            case "birthdaymonth":
                myElement = birthdaymonth;
                break;
            case "birthdayyear":
                myElement = birthdayyear;
                break;
            case "registerButton":
                myElement = registerButton;
                break;
            case "signInConfirm":
                myElement = signInConfirm;
                break;
            case "summerDress":
                myElement = summerDress;
                break;
            case "addToCart":
                myElement = addToCart;
                break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strlement, String text) {

        switch (strlement) {
            case "successMessage":
                myElement = successMessage;
                break;
            case "assertSignIn":
                myElement = assertSignIn;
                break;
            case "assertFails":
                myElement = assertFails;
                break;
            case "addToCartSuccessMessage":
                myElement = addToCartSuccessMessage;
                break;
        }

        verifyContainsTextFunction(myElement, text);
    }

    public void movingToElement(String strlement) {

        switch (strlement) {
            case "womenSelect":
                myElement = womenSelect;
                break;
            case "summerDressProductImage":
                myElement = summerDressProductImage;
                break;
        }
        moveToElement(myElement);
    }

    public void scrollToElement(String strlement) {

        switch (strlement) {
            case "summerDressProductImage":
                myElement = summerDressProductImage;
                break;
        }
        scrollToelement(myElement);
    }
}