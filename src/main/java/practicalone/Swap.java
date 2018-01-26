package practicalone;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class provides a static method that swaps AtomicIntegers.
 *
 * @author Gregory M. Kapfhammer
 */
public class Swap {

  /**
   * Performs the swap of the two provided values.
   *
   * @param first the first value; will receive the second value
   * @param second the second value; will receive the first value
   */
  public static void swap(AtomicInteger first, AtomicInteger second) {
  }

  /**
   * Perform the swap with two specific values and produce output.
   */
  public static void main(String[] args) {
    AtomicInteger dataFirst = new AtomicInteger(10);
    AtomicInteger dataSecond = new AtomicInteger(20);
    System.out.println("Values before the swap:");
    System.out.println("  First value : " + dataFirst.get());
    System.out.println("  Second value: " + dataSecond.get());
    Swap.swap(dataFirst, dataSecond);
  }
}
