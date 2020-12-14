package days;

import java.util.Arrays;
import java.util.List;

public class Day12 implements Day {

  @Override
  public Object partOne() {
    List<String> instructions = Day.getInputHelper(12).asStringList();

    int xDist = 0, yDist = 0;
    List<Character> dirs = Arrays.asList('E', 'S', 'W', 'N');
    char dir = 'E';

    for (String inst : instructions) {

      char instType = inst.charAt(0);
      int instAmount = Integer.parseInt(inst.substring(1));

      switch (instType) {
        case 'N':
          yDist += instAmount;
          break;
        case 'S':
          yDist -= instAmount;
          break;
        case 'E':
          xDist += instAmount;
          break;
        case 'W':
          xDist -= instAmount;
          break;
        case 'L':
          dir = dirs.get(((dirs.indexOf(dir) - instAmount / 90) + dirs.size()) % dirs.size());
          break;
        case 'R':
          dir = dirs.get((dirs.indexOf(dir) + instAmount / 90) % dirs.size());
          break;
        case 'F':
          switch (dir) {
            case 'N':
              yDist += instAmount;
              break;
            case 'S':
              yDist -= instAmount;
              break;
            case 'E':
              xDist += instAmount;
              break;
            case 'W':
              xDist -= instAmount;
              break;
          }
          break;
      }
    }

    return Math.abs(xDist) + Math.abs(yDist);
  }

  @Override
  public Object partTwo() {
    List<String> instructions = Day.getInputHelper(12).asStringList();

    int wptXCord = 10, wptYCord = 1;
    int xDist = 0, yDist = 0;

    for (String inst : instructions) {

      char instType = inst.charAt(0);
      int instAmount = Integer.parseInt(inst.substring(1));

      switch (instType) {
        case 'N':
          wptYCord += instAmount;
          break;
        case 'S':
          wptYCord -= instAmount;
          break;
        case 'E':
          wptXCord += instAmount;
          break;
        case 'W':
          wptXCord -= instAmount;
          break;
        case 'L':
          while (instAmount != 0) {
            int temp = wptYCord;
            wptYCord = wptXCord;
            wptXCord = temp * -1;
            instAmount -= 90;
          }
          break;
        case 'R':
          while (instAmount != 0) {
            int temp = wptYCord;
            wptYCord = wptXCord * -1;
            wptXCord = temp;
            instAmount -= 90;
          }
          break;
        case 'F':
          xDist += wptXCord * instAmount;
          yDist += wptYCord * instAmount;
          break;
      }
    }

    return Math.abs(xDist) + Math.abs(yDist);
  }

  @Override
  public String getName() {
    return "Day Twelve";
  }

}
