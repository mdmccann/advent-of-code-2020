package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTwoTest {

  private DayTwo dayTwo;

  @BeforeEach
  void setup() {
    dayTwo = new DayTwo();
  }

  @Test
  void partOne() {
    assertEquals(4, dayTwo.partOne());
  }

  @Test
  void partTwo() {
    assertEquals(2, dayTwo.partTwo());
  }

}