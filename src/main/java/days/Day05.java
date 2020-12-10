package days;

import java.util.List;
import java.util.stream.Collectors;

public class Day05 implements Day {

  @Override
  public Object partOne() {
    return Day.getInputHelper(5).asStringStream().mapToInt(this::getSeatID).min().orElseThrow(RuntimeException::new);
  }

  @Override
  public Object partTwo() {
    List<Integer> orderedSeatIds = Day.getInputHelper(5).asStringStream().map(this::getSeatID).sorted().collect(Collectors.toList());
    for (int i = 0; i < orderedSeatIds.size(); i++) {
      if (orderedSeatIds.get(i + 1) - orderedSeatIds.get(i) != 1) {
        return orderedSeatIds.get(i) + 1;
      }
    }
    throw new RuntimeException("Could not find missing Seat ID");
  }

  @Override
  public String getName() {
    return "Day Five";
  }

  int getSeatID(String boardingPass) {
    int row = Integer.parseInt(boardingPass.substring(0, 7).replace('F', '0').replace('B', '1'), 2);
    int col = Integer.parseInt(boardingPass.substring(7, 10).replace('L', '0').replace('R', '1'), 2);
    return row * 8 + col;
  }
}
