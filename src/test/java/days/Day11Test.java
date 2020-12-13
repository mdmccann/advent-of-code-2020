package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day11Test {

  private Day11 day11;

  @BeforeEach
  void setUp() {
    day11 = new Day11();
  }

  @Test
  void partOne() {
    assertEquals(37, day11.partOne());
  }

  @Test
  void partTwo() {

  }
}