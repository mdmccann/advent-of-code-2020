package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day10Test {

  private Day10 day10;

  @BeforeEach
  void setUp() {
    day10 = new Day10();
  }

  @Test
  void partOne() {
    assertEquals(220, day10.partOne());
  }

  @Test
  @Disabled("Not yet implemented")
  void partTwo() {
    assertEquals(19208, day10.partTwo());
  }
}