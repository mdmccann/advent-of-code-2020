package days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day01Test {

  private Day01 day01;

  @BeforeEach
  void setup() {
    day01 = new Day01();
  }

  @Test
  void partOne() {
    assertEquals(514579, day01.partOne());
  }

  @Test
  void findTwoEntriesWhereSumEquals_partTwo() {
    assertEquals(241861950, day01.partTwo());
  }

}