package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day12Test {

  private Day12 day12;

  @BeforeEach
  void setUp() {
    day12 = new Day12();
  }

  @Test
  void partOne() {
    assertEquals(25, day12.partOne());
  }

  @Test
  void partTwo() {
    assertEquals(286, day12.partTwo());
  }
}