package io.swagger.petstore.api.step;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.swagger.petstore.constants.JsonSchemaPath;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class PetApiStep {

    @Step("Validate Response Status and Schema")
    public void validateResponseStatusAndSchema(Response response, int statusCode, JsonSchemaPath jsonSchemaPath) {
        response
                .then()
                .statusCode(statusCode)
                .body(matchesJsonSchemaInClasspath(jsonSchemaPath.getPath()));
    }
}
