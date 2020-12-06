package days;

public class DayThree implements Day {

  @Override
  public Object partOne() {
    return getNumberOfTreesEncountered(3, 1, 0, 0);
  }

  @Override
  public Object partTwo() {
    return getNumberOfTreesEncountered(1, 1, 0, 0) *
        getNumberOfTreesEncountered(3, 1, 0, 0) *
        getNumberOfTreesEncountered(5, 1, 0, 0) *
        getNumberOfTreesEncountered(7, 1, 0, 0) *
        getNumberOfTreesEncountered(1, 2, 0, 0);
  }

  @Override
  public String getName() {
    return "Day Three";
  }

  int getNumberOfTreesEncountered(int velocityRight, int velocityDown, int startXCoordinate, int startYCoordinate) {
    char[][] slopeGrid = Day.getInputHelper(3).asGrid();
    int currentXCord = startXCoordinate;
    int currentYCord = startYCoordinate;
    int treeCount = 0;

    while (currentYCord < slopeGrid.length) {
      if (slopeGrid[currentYCord][currentXCord] == '#') {
        treeCount++;
      }

      currentXCord = (currentXCord + velocityRight) % slopeGrid[0].length;
      currentYCord += velocityDown;
    }

    return treeCount;
  }
}
