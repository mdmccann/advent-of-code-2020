package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayThreeTest {

  private DayThree dayThree;

  @BeforeEach
  void setup() {
    dayThree = new DayThree();
  }

  @Test
  void getNumberOfTreesEncountered() {
    assertEquals(7, dayThree.getNumberOfTreesEncountered(3, 1, 0, 0));
  }
}
