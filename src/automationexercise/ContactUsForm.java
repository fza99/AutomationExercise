package automationexercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsForm {
	
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
    		System.out.println(expectedUrl); 
    		
    		if ((actualUrl.equals(expectedUrl))) {
    			
			    System.out.println("home page is visible successfully");
    		} else {
    			
			    System.out.println("home page is not visible successfully");
    		}
    		
    		// Test Case 4: Click on 'Contact Us' button
    		WebElement contactUsButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a"));
    		contactUsButton.click();
    		
    		// Test Case 5: Verify 'GET IN TOUCH' is visible
    		WebElement getInTouch = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2"));
    		
    		if (getInTouch.getText().equals("GET IN TOUCH")) {
    			
    			 System.out.println("GET IN TOUCH is visible");
    			 
    		} else {
    			
    			 System.out.println("GET IN TOUCH is NOT visible");
    			
    		}
    		
    		// Test Case 6 :  Enter name, email, subject and message
    		WebElement name = driver.findElement(By.name("name"));
    		WebElement email = driver.findElement(By.name("email"));
    		WebElement subject = driver.findElement(By.name("name"));
    		WebElement message = driver.findElement(By.id("message"));
    		
    		name.sendKeys("Test");
    		email.sendKeys("test3@gmail.com");
    		subject.sendKeys("Contact");
    		message.sendKeys("This is a test mwessage");
    		
    		// Test Case 7 : Upload file
    		WebElement uploadFilebutton = driver.findElement(By.name("upload_file"));
    		uploadFilebutton.sendKeys("C:\\Users\\HP\\Downloads\\test.txt");
    		
    		// Test Case 8: Click 'Submit' button
    		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input"));
    		submitButton.click();
    		
    		// Test Case 9: Click OK button
    		driver.switchTo().alert().accept();
    		
    		// Test Case 10 : Verify success message 'Success! Your details have been submitted successfully.' is visible
    		WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]"));
    		
    		if (successMessage.getText().equals("Success! Your details have been submitted successfully.")) {
    			
    			System.out.println("Success message is visible");
    			
    		} else {
    			
    			System.out.println("Success message is NOT visible" +' '+ successMessage);
    		}
    		
    		// Test Case 1 : Click 'Home' button and verify that landed to home page successfully
    		WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"form-section\"]/a"));
    		homeButton.click();
    		
    		String actualurl = driver.getCurrentUrl();
    		
    		if (actualurl.equals("https://automationexercise.com/")) {
    			
    			System.out.println("Landed to home page successfully");
    			
    		} else {
    			
    			System.out.println("NOT landed to home page successfully");
    			
    		}
    		
    		
        } finally {
            // Close the browser window 
            driver.quit();
        }
	}

}
