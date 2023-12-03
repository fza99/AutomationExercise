package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class SubscriptionTest {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Launch browser
            driver.get("http://automationexercise.com");

            // 2. Verify that home page is visible successfully
            String expectedTitle = "Automation Exercise";
            String actualTitle = driver.getTitle();
            if (actualTitle.contains(expectedTitle)) {
                System.out.println("Home page is visible successfully");
            } else {
                System.out.println("Home page is not visible");
            }

            // 3. Scroll down to footer
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

            // 4. Verify text 'SUBSCRIPTION'
            WebElement subscriptionText = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2"));
            if (subscriptionText.isDisplayed()) {
                System.out.println("'SUBSCRIPTION' text is visible in the footer");
            } else {
                System.out.println("'SUBSCRIPTION' text is not visible in the footer");
            }

            // 5. Enter email address in input and click arrow button
            String emailAddress = "your_email@example.com";
            WebElement emailInput = driver.findElement(By.id("susbscribe_email"));
            emailInput.sendKeys(emailAddress);

            WebElement arrowButton = driver.findElement(By.id("subscribe"));
            arrowButton.click();

            // Wait for the success message to appear (You might need to adjust the wait time)
            Thread.sleep(1000);

            // 6. Verify success message 'You have been successfully subscribed!' is visible   	
           WebElement successMessage = driver.findElement(By.id("success-subscribe"));
            
            if (successMessage.isDisplayed()) {
                System.out.println("Success message is visible: ");
            } else {
                System.out.println("Success message is not visible");
            }

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

