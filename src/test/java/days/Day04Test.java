package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day04Test {

  private Day04 day04;

  @BeforeEach
  void setup() {
    day04 = new Day04();
  }

  @Test
  void partOne() {
    assertEquals(4, day04.partOne());
  }

  @Test
  void partTwo() {
    assertEquals(3, day04.partTwo());
  }

}