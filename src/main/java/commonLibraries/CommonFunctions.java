package commonLibraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class CommonFunctions {
public static WebDriver driver;
public String screenshotpath=new File("scr/main/resources/errorScreenShots").getAbsolutePath();;
    public void openbrowser()
    {
        WebDriverManager.chromedriver().setup();
    }
    }
    public void closeBrowser()
    {

    }

    public void takeScreenshhots(String screenshots) throws IOException
    {
        TakesScreenshot takesScreenshot=((TakesScreenshot)driver);
        File virtualFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile=new File(screenshotpath+"screenShots.png");
        try
        {FileUtils.copyFile(virtualFile,destinationFile);
    }/*catch (Exception e)
        {
            System.out.println(e);
        }*/
}
