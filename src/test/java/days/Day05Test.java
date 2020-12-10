package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day05Test {

  private Day05 day05;

  @BeforeEach
  void setUp() {
    day05 = new Day05();
  }

  @Test
  void getSeatID() {
    assertEquals(357, day05.getSeatID("FBFBBFFRLR"));
  }

}