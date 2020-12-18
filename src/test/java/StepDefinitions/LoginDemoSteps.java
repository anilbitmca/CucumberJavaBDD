package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {

    WebDriver driver = null;
    String ProjectPath = System.getProperty("user.dir");

    @Given("browser is open for credentials")
    public void browser_is_open_for_credentials() {

        System.out.println("Step 1: browser is open for credentials");
        // System.out.println(ProjectPath);
        System.setProperty("webdriver.chrome.driver",
                ProjectPath + "/src/test/resources/drivers/chromedriver.exe"); //C:/Users/User/IdeaProjects/CucumberJava
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        // driver.manage().window().maximize();

    }

    // @When("user entered username and password")
    @When("user entered (.*) and (.*)$")
    public void user_entered_username_and_password(String username,String password) {
        System.out.println("Step 2: user entered username and password");
        driver.navigate().to("https://example.testproject.io/web/");
        driver.findElement(By.id("name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("click on login button in webpage")
    public void click_on_login_button_in_webpage() {
        System.out.println("Step 3: click on login button in webpage");
        driver.findElement(By.id("login")).click();

    }

    @Then("user will login to webpage")
    public void user_will_login_to_webpage() {
        System.out.println("Step 3: user will login to webpage");
        driver.close();
        driver.quit();
    }
}
