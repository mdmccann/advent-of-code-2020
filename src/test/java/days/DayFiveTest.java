package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayFiveTest {

  private DayFive dayFive;

  @BeforeEach
  void setUp() {
    dayFive = new DayFive();
  }

  @Test
  void getSeatID() {
    assertEquals(357, dayFive.getSeatID("FBFBBFFRLR"));
  }

}