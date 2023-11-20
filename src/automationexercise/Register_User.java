package automationexercise;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Register_User {

	    public static void main(String[] args) throws InterruptedException {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");

	        ChromeOptions opt = new ChromeOptions();
	        opt.addExtensions(new File("C:\\Users\\HP\\Downloads\\adblock.crx"));
	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver(opt);

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
	            // Assuming you have some validation logic to check the presence of elements on the home page

	            // Test Case 4: Click on 'Signup / Login' button
	            WebElement signupLoginButton = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a/i"));
	            signupLoginButton.click();

	            // Test Case 5: Verify 'New User Signup!' is visible
	            // Assuming you have some validation logic to check the presence of 'New User Signup!' element

	            // Test Case 6: Enter name and email address
	            WebElement nameInput = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
	            WebElement emailInput = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));

	            double random =  Math.random();
	            nameInput.sendKeys("John Doe");  
	            emailInput.sendKeys("john."+random+"doretefew@example.com");

	            // Test Case 7: Click 'Signup' button
	            WebElement signupButton = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
	            signupButton.click();

	            // Test Case 8: Verify that 'ENTER ACCOUNT INFORMATION' is visible
	            // Assuming you have some validation logic to check the presence of 'ENTER ACCOUNT INFORMATION' element
	            String singupurl = "https://automationexercise.com/signup";
	            String singupurlexpected = driver.getCurrentUrl();
	            
	            if ((singupurl.equals(singupurlexpected))) {
	    			
				    System.out.println("Sing UP page is visible successfully");
	    		} else {
	    			
				    System.out.println("Sing UP page is not visible successfully");
	    		}

	            // Test Case 9 - 16: Implement similar steps for entering account information, creating account,
	            WebElement genderInput = driver.findElement(By.id("uniform-id_gender2"));
	            genderInput.click();
	            
	            WebElement password = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[4]/input"));
	            password.sendKeys("tetsfgh0986");
	            
	           // Locate the dropdown element by its ID (replace "dropdownId" with the actual ID)
	            WebElement days = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/div/div[1]/div/select"));

	            // Create a Select object
	            Select day = new Select(days);

	            // Example 1: Select by visible text
	            day.selectByVisibleText("1");

	            // Wait for a moment to observe the selected option (you can use WebDriverWait for more robust waiting)
	            Thread.sleep(2000); 
	            
	            WebElement mounths = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/div/div[2]/div/select"));

	            // Create a Select object
	            Select mounth = new Select(mounths);

	            // Example 1: Select by visible text
	            mounth.selectByVisibleText("January");

	            // Wait for a moment to observe the selected option (you can use WebDriverWait for more robust waiting)
	            Thread.sleep(2000);
	            
	           // Locate the dropdown element by its ID (replace "dropdownId" with the actual ID)
	            WebElement years = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/div/div[3]/div/select"));

	            // Create a Select object
	            Select year = new Select(years);

	            // Example 1: Select by visible text
	            year.selectByVisibleText("2000");

	            // Wait for a moment to observe the selected option (you can use WebDriverWait for more robust waiting)
	            Thread.sleep(2000);
	            
	            WebElement SignUpForOurNewsLetter = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[6]/label"));
	            SignUpForOurNewsLetter.click();
	            
	            WebElement ReceiveSpecialOffersFromOurPrtners = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[7]/label"));
	            ReceiveSpecialOffersFromOurPrtners.click();
	            Thread.sleep(2000);
	            
	            WebElement first_name = driver.findElement(By.id("first_name"));  
	            WebElement last_name = driver.findElement(By.id("last_name"));
	            WebElement company = driver.findElement(By.id("company"));
	            WebElement address1 = driver.findElement(By.id("address1"));
	            WebElement address2 = driver.findElement(By.id("address2"));
	            WebElement countries = driver.findElement(By.id("country"));
	            WebElement state = driver.findElement(By.id("state"));
	            WebElement city = driver.findElement(By.id("city"));
	            WebElement zipcode = driver.findElement(By.id("zipcode"));
	            WebElement mobile_number = driver.findElement(By.id("mobile_number"));
            	
	            first_name.sendKeys("testt");
	            last_name.sendKeys("testtfh");
	            company.sendKeys("esns");
	            address1.sendKeys("street, 8, enss");
	            address2.sendKeys("street2, 89, halapj");
	            
	            Select country = new Select(countries);
	            country.selectByVisibleText("United States");
	            Thread.sleep(2000);
	            
	            state.sendKeys("california");
	            city.sendKeys("testy");
	            zipcode.sendKeys("348000");
	            mobile_number.sendKeys("0697654219");
	            
	            Thread.sleep(2000);
	            
	            WebElement CreateAccount = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/button"));
	            CreateAccount.click(); 
	            
	           // and verifying the success messages
	            WebElement elementAvecPhrase = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));

	           
	            String texteTrouve = elementAvecPhrase.getText(); 
	            
	            if (texteTrouve.equals("ACCOUNT CREATED!")) {
	            	
	            	System.out.println("Texte trouve : " + texteTrouve);
	            	
	            } else { 
	            	System.out.println("Texte non trouve");
	            	
	            }
	             
	            WebElement Continue = driver.findElement(By.xpath("/html/body/section/div/div/div/div/a"));
	            Continue.click();
	           
	            // Test Case 17: Click 'Delete Account' button
	           
	            WebElement deleteAccountButton = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a"));
	            deleteAccountButton.click();
	            
	           // Test Case 18: Verify that 'ACCOUNT DELETED!' is visible
	            WebElement DeleteAcount = driver.findElement(By.xpath("/html/body/section/div/div/div/h2/b"));
	            String texteDeletAcount = DeleteAcount.getText();
	            
	            if (texteDeletAcount.equals("ACCOUNT DELETED!")) {
	            	
	            	System.out.println("Account Deleted!");
	            	
	            } else { 
	            	System.out.println("Account not Deleted!"+' '+texteDeletAcount);
	            	
	            }

	     
	            // Click 'Continue' button
	            WebElement continueButton = driver.findElement(By.xpath("/html/body/section/div/div/div/div/a"));
	            continueButton.click();
	        } finally {
	            // Close the browser window 
	            driver.quit();
	        }
	    }
}

