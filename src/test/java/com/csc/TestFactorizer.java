package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  // Replace the following example tests with your own tests
  // of the prime factorization function.
  @Test
  public void testNegative() {
    assertEquals(null, factorizer.Primer(-1));
  }

  @Test
  public void testZero() {
    assertEquals(null, factorizer.Primer(0));
  }

  @Test
  public void testOne() {
    assertEquals(null, factorizer.Primer(1));
  }

  @Test
  public void testTwo() {
    assertEquals("2 ", factorizer.Primer(2));
  }

  @Test
  public void testThree() {
    assertEquals("3 ", factorizer.Primer(3));
  }

  @Test
  public void testFour() {
    assertEquals("2 2 ", factorizer.Primer(4));
  }

  @Test
  public void testThirty() {
    assertEquals("2 3 5 ", factorizer.Primer(30));
  }

  @Test
  public void testMeaning() {
    assertEquals("2 3 7 ", factorizer.Primer(42));
  }

  @Test
  public void testHumor() {
    assertEquals("3 23 ", factorizer.Primer(69));
  }

}
