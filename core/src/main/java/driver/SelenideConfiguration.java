package driver;

import com.codeborne.selenide.Configuration;
import config.UiConfig;
import lombok.experimental.UtilityClass;

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
    }
}
