import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTwoTest {

  private static final List<String> INPUT = Arrays.asList(
      "1-3 a: abcde",
      "1-3 b: cdefg",
      "2-9 c: ccccccccc",
      "11-13 z: zzzzzjzzzizztz",
      "11-13 z: zzzzzjzzzizzzz"
  );

  private DayTwo dayTwo;

  @BeforeEach
  void setup() {
    dayTwo = new DayTwo();
  }

  @Test
  void getNumberOfValidPasswords_partOne() {
    assertEquals(4, dayTwo.getNumberOfValidPasswords(INPUT));
  }

  @Test
  void findTwoEntriesWhereSumEquals_PartTwo() {
    assertEquals(2, dayTwo.getNumberOfValidPasswordsForNewPolicy(INPUT));
  }

}