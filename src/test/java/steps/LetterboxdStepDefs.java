package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateAccountPage;
import utils.Driver;

import java.util.concurrent.TimeUnit;


public class LetterboxdStepDefs {
    WebDriver driver;


    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver= Driver.getDriver("chrome");
        driver.get(url);

    }



    @When("user sign in to the account")
    public void user_sign_in_to_the_account() {

    }


    @When("user can add and remove items from the watch list")
    public void user_can_add_and_remove_items_from_the_watch_list() {

    }

    @Then("user verify every sort by type modifies the list correctly")
    public void user_verify_every_sort_by_type_modifies_the_list_correctly() {

    }


}


//
//    @When("user creating account form")
//    public void user_creating_account_form() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
//
////        WebElement account =  driver.findElement(By.xpath("//a[@class='navlink has-icon cboxElement']"));
////       account.click();
//
//        createAccountPage.createAccount.click();
//
//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println(size);
//        for (int i = 0; i < size; i++) {
//            driver.switchTo().frame(i);
//            int size2 = driver.findElements(By.tagName("iframe")).size();
//            System.out.println("Size 2 = " + size2);
//            if (size2 > 0) {
//                driver.switchTo().frame(0);
//
//                System.out.println("i = " + i);
//            }
//            int total = driver.findElements(By.id("frm-reg-email")).size();
//            System.out.println(total);
//
//            driver.switchTo().defaultContent();
//



//driver.switchTo().frame(14);


//       WebDriverWait wait=new WebDriverWait(driver,5);
//           wait.until(ExpectedConditions.visibilityOf(createAccountPage.emailBox));
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        WebElement ddd=driver.findElement(By.xpath("//section[@class='register-form split-form']"));
//        ddd.click();

//       createAccountPage.sendKeysToEmail("pyxarizona@gmail.com");
//
//
//            createAccountPage.userName.sendKeys("PyxRidvan");
//            createAccountPage.password.sendKeys("Pyx520.");
//          driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

//            WebDriverWait wait = new  WebDriverWait(driver,20);
//            wait.until(ExpectedConditions.elementToBeClickable(createAccountPage.firstCheckBox)).click();
//
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            Thread.sleep(3300);
//            createAccountPage.firstCheckBox.click();
//            createAccountPage.secondCheckBox.click();
//            createAccountPage.recaptcha.click();

            //createAccountPage.singUpButton.click();
//        }
//    }


