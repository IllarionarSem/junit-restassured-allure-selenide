package client.pet;

import client.BaseClientApi;
import config.ConfigProvider;
import dto.pet.PetDTO;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class PetClientApi extends BaseClientApi {

    private final String GET_BY_ID = "/pet/{petId}";
    private final String DELETE_BY_ID = "/pet/{petId}";

    private final String BASE_URL = ConfigProvider.pathsConfig().petstoreBaseUrl();

    public PetDTO createPet(PetDTO petDTO) {
        return this.createPetResponse(petDTO)
                .then()
                .statusCode(SC_OK)
                .extract()
                .as(PetDTO.class);
    }

    @Step("Create Pet {petDTO}")
    public Response createPetResponse(PetDTO petDTO) {
        return with()
                .baseUri(BASE_URL)
                .basePath("/pet")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(petDTO)
                .when()
                .post();
    }

    public PetDTO getPetById(String petId) {
        return this.getPetByIdResponse(petId)
                .then()
                .statusCode(SC_OK)
                .extract()
                .as(PetDTO.class);
    }

    @Step("Get Pet by ID {petId}")
    public Response getPetByIdResponse(String petId) {
        return with()
                .baseUri(BASE_URL)
                .basePath(GET_BY_ID)
                .pathParam("petId", petId)
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .get();
    }
}
