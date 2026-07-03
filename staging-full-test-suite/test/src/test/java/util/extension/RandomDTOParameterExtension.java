package util.extension;

import dto.pet.CategoryDTO;
import dto.pet.PetDTO;
import dto.pet.TagDTO;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import util.datagenerator.PetStoreTestDataGenerator;

import java.lang.reflect.Parameter;

public class RandomDTOParameterExtension implements ParameterResolver {

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return parameterContext.isAnnotated(RandomDTO.class);
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return getRandomValue(parameterContext.getParameter(), extensionContext);
    }

    private Object getRandomValue(Parameter parameter, ExtensionContext extensionContext) {
        Class<?> type = parameter.getType();

        if (PetDTO.class.equals(type)) {
            return PetStoreTestDataGenerator.generatePet();
        }
        if (TagDTO.class.equals(type)) {
            return PetStoreTestDataGenerator.generateTag();
        }
        if (CategoryDTO.class.equals(type)) {
            return PetStoreTestDataGenerator.generateCategory();
        }

        throw new ParameterResolutionException("No random generator implemented for " + type);
    }
}
