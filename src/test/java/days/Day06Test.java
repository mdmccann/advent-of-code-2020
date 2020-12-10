package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day06Test {

  private Day06 day06;

  @BeforeEach
  void setUp() {
    day06 = new Day06();
  }

  @Test
  void partOne() {
    assertEquals(11, day06.partOne());
  }

  @Test
  void partTwo() {
    assertEquals(6, day06.partTwo());
  }

}