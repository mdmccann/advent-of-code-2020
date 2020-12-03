import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayThreeTest {

  private static final char[][] INPUT = {
      {'.', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.'},
      {'#', '.', '.', '.', '#', '.', '.', '.', '#', '.', '.'},
      {'.', '#', '.', '.', '.', '.', '#', '.', '.', '#', '.'},
      {'.', '.', '#', '.', '#', '.', '.', '.', '#', '.', '#'},
      {'.', '#', '.', '.', '.', '#', '#', '.', '.', '#', '.'},
      {'.', '.', '#', '.', '#', '#', '.', '.', '.', '.', '.'},
      {'.', '#', '.', '#', '.', '#', '.', '.', '.', '.', '#'},
      {'.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
      {'#', '.', '#', '#', '.', '.', '.', '#', '.', '.', '.'},
      {'#', '.', '.', '.', '#', '#', '.', '.', '.', '.', '#'},
      {'.', '#', '.', '.', '#', '.', '.', '.', '#', '.', '#'}
  };

  private DayThree dayThree;

  @BeforeEach
  void setup() {
    dayThree = new DayThree();
  }

  @Test
  void getNumberOfTreesEncountered() {
    int total = dayThree.getNumberOfTreesEncountered(INPUT, 1, 1, 0, 0) *
        dayThree.getNumberOfTreesEncountered(INPUT, 3, 1, 0, 0) *
        dayThree.getNumberOfTreesEncountered(INPUT, 5, 1, 0, 0) *
        dayThree.getNumberOfTreesEncountered(INPUT, 7, 1, 0, 0) *
        dayThree.getNumberOfTreesEncountered(INPUT, 1, 2, 0, 0);
    assertEquals(336, total);
  }
}
