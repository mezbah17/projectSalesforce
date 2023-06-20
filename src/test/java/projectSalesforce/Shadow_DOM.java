package projectSalesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shadow_DOM {
	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://developer.salesforce.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.body.style.zoom = '0.8'");
		WebElement element = (WebElement)js.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('header.c360-nav>div>div>nav.utility-nav.show>ul.utility-icons>li.utility-icons-items.login>hgf-c360login').shadowRoot.querySelector('hgf-popover>hgf-button.utility-button>span:nth-child(2)')");
		Actions action = new Actions(driver); 
		action.moveToElement(element).build().perform();
		
		WebElement element1 = (WebElement)js.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('header.c360-nav>div>div>nav.utility-nav.show>ul.utility-icons>li.utility-icons-items.login>hgf-c360login').shadowRoot.querySelector('hgf-popover.hgf-popover>div#login-unauth-content-68>div.links>a')");
		element1.click();
		driver.findElement(By.id("username")).sendKeys("uddinmezbah17-5u3x@force.com");
		driver.findElement(By.id("password")).sendKeys("azadmezbah17");
		driver.findElement(By.id("Login")).click();
		driver.quit();
	}

}
