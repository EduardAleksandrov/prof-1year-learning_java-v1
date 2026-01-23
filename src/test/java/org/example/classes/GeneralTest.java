package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}