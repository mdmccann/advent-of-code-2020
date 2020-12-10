package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day09Test {

  private Day09 day09;

  @BeforeEach
  void setUp() {
    day09 = new Day09();
  }

  @Test
  void partOne() {
    day09.setInitialPreambleSize(5);
    assertEquals(127L, day09.partOne());
  }

  @Test
  void partTwo() {
    day09.setPartTwoTarget(127L);
    assertEquals(62L, day09.partTwo());
  }
}