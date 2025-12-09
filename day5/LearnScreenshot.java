package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshot/meeshopage.png");
		
		FileUtils.copyFile(source,destination);
		

	}

}
