package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03Test {

  private Day03 day03;

  @BeforeEach
  void setup() {
    day03 = new Day03();
  }

  @Test
  void getNumberOfTreesEncountered() {
    assertEquals(7, day03.getNumberOfTreesEncountered(3, 1, 0, 0));
  }
}
