package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest
{

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Click on Register link
        clickOnElement(By.linkText("Register"));

        String expectMessage = "Register";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to register page", expectMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        // Click on Register link
        clickOnElement(By.linkText("Register"));

        //Select gender radio button
        clickOnElement(By.id("gender-male"));

        // Enter First name
        sendTextToElements(By.id("FirstName"), "Prime");

        // Enter Last name
        sendTextToElements(By.id("LastName"), "Testing");

        // Select Day Month and Year
        clickOnElement(By.name("DateOfBirthDay"));
        sendTextToElements(By.name("DateOfBirthDay"), "20");
        clickOnElement(By.name("DateOfBirthMonth"));
        sendTextToElements(By.name("DateOfBirthMonth"), "11");
        clickOnElement(By.name("DateOfBirthYear"));
        sendTextToElements(By.name("DateOfBirthYear"), "2000");

        // Enter Email address
        sendTextToElements(By.id("Email"), "test1345@gmail.com");

        // Enter Password
        sendTextToElements(By.id("Password"), "Test123456");

        // Enter Confirm password
        sendTextToElements(By.id("ConfirmPassword"), "Test123456");

        // Click on REGISTER button
        clickOnElement(By.name("register-button"));

        String expectMessage = "Your registration completed";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Registration message not displayed", expectMessage, actualMessage);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}


