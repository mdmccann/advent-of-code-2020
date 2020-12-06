package days;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class DayOne implements Day {

  private static final int TARGET_SUM = 2020;

  /**
   * a + b = targetSum
   * targetSum - a = b
   */
  @Override
  public Object partOne() {
    List<Integer> expenseReport = Day.getInputHelper(1).asIntegerList();
    Set<Integer> expenseReportSet = new HashSet<>(expenseReport);
    return expenseReport.stream()
        .filter(item -> expenseReportSet.contains(TARGET_SUM - item))
        .map(item -> item * (TARGET_SUM - item))
        .findFirst().orElseThrow(() -> new RuntimeException("Could not find two entries which match conditions."));
  }

  /**
   * a + b + c = targetSum
   * targetSum - a = b + c
   */
  @Override
  public Object partTwo() {
    List<Integer> expenseReport = Day.getInputHelper(1).asIntegerList();

    for (Integer a : expenseReport) {
      int targetInnerSum = TARGET_SUM - a;

      Set<Integer> expenseReportSet = new HashSet<>(expenseReport);
      expenseReportSet.remove(a);
      Optional<Integer> bAndCProduct = expenseReport.stream()
          .filter(b -> expenseReportSet.contains(targetInnerSum - b))
          .map(b -> b * (targetInnerSum - b))
          .findFirst();

      if (bAndCProduct.isPresent()) {
        return bAndCProduct.get() * a;
      }
    }
    throw new IllegalArgumentException("Could not find three entries which match conditions.");
  }

  @Override
  public String getName() {
    return "Day One";
  }
}
