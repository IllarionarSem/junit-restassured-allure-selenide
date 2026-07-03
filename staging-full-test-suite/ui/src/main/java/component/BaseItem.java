package component;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public abstract class BaseItem {

    protected SelenideElement rootElement;

    public BaseItem(SelenideElement rootElement) {
        this.rootElement = rootElement;
    }
}
