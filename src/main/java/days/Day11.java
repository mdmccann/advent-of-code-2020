package days;

import java.util.Arrays;

public class Day11 implements Day {


  @Override
  public Object partOne() {
    return getFinalOccupiedCount(Day.getInputHelper(11).asGrid(), Integer.MAX_VALUE);
  }

  @Override
  public Object partTwo() {
    return null;
  }

  @Override
  public String getName() {
    return "Day Eleven";
  }

  private int getFinalOccupiedCount(char[][] seatPlan, int prevChangeAmount) {
    int changes = 0;
    char[][] newSeatPlan = Arrays.stream(seatPlan).map(char[]::clone).toArray($ -> seatPlan.clone());

    for (int col = 0; col < seatPlan[0].length; col++) {
      for (int row = 0; row < seatPlan.length; row++) {

        int occupiedCount = 0;

        for (int adjCol = Math.max(col - 1, 0); adjCol <= Math.min(col + 1, seatPlan[0].length - 1); adjCol++) {
          for (int adjRow = Math.max(row - 1, 0); adjRow <= Math.min(row + 1, seatPlan.length - 1); adjRow++) {
            if (!(adjRow == row && adjCol == col) && seatPlan[adjRow][adjCol] == '#') {
              occupiedCount++;
            }
          }
        }

        if (seatPlan[row][col] == 'L' && occupiedCount == 0) {
          newSeatPlan[row][col] = '#';
          changes++;
        } else if (seatPlan[row][col] == '#' && occupiedCount >= 4) {
          newSeatPlan[row][col] = 'L';
          changes++;
        }
      }
    }

    if (prevChangeAmount == changes) {
      return getOccupiedCount(newSeatPlan);
    }
    return getFinalOccupiedCount(newSeatPlan, changes);
  }

  private int getOccupiedCount(char[][] seatPlan) {
    int occupiedCount = 0;
    for (int col = 0; col < seatPlan[0].length; col++) {
      for (int row = 0; row < seatPlan.length; row++) {
        if (seatPlan[row][col] == '#') {
          occupiedCount++;
        }
      }
    }
    return occupiedCount;
  }
}
