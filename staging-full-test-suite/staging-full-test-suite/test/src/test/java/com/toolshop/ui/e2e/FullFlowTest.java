package com.toolshop.ui.e2e;

import com.toolshop.ui.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.ToolsShopLandingPage;
import tag.E2E;

public class FullFlowTest extends BaseTest {

    @E2E
    @Test
    @DisplayName("[UI] Add tool to cart adn check cart")
    public void testAddToolToCart() {

        var landingPage = new ToolsShopLandingPage()
                .open();

        var tool = landingPage
                .getItemsList().get(0);

        var toolName = tool.getToolName();
        var toolPrice = tool.getToolPrice();

        System.out.println(toolName);
        System.out.println(toolPrice);

        landingPage.getItemsList().stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
