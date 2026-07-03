package io.swagger.petstore.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum JsonSchemaPath {

    CREATE_PET_RESPONSE("schemas/pet/create-pet-response-schema.json");

    private final String path;
}
