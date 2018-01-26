package testone;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import practicalone.Swap;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * A JUnit test suite for Swap.
 *
 * @author Gregory M. Kapfhammer
 */

public class TestSwap {

  @Test
  public void testSwapFirstSmallerThanSecond() {
    AtomicInteger first = new AtomicInteger(10);
    AtomicInteger second = new AtomicInteger(20);
    Swap.swap(first, second);
    assertEquals(first.get(), 20);
    assertEquals(second.get(), 10);
  }

  @Test
  public void testValuesEqualNoSwapEvident() {
    AtomicInteger first = new AtomicInteger(10);
    AtomicInteger second = new AtomicInteger(10);
    Swap.swap(first, second);
    assertEquals(first.get(), 10);
    assertEquals(second.get(), 10);
  }

}
