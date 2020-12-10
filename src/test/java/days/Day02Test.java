package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day02Test {

  private Day02 day02;

  @BeforeEach
  void setup() {
    day02 = new Day02();
  }

  @Test
  void partOne() {
    assertEquals(4, day02.partOne());
  }

  @Test
  void partTwo() {
    assertEquals(2, day02.partTwo());
  }

}