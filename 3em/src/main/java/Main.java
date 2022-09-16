import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/felicemarano/eclipse-workspace/chromedriver.exe");
		
		WebDriver drive=new SafariDriver();
		
		drive.get("https://femminile.football.it/query.php?id_query=219");
		
		//Thread.sleep(1000);
		
		//drive.manage().window().maximize();
		
		for (int i = 5; i<25; i++) {
			
			String age = drive.findElement(By.cssSelector("tr:nth-child(" + i + ") > .daright:nth-child(2)")).getText();
			
			int eta = 2022 - Integer.parseInt(age);
			
			System.out.println("L'eta di questa giocatrice e: " + eta);
			Thread.sleep(500);
		}
		
		
	}

}
