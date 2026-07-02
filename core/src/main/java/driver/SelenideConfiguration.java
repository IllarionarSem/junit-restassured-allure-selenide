package driver;

import com.codeborne.selenide.Configuration;
import config.UiConfig;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.chrome.ChromeOptions;

@UtilityClass
public class SelenideConfiguration {

    public void configure(UiConfig config) {

        Configuration.baseUrl = config.baseUrl();
        Configuration.browser = config.browser();
        Configuration.pageLoadStrategy = config.pageLoadStrategy();
        Configuration.pageLoadTimeout = config.pageLoadTimeout();
        Configuration.screenshots = config.screenshots();
        Configuration.timeout = config.timeout();
        Configuration.headless = config.headless();

        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--no-sandbox",
                "--disable-dev-shm-usage",
                "--window-size=1920,1080"
        );

        Configuration.browserCapabilities = options;
    }
}
