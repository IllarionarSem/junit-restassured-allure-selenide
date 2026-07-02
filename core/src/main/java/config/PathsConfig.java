package config;

import org.aeonbits.owner.Config;

@Config.Sources(
        "classpath:paths.properties"
)
public interface PathsConfig extends Config {

    @Key("petstore.api.path")
    String petstoreBaseUrl();
}
