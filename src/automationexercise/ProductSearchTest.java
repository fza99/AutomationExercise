package automationexercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSearchTest {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");

        // Initialize ChromeDriverSSS
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Launch browser
            driver.get("http://automationexercise.com");

            // 2. Navigate to URL 'http://automationexercise.com'
            // Wait for the page to load (You might need to adjust the wait time)
            Thread.sleep(2000);

            // 3. Verify that home page is visible successfully
            String expectedTitle = "Automation Exercise";
            String actualTitle = driver.getTitle();
            if (actualTitle.contains(expectedTitle)) {
                System.out.println("Home page is visible successfully");
            } else {
                System.out.println("Home page is not visible");
            }

            // 4. Click on 'Products' button
            WebElement productsButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
            productsButton.click();

            // 5. Verify user is navigated to ALL PRODUCTS page successfully
            String expectedProductsPageTitle = "Automation Exercise - All Products";
            String actualProductsPageTitle = driver.getTitle();
            if (actualProductsPageTitle.contains(expectedProductsPageTitle)) {
                System.out.println("Navigated to ALL PRODUCTS page successfully");
            } else {
                System.out.println("Navigation to ALL PRODUCTS page failed");
            }

            // 6. Enter product name in search input and click search button
            String productName = "Blue Top";
            WebElement searchInput = driver.findElement(By.id("search_product"));
            searchInput.sendKeys(productName);

            WebElement searchButton = driver.findElement(By.id("submit_search"));
            searchButton.click();

            // 7. Verify 'SEARCHED PRODUCTS' is visible
            WebElement searchedProductsHeader = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));
            if (searchedProductsHeader.isDisplayed()) {
                System.out.println("'SEARCHED PRODUCTS' is visible");
            } else {
                System.out.println("'SEARCHED PRODUCTS' is not visible");
            }

            // 8. Verify all the products related to search are visible
            WebElement productSearched = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p"));
            if (productSearched.getText().equals(productName)) {
            	
            	System.out.println("All the products related to search are visible");
            	
            } else {
            	
            	 System.out.println("The products related to search are not visible"+ " "+productSearched);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

