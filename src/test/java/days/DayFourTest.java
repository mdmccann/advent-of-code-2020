package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayFourTest {

  private DayFour dayFour;

  @BeforeEach
  void setup() {
    dayFour = new DayFour();
  }

  @Test
  void partOne() {
    assertEquals(4, dayFour.partOne());
  }

  @Test
  void partTwo() {
    assertEquals(3, dayFour.partTwo());
  }

}