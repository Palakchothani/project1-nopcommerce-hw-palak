package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest
{
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Click on computers
        clickOnElement(By.linkText("Computers"));

        String expectMessage = "Computers";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // Click on computers
        clickOnElement(By.linkText("Electronics"));

        String expectMessage = "Electronics";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Electronics page", expectMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        // Click on computers
        clickOnElement(By.linkText("Apparel"));

        String expectMessage = "Apparel";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Apparel page", expectMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // Click on computers
        clickOnElement(By.linkText("Digital downloads"));

        String expectMessage = "Digital downloads";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Digital downloads", expectMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // Click on computers
        clickOnElement(By.linkText("Books"));

        String expectMessage = "Books";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Books", expectMessage, actualMessage);

    }
    @Test
    public void  userShouldNavigateToJewelryPageSuccessfully(){
        // Click on computers
        clickOnElement(By.linkText("Jewelry"));

        String expectMessage = "Jewelry";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Jewelry", expectMessage, actualMessage);

    }
    @Test
    public void  userShouldNavigateToGiftCardsPageSuccessfully(){
        // Click on computers
        clickOnElement(By.linkText("Gift Cards"));

        String expectMessage = "Gift Cards";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Gift Cards", expectMessage, actualMessage);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}

