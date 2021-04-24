package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SingInPage {


    public SingInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//li[@class='navitem sign-in-menu']/a")
    public WebElement singInButton;
    @FindBy(id = "username")
    public WebElement userName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//input[@class='button -action button-green")
    public WebElement loginButton;
    @FindBy(xpath = "//li[@class='navitem nav-account js-nav-account']")
    public WebElement myAccount;
    @FindBy(xpath = "//a[@href='/PyxRidvan/watchlist/']")
    public WebElement watchlist;
    @FindBy(xpath = "//input[@id='frm-watchlist-autocomplete']")
    public WebElement searchFilmBox;
    @FindBy(xpath = "//div[@class='ac_results']/ul/li[contains(text(),'\" + movie1 + \"')]")
    public List<WebElement> searchResult;
    @FindBy(xpath = "//span[contains(text(),'\" + movie1 + \"')]")
    public WebElement searchItem1;
    @FindBy(xpath = "//div[@class='ac_results']/ul/li[contains(text(),'\" + movie2 + \"')]")
    public List<WebElement> searchResult2;
    @FindBy(xpath = "//span[contains(text(),'\" + movie2 + \"')]")
    public WebElement searchItem2;
    @FindBy(xpath = "ul[@class='poster-list -p125 -grid -constrained']")
    public List<WebElement> listOfMovie;
    @FindBy(xpath = "//a[@data-form-id='filmlist-reset']")
    public WebElement clearWatchList;
    @FindBy(xpath = "//input[@id='frm-reg-password']")
    public WebElement getPassword;
    @FindBy(xpath = "//input[@value='Clear Watchlist']")
    public WebElement clearButton;


    public void setSingInButton() {
        this.singInButton.click();

    }

    public void sendKeysToUserName() {
        userName.sendKeys("PyxRidvan");
    }

    public void sendKeysToPassword() {
        this.password.sendKeys("Pyx520.");
    }

    public void signIntoAccount() {
        this.loginButton.click();
    }

    public void getMyAccount() {
        this.myAccount.click();
    }

    public void getWatchList() {
        this.watchlist.click();
    }

    public void getSearchFilmBox() {
        String movie1 = "Tarzan";
        this.searchFilmBox.sendKeys(movie1);
    }

    public void getSearchResult() {
        this.searchResult.get(0).click();
    }

    public void setSearchItem1() {
        this.searchItem1.click();
    }

    public void setSearchResult2() {

        this.searchResult2.get(0).click();
    }

    public void getSearchItem2() {
        String movie2 = "Tenet";
        this.searchItem2.sendKeys(movie2);
    }

    public void getListOfMovie() {
        for (WebElement item : listOfMovie) {
            System.out.println(item.getSize());
        }
    }

    public void setClearWatchList() {
        this.clearWatchList.click();
    }

    public void setPassword() {
        this.getPassword.sendKeys("Pyx520.");
    }

    public void setClearButton() {
        this.clearButton.click();
    }

}
