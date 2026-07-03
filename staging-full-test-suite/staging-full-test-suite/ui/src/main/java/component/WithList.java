package component;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.util.List;

public interface WithList<T extends BaseItem> {

    @Step("Get Page Items List")
    List<T> getItemsList();
}
