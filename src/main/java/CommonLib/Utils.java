package CommonLib;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utils {

	 public static String captureScreenshot(WebDriver driver) {
		 String ScreenshotsPath="";
		 try {
		 File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 ScreenshotsPath="C:/Users/likitha/git/com.qa.automation/acreports/Screenshots/acti.png";
		 FileHandler.copy(src,new File(ScreenshotsPath));
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 return ScreenshotsPath;
	 }
}
