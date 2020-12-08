package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayEightTest {

  private DayEight dayEight;

  @BeforeEach
  void setUp() {
    dayEight = new DayEight();
  }

  @Test
  void partOne() {
    assertEquals(5, dayEight.partOne());
  }

  @Test
  void partTwo() {
    assertEquals(8, dayEight.partTwo());
  }
}