package org.example.start;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class Start1Test {
    @Test
    void testCalculate() {
        // Arrange
        Integer @NotNull [] xx = {5};
        // Act
        Start1.calculate(xx);
        // Assert;
        assertEquals(6, xx[0]);
    }
}
