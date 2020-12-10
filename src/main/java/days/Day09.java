package days;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class Day09 implements Day {

  private int initialPreambleSize = 25;
  private long partTwoTarget = 90433990;

  public void setInitialPreambleSize(int size) {
    this.initialPreambleSize = size;
  }

  public void setPartTwoTarget(long partTwoTarget) {
    this.partTwoTarget = partTwoTarget;
  }

  @Override
  public Object partOne() {
    List<Long> input = Day.getInputHelper(9).asLongList();
    Iterator<Long> inputIterator = input.iterator();

    Queue<Long> pairOptions = new LinkedList<>();

    for (int i = 0; i < initialPreambleSize; i++) {
      pairOptions.add(inputIterator.next());
    }

    while (inputIterator.hasNext()) {
      Long next = inputIterator.next();
      Optional<Long> pair = pairOptions.stream().filter(opt -> pairOptions.contains(next - opt)).findFirst();
      if (pair.isPresent()) {
        pairOptions.add(next);
        pairOptions.remove();
      } else {
        return next;
      }
    }
    throw new RuntimeException("Could not find answer.");
  }

  @Override
  public Object partTwo() {
    List<Long> input = Day.getInputHelper(9).asLongList();

    for (int i = 0; i < input.size() - 1; i++) {
      long total = input.get(i);

      long smallest = input.get(i);
      long largest = input.get(i);
      int j = i + 1;
      while (total < partTwoTarget && j < input.size()) {
        Long next = input.get(j);
        total += next;

        if (total <= partTwoTarget) {
          if (next < smallest) {
            smallest = next;
          } else if (next > largest) {
            largest = next;
          }

          j++;
        }
      }

      if (total == partTwoTarget) {
        return smallest + largest;
      }
    }

    throw new RuntimeException("Could not find answer.");
  }

  @Override
  public String getName() {
    return "Day Nine";
  }

}
