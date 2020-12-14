package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day08Test {

  private Day08 day08;

  @BeforeEach
  void setUp() {
    day08 = new Day08();
  }

  @Test
  @Disabled("Broken on GitHub")
  void partOne() {
    assertEquals(5, day08.partOne());
  }

  @Test
  @Disabled("Broken on GitHub")
  void partTwo() {
    assertEquals(8, day08.partTwo());
  }
}