package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // webDriver 1, webDriver 2
    private static ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); // Chrome, firefox ...

    public static WebDriver getDriver() {
        // extend report türkçe bilg çalışmaması sebebiyle kondu
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {

            if (threadDriver.get() == null) {

                switch (threadBrowserName.get()) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        threadDriver.set(new ChromeDriver());
                        break;

                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        threadDriver.set(new FirefoxDriver());
                        break;

                    case "safari":
                        WebDriverManager.safaridriver().setup();
                        threadDriver.set(new SafariDriver());
                        break;

                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        threadDriver.set(new EdgeDriver());
                        break;
                }
            }
        }

            return threadDriver.get();
        }

        public static void quitDriver () {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (threadDriver.get() != null)
            {
                threadDriver.get().quit();
                WebDriver driver = threadDriver.get();
                driver = null;
                threadDriver.set(driver);
            }
        }
        public static void setThreadBrowserName (String browserName){
            GWD.threadBrowserName.set(browserName);
        }
    }
