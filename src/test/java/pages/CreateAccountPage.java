package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateAccountPage {
//    public CreateAccountPage(WebDriver driver){
//        PageFactory.initElements(driver,this);

        @Test
        public void test1(){

            WebDriver driver= Driver.getDriver("chrome");
            driver.get("https://letterboxd.com/");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            WebElement signin=driver.findElement(By.xpath("//li[@class='navitem sign-in-menu']/a"));
            signin.click();
            WebElement username=driver.findElement(By.id("username"));
            username.sendKeys("PyxRidvan");
            WebElement password= driver.findElement(By.id("password"));
            password.sendKeys("Pyx520.");
            WebElement singintoAcoount= driver.findElement(By.xpath("//input[@class='button -action button-green']"));
            singintoAcoount.click();
            WebElement myaccount= driver.findElement(By.xpath("//li[@class='navitem nav-account js-nav-account']"));
            myaccount.click();
            WebElement watchList= driver.findElement(By.xpath("//a[@href='/PyxRidvan/watchlist/']"));
            watchList.click();

            WebElement searchFilmBox= driver.findElement(By.xpath("//input[@id='frm-watchlist-autocomplete']"));
            searchFilmBox.sendKeys("tarzan");
            WebElement searchItem =driver.findElement(By.xpath("//li[text()='Tarzan (1999) ']"));
            searchItem.click();

            driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

            driver.navigate().refresh();
            WebElement searchFilmBox2= driver.findElement(By.xpath("//input[@id='frm-watchlist-autocomplete']"));
            searchFilmBox2.click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            searchFilmBox2.sendKeys("tenet");
            WebElement searchItem2= driver.findElement(By.xpath("//li[text()='Tenet (2020) ']"));
            searchItem2.click();



            List<WebElement> listofMovies=driver.findElements(By.xpath("ul[@class='poster-list -p125 -grid -constrained']"));
            for (WebElement itm:listofMovies){
                System.out.println(itm.getSize());

            }

        }



public void sendKeysToEmail (String email) {



}

}
