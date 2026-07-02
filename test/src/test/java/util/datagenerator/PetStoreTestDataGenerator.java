package util.datagenerator;


import com.github.javafaker.Faker;
import dto.pet.CategoryDTO;
import dto.pet.PetDTO;
import dto.pet.TagDTO;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class PetStoreTestDataGenerator {

    private final Faker faker = new Faker();

    public PetDTO generatePet() {
        return PetDTO.builder()
                .id(faker.number().randomDigit())
                .tags(List.of(generateTag()))
                .name(faker.name().name())
                .category(generateCategory())
                .status(faker.dune().planet())
                .photoUrls(Arrays.asList("string"))
                .build();
    }

    public TagDTO generateTag() {
        return TagDTO.builder()
                .name(faker.name().name())
                .id(faker.number().randomDigit())
                .build();
    }

    public CategoryDTO generateCategory() {
        return CategoryDTO.builder()
                .id(faker.number().randomDigit())
                .name(faker.animal().name())
                .build();
    }
}
