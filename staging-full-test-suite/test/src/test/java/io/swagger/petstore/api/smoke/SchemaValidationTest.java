package io.swagger.petstore.api.smoke;

import client.pet.PetClientApi;
import dto.pet.PetDTO;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.swagger.petstore.BaseTest;
import io.swagger.petstore.api.step.PetApiStep;
import io.swagger.petstore.constants.JsonSchemaPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tag.Smoke;
import util.extension.RandomDTO;

import static org.apache.http.HttpStatus.SC_OK;

public class SchemaValidationTest extends BaseTest {

    @Smoke
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @DisplayName("[API] Validate `post PET` response schema")
    public void testCreatePetResponseSchemaMatchOK(@RandomDTO PetDTO pet) {

        var petClientApi = new PetClientApi();

        var apiStep = new PetApiStep();

        apiStep.validateResponseStatusAndSchema(
                petClientApi.createPetResponse(pet),
                SC_OK,
                JsonSchemaPath.CREATE_PET_RESPONSE
        );
    }
}
