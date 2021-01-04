package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day13Test {

  Day13 day13 = new Day13();

  @BeforeEach
  void setUp() {
    day13 = new Day13();
  }

  @Test
  void partOne() {
    assertEquals(295, day13.partOne());
  }

  @Test
  void partTwo() {
  }
}