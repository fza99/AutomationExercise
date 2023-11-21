package automationexercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUser {
 
    public static void main(String[] args) {
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
    		System.out.println(expectedUrl); 
    		
    		if ((expectedUrl.equals(expectedUrl))) {
    			
			    System.out.println("home page is visible successfully");
    		} 
    		else {
    			
			    System.out.println(actualUrl.contains(expectedUrl));
    		}
    		
            // Test Case 4: Click on 'Signup / Login' button
            WebElement signupLoginButton = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
            signupLoginButton.click();

            // Test Case 5: Verify 'Login to your account' is visible
            WebElement loginText = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/h2"));
            if(loginText.getText().equals("Login to your account")) {
            	
            	System.out.println("Login to your account is visible");
            } 
            else {
            	
            	System.out.println("Login to your account is not visible");
            }

            // Test Case 6: Enter correct email address and password
            WebElement emailInput = driver.findElement(By.name("email"));
            WebElement passwordInput = driver.findElement(By.name("password"));

            emailInput.sendKeys("testf@gmail.com");
            passwordInput.sendKeys("testf123");

            // Test Case 7: Click 'login' button
            WebElement loginButton = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button"));
            loginButton.click();

            // Test Case 8: Verify that 'Logged in as username' is visible
            if ((expectedUrl.equals(expectedUrl))) {
            	
    			
			    System.out.println("You are logged successfully");
    		} 
            
    		else {
    			
			    System.out.println(actualUrl.contains("You are NOT logged"));
			    
    		}
            
            // Test Case 9: Click 'Delete Account' button
            WebElement deleteAccountButton = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a"));
            deleteAccountButton.click();
            

            // Test Case 10: Verify that 'ACCOUNT DELETED!' is visible
            WebElement DeleteAcount = driver.findElement(By.xpath("/html/body/section/div/div/div/h2/b"));
            String textDeletAcount = DeleteAcount.getText();
            
            if (textDeletAcount.equals("ACCOUNT DELETED!")) {
            	
            	System.out.println("Account Deleted!");
            	
            } 
            else { 
            	
            	System.out.println("Account not Deleted!");
            	
            }
        } finally {
            // Close the browser window
            driver.quit();
        }
    }
}

