package config;


import org.aeonbits.owner.Config;

@Config.Sources(
        {
                //"system:properties",
                //"system:env",
                //"classpath:driverconfigs/${env}.properties"
                "classpath:driverconfigs/ui.staging.properties"
        }
)
public interface UiConfig extends Config {

    @Key("base.url")
    String baseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("timeout")
    @DefaultValue("10000")
    long timeout();

    @Key("pageLoadTimeout")
    @DefaultValue("10000")
    long pageLoadTimeout();

    @Key("pageLoadStrategy")
    @DefaultValue("none")
    String pageLoadStrategy();

    @Key("screenshots")
    @DefaultValue("true")
    boolean screenshots();

    @Key("headless")
    @DefaultValue("false")
    boolean headless();
}
