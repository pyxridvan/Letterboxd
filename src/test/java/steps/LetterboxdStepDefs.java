package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.SingInPage;
import utils.Driver;


public class LetterboxdStepDefs {



    WebDriver driver;
    SingInPage signInPage=new SingInPage(driver);

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver= Driver.getDriver("chrome");
        driver.get(url);


    }

    @When("user sign in to the account")
    public void user_sign_in_to_the_account() {
        signInPage.setSingInButton();
        signInPage.sendKeysToUserName();
        signInPage.sendKeysToPassword();
        signInPage.signIntoAccount();
        signInPage.getMyAccount();
        signInPage.getWatchList();
    }

    @When("user can add and remove items from the watch list")
    public void user_can_add_and_remove_items_from_the_watch_list() {
        signInPage.getSearchFilmBox();

        signInPage.getSearchResult();
        signInPage.setSearchItem1();
        String movie1="Tarzan";
        Assert.assertTrue(signInPage.searchItem1.getAttribute("innerHTML").contains(movie1));
        signInPage.setSearchResult2();
        signInPage.getSearchItem2();
        String movie2 = "Tenet";
        Assert.assertTrue(signInPage.searchItem2.getAttribute("innerHTML").contains(movie2));
        signInPage.getListOfMovie();
        signInPage.setClearWatchList();
        signInPage.setPassword();
        signInPage.setClearButton();

    }

    @Then("user verify every sort by type modifies the list correctly")
    public void user_verify_every_sort_by_type_modifies_the_list_correctly() {
        Select dropdown=new Select(driver.findElement(By.xpath("//label[text()='When Added']")));
        Assert.assertTrue(dropdown.isMultiple());
        Assert.assertEquals(12,dropdown.getOptions().size());

    }
}


