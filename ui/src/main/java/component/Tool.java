package component;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Tool extends BaseItem {

    private final String toolName;
    private final String toolPrice;

    public Tool(SelenideElement rootElement) {
        super(rootElement);

        this.toolName = rootElement.$x(".//h5[@data-test='product-name']").text();
        this.toolPrice = rootElement.$x(".//span[@data-test='product-price']").text();
    }
}
