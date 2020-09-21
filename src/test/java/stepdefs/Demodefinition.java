package stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demodefinition {
    WebDriver driver;
/*@Before
    public void beforetest() {

    }*/

    @Given("I am able to navigate onto the login page")
    public void i_am_able_to_navigate_onto_the_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://opensource-demo.orangehrmlive.com/");
        Thread.sleep(10000);
    }

    @When("I enter username as {string}")
    public void i_enter_username_as(String string) {
        driver.findElement(By.id("txtUsername")).sendKeys(string);

    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String string) {
        driver.findElement(By.id("txtPassword")).sendKeys(string);

    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();

    }

    @Then("I should see the username as {string}")
    public void i_should_see_the_username_as(String string) throws InterruptedException {
       String expected = driver.findElement(By.id("welcome")).getText();
        Assert.assertEquals(expected,string);
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.close();
    }

}
