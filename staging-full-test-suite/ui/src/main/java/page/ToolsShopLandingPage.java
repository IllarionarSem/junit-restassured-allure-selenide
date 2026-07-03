package page;

import com.codeborne.selenide.Selenide;
import component.ItemMapper;
import component.Tool;
import component.WithList;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ToolsShopLandingPage extends BasePage<ToolsShopLandingPage> implements WithList<Tool> {

    @Step("Open Landing Page")
    public ToolsShopLandingPage open() {
        Selenide.open("/");
        $x("//nav[contains(@class, 'navbar')]").shouldBe(visible);
        return this;
    }

    @Override
    public List<Tool> getItemsList() {
        return ItemMapper.getItemList($$x("//div[@class='row']//div[@class='container']//a"), Tool::new);
    }
}
