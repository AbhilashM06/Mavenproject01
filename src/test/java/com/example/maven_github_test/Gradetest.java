package com.example.maven_github_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Gradetest {

    @Test
    void testTotal() {
        assertEquals(225,
            Gradcalc.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0,
            Gradcalc.calculateAverage(75, 68, 82), 0.001);
    }

    @Test
    void testAGrade() {
        assertEquals("A",
            Gradcalc.calculateGrade(270));
    }

    @Test
    void testBGrade() {
        assertEquals("B",
            Gradcalc.calculateGrade(255));
    }

    @Test
    void testCGrade() {
        assertEquals("C",
            Gradcalc.calculateGrade(225));
    }

    @Test
    void testPass() {
        assertEquals("Pass",
            Gradcalc.calculateGrade(150));
    }

    @Test
    void testFail() {
        assertEquals("Fail",
            Gradcalc.calculateGrade(90));
    }
}