package org.example.classes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import io.qameta.allure.*;

@Epic("Calculation Engine")
@Feature("Arithmetic Operations")
class GeneralTest {

    @Test
    void sum() {
        // Arrange
        General gn = new General("hello first test");
        // Act
        int result = gn.sumGen(5);
        // Assert
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Verify Sum Calculation")
    @Description("This test checks if the sumGen method correctly adds 5 to the input.")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("YourName")
    @Link(name = "Website", url = "https://example.org")
    @Issue("AUTH-123")
    void sum2() {
        // Use Allure.step to document actions in the report
        Allure.step("Initialize General object with a custom message", () -> {
            General gn = new General("hello first test");

            Allure.step("Perform sum calculation with value 5", () -> {
                int result = gn.sumGen(5);

                Allure.step("Assert that the result is equal to 10", () -> {
                    assertEquals(10, result, "The sum calculation should be accurate");
                });
            });
        });
    }
}