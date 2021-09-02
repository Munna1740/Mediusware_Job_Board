package user_authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.getDriver();
		
		
		//click on login button
		WebElement login_button = driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[3]/a"));
		login_button.click();

		// login
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div/form/div[1]/div[3]/div/div/input"));

		Thread.sleep(2000);

		// set the element input
		email.sendKeys("mdmostafamunna@gmail.com");
		password.sendKeys("332211");
		Thread.sleep(2000);

		// find the button and click on it
		WebElement submit = driver.findElement(By.className("login-btn"));
		submit.click();
		Thread.sleep(5000);

//		WebElement account = driver.findElement(By.xpath("//header/ul[2]/li[1]/a[1]"));
//		account.click();
//
//		WebElement logout = driver.findElement(By.xpath("//header/ul[2]/li[1]/div[1]/a[2]"));
//		logout.click();
		driver.close();

	}

}
