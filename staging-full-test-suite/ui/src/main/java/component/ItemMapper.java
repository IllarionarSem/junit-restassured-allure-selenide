package component;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.function.Function;

import static com.codeborne.selenide.Condition.visible;

@UtilityClass
public class ItemMapper {

    public <T extends BaseItem> List<T> getItemList(ElementsCollection elements, Function<SelenideElement, T> mapper) {
        elements.shouldBe(CollectionCondition.sizeGreaterThan(0));
        return elements.stream()
                .map(mapper)
                .toList();
    }
}
