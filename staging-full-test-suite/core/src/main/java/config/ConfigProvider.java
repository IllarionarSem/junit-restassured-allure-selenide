package config;

import lombok.experimental.UtilityClass;
import org.aeonbits.owner.ConfigFactory;

@UtilityClass
public class ConfigProvider {

    private PathsConfig PATHS_CONFIG = ConfigFactory.create(PathsConfig.class);
    private UiConfig UI_CONFIG = ConfigFactory.create(UiConfig.class);

    public PathsConfig pathsConfig() {
        return PATHS_CONFIG;
    }

    public UiConfig uiConfig() {
        return UI_CONFIG;
    }
}
