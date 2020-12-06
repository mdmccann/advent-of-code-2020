package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaySixTest {

  private DaySix daySix;

  @BeforeEach
  void setUp() {
    daySix = new DaySix();
  }

  @Test
  void partOne() {
    assertEquals(11, daySix.partOne());
  }

  @Test
  void partTwo() {
    assertEquals(6, daySix.partTwo());
  }

}