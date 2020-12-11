package days;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Day10 implements Day {


  @Override
  public Object partOne() {
    List<Integer> input = Day.getInputHelper(10).asIntegerList();
    Collections.sort(input);

    Iterator<Integer> iterator = input.iterator();
    Map<Integer, Integer> findings = new HashMap<>();
    int prev = 0;

    while (iterator.hasNext()) {
      int next = iterator.next();
      int result = next - prev;

      if (findings.containsKey(result)) {
        findings.put(result, findings.get(result) + 1);
      } else {
        findings.put(result, 1);
      }

      prev = next;
    }

    return findings.get(1) * (findings.get(3) + 1);
  }

  @Override
  public Object partTwo() {
    return null;
  }

  @Override
  public String getName() {
    return "Day Ten";
  }
}
