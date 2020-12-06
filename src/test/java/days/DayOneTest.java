package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOneTest {

  private DayOne dayOne;

  @BeforeEach
  void setup() {
    dayOne = new DayOne();
  }

  @Test
  void partOne() {
    assertEquals(514579, dayOne.partOne());
  }

  @Test
  void findTwoEntriesWhereSumEquals_partTwo() {
    assertEquals(241861950, dayOne.partTwo());
  }

}