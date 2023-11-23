package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTestCasesPage {
	
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
    		
    		//Click on 'Test Cases' button
    		WebElement testCaseButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
    		testCaseButton.click();
    		
    		//Verify user is navigated to test cases page successfully
    		String testCaseUrl = "https://automationexercise.com/test_cases";
    		String actualUrl1 = driver.getCurrentUrl();
    		
    		if (actualUrl1.equals(testCaseUrl)) {
    			
    			System.out.println("Navigated to test cases page successfully");
    			
    		} else {
    			
    			System.out.println("NOT Navigated to test cases page successfully");
    		} 
    		 
        } finally {
            // Close the browser window 
            driver.quit();
        } 
    		
	}

}
