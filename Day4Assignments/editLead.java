package Day4Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
				
		username.sendKeys("demoSalesManager"); 
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//home page 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(3000);
		//Leads tab
		driver.findElement(By.linkText("Leads")).click();
		//Create tab left navigation
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Lead details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mark");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gary");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("svivek2687@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9600239627");
		//Click Create Lead
		driver.findElement(By.name("submitButton")).click();
		
		//View Lead page is displayed
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Lead created successfully ");
		
		//Edit
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Steve");
		//Update
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Lead Updated successfully ");

	}

}
