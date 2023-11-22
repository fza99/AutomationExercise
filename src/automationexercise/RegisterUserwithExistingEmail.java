package automationexercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUserwithExistingEmail {

		    public static void main(String[] args) throws InterruptedException {
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");

		       
		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        try {
		            // Test Case 1: Launch browser
		            // Assuming the browser is launched automatically when WebDriver is initialized

		            // Test Case 2: Navigate to url 'http://automationexercise.com'
		            driver.get("http://automationexercise.com");

		            // Test Case 3: Verify that home page is visible successfully
		            String actualUrl = "http://automationexercise.com/";
		    		String expectedUrl = driver.getCurrentUrl();
		    		
		    		if ((actualUrl.equals(expectedUrl))) {
		    			
					    System.out.println("home page is visible successfully");
		    		} 
		    		else {
		    			
					    System.out.println("home page is NOT visible successfully");
		    		}

		            // Test Case 4: Click on 'Signup / Login' button
		            WebElement signupLoginButton = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a/i"));
		            signupLoginButton.click();
 
		   

		            // Test Case 6: Enter existing name and email address
		            WebElement nameInput = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
		            WebElement emailInput = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));

		            nameInput.sendKeys("mprabha");  
		            emailInput.sendKeys("test33@gmail.com");

		            // Test Case 7: Click 'Signup' button
		            WebElement signupButton = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
		            signupButton.click();

		            // Test Case 8: Verify that 'Email Address already exist!' is visible
		            WebElement singupTextExist = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));
		          
		            
		            if ((singupTextExist.getText().equals("Email Address already exist!"))) {
		    			
					    System.out.println("Email Address already exist! is visible successfully");
		    		} else {
		    			
					    System.out.println("Email Address already exist! not visible successfully");
		    		}

		            
		        } finally {
		            // Close the browser window 
		            driver.quit();
		        }
		    }

}
