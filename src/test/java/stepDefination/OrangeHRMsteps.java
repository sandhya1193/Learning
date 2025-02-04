package stepDefination;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps {
    WebDriver  driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
   System.setProperty("webdriver.chrome.webdriver", "C:\\Users\\sandh\\Downloads\\chromedriver_win32\\chromedriver.exe");
   driver=new ChromeDriver();
   System.out.println("ABC");

    }

    @When("I open orangeHRM home page")
    public void i_open_orange_hrm_home_page() {
       driver.get("https://www.orangehrm.com/");
    }

    @Then("I verify the logo present on page")
    public void i_verify_the_logo_present_on_page() {
        boolean status=driver.findElement(By.xpath("/html/body/nav/div/a/img")).isDisplayed();
       Assert.assertEquals(true,status);
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
    }

}
