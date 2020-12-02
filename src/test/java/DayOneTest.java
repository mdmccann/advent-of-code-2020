import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOneTest {

  private static final List<Integer> INPUT = Arrays.asList(1721, 979, 366, 299, 675, 1456);

  private DayOne dayOne;

  @BeforeEach
  void setup() {
    dayOne = new DayOne();
  }

  @Test
  void findTwoEntriesWhereSumEquals_partOne() {
    assertEquals(514579, dayOne.findProductOfTwoEntriesWhereSumEquals(2020, INPUT));
  }

  @Test
  void findTwoEntriesWhereSumEquals_partTwo() {
    assertEquals(241861950, dayOne.findProductOfThreeEntriesWhereSumEquals(2020, INPUT));
  }

}