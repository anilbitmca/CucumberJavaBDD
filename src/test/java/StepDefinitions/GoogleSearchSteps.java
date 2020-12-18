package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;
    String ProjectPath = System.getProperty("user.dir");


    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Step 1: browser is open");
        // System.out.println(ProjectPath);
        System.setProperty("webdriver.chrome.driver",
                ProjectPath + "/src/test/resources/drivers/chromedriver.exe"); //C:/Users/User/IdeaProjects/CucumberJava
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        // driver.manage().window().maximize();

    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Step 2: user is on google search page");
        driver.navigate().to("https://www.google.com/");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Step 3: user enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("Step 4: hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Step 5: user is navigated to search results");
        driver.getPageSource().contains("Online Courses");
        driver.close();
        driver.quit();
    }

}
