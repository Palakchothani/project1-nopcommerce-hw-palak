package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));

        String expectMessage = "Welcome, Please Sign In!";

        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectMessage, actualMessage);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Click on login link
        clickOnElement(By.linkText("Log in"));
        // Enter id text
        sendTextToElements(By.id("Email"), "test123@gmail.com");
        // Enter password text
        sendTextToElements(By.name("Password"), "Test123456");
        // click on login tab
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

    }
    @Test
    public void verifyTheErrorMessage() {
        // Click on login link
        clickOnElement(By.linkText("Log in"));
        // Enter id text
        sendTextToElements(By.id("Email"), "test1234@gmail.com");
        // Enter password text
        sendTextToElements(By.name("Password"), "Test123456");
        // click on login tab
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectMessage = "Login was unsuccessful. Please correct the errors and try again.";

        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[@class='Login was unsuccessful. Please correct the errors and try again.']"));
        String actualMessage = actualTextMessageElement.getText();

        //   Validate actual and expected message
        Assert.assertEquals("No message found", expectMessage, actualMessage);
    }
    @After
    public void tearDown() {
        // closeBrowser();
    }


}


