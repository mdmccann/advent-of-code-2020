import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOneTest {

  private DayOne dayOne;

  @BeforeEach
  void setup() {
    dayOne = new DayOne();
  }

  @Test
  void findTwoEntriesWhereSumEquals_PartOne() {
    List<Integer> expenseReport = Arrays.asList(1721, 979, 366, 299, 675, 1456);
    assertEquals(dayOne.findProductOfTwoEntriesWhereSumEquals(2020, expenseReport), 514579);
  }

  @Test
  void findTwoEntriesWhereSumEquals_PartTwo() {
    List<Integer> expenseReport = Arrays.asList(1721, 979, 366, 299, 675, 1456);
    assertEquals(dayOne.findProductOfThreeEntriesWhereSumEquals(2020, expenseReport), 241861950);
  }

}