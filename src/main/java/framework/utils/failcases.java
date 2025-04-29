package framework.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class failcases  implements ITestListener {
  
    @Override
    public void onTestFailure(ITestResult result) {
        String filename = result.getName();
        System.out.println("Test failed: " + filename);

//        WebDriver driver = null;
//
//        // Attempt to access the WebDriver field via reflection
//        try {
//            // Fetch the WebDriver field by name (adjust if needed)
//            Field driverField = result.getTestClass().getRealClass().getDeclaredField("driver");
//            driverField.setAccessible(true);  // Make the field accessible if it's private or protected
//            
//            driver = (WebDriver) driverField.get(result.getInstance());
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            System.err.println("Error accessing WebDriver: " + e.getMessage());
//            e.printStackTrace();
//        }
//
//        // Check if WebDriver is available before capturing the screenshot
//        if (driver != null) {
//            try {
//                // Ensure the screenshot directory exists
//                File screenshotDir = new File("./failscreenshot/");
//                if (!screenshotDir.exists()) {
//                    screenshotDir.mkdir();  // Create the directory if it doesn't exist
//                }
//
//                // Capture the screenshot
//                File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//                // Save the screenshot with the test name
//                File destination = new File("./failscreenshot/" + filename + ".png");
//
//                // Copy the screenshot to the destination folder
//                FileUtils.copyFile(sourceFile, destination);
//                System.out.println("Screenshot saved to: " + destination.getAbsolutePath());
//            } catch (IOException e) {
//                System.err.println("Failed to capture or save screenshot for test: " + filename);
//                e.printStackTrace();
//            }
//        } else {
//            System.err.println("WebDriver is null, unable to capture screenshot for test: " + filename);
//        }
//    }

    } 
}
