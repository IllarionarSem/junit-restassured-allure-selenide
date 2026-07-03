package junitextensions;

import com.codeborne.selenide.Selenide;
import config.ConfigProvider;
import driver.SelenideConfiguration;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class SelenideExtension implements BeforeAllCallback, AfterEachCallback {

    @Override
    public void beforeAll(ExtensionContext context) {
        SelenideConfiguration.configure(ConfigProvider.uiConfig());
    }

    @Override
    public void afterEach(ExtensionContext context) {
        Selenide.closeWebDriver();
    }
}
