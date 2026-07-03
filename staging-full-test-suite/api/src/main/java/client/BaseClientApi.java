package client;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public abstract class BaseClientApi {


    public RequestSpecification with() {

        var config = RestAssuredConfig.config()
                .httpClient(
                        HttpClientConfig.httpClientConfig()
                                .setParam("http.socket.timeout", 5000)
                                .setParam("http.connection.timeout", 5000)
                                .setParam("http.socket.keepalive", 10000)
                );

        return RestAssured.given()
                .config(config)
                .relaxedHTTPSValidation()
                .filters(
                        new RequestLoggingFilter(),
                        new AllureRestAssured(),
                        new ResponseLoggingFilter()
                );
    }
}
