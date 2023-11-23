package automationexercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllProducts {
	
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
    		
    		//Click on 'Products' button
    		WebElement productButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
    		productButton.click();
    		
    		// Verify user is navigated to ALL PRODUCTS page successfully
    		String productUrl = driver.getCurrentUrl();
    		
    		if (productUrl.equals("https://automationexercise.com/products")) {
    			
    			System.out.println("Navigated to ALL PRODUCTS page successfully");
    			
    		} else {
    			
    			System.out.println("NOT navigated to ALL PRODUCTS page successfully");
    			
    		}
    		
    		//The products list is visible
    		WebElement productList = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));
    		if (productList.getText().equals("All Products")) {
    			 
    			 System.out.println("The products list is visible");
    			 
    		 } else {
    			 
    			 System.out.println("the products list is NOT visible");
    		 }
    		
    		// Click on 'View Product' of first product
    		WebElement viewProduct = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
    		viewProduct.click();
    		
    		//User is landed to product detail page
    		String productDetail = driver.getCurrentUrl();
    		
    		if (productDetail.contains("https://automationexercise.com/product_details")) {
    			
    			System.out.println("Landed to product detail page");
    		} else {
    			
    			System.out.println("Not landed to product detail page");
    		}
    		
    		//Verify that detail detail is visible: product name, category, price, availability, condition, brand
    		WebElement productName = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2"));
            WebElement productCategory = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]"));
            WebElement productPrice = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span"));
            WebElement productAvailability = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]"));
            WebElement productCondition = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]"));
            WebElement productBrand = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]"));

            System.out.println("Product Name: " + productName.getText());
            System.out.println("Product Category: " + productCategory.getText());
            System.out.println("Product Price: " + productPrice.getText());
            System.out.println("Product Availability: " + productAvailability.getText());
            System.out.println("Product Condition: " + productCondition.getText());
            System.out.println("Product Brand: " + productBrand.getText());
    		
        } finally {
            // Close the browser window 
            driver.quit();
        }
        
	}

}
