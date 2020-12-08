package days;

import java.util.Arrays;

public class DayEight implements Day {
  @Override
  public Object partOne() {
    String[] instructions = Day.getInputHelper(8).asString().split("\r\n");
    int[] executed = new int[instructions.length];

    int i = 0;
    int accumulator = 0;

    while (i < instructions.length) {
      if (executed[i] == 1) {
        break;
      }

      switch (instructions[i].substring(0, 3)) {
        case "nop":
          executed[i]++;
          i++;
          break;
        case "acc":
          accumulator += Integer.parseInt(instructions[i].substring(4));
          executed[i]++;
          i++;
          break;
        case "jmp":
          executed[i]++;
          i += (Integer.parseInt(instructions[i].substring(4)));
          break;
      }
    }

    return accumulator;
  }

  @Override
  public Object partTwo() {
    String[] instructions = Day.getInputHelper(8).asString().split("\r\n");

    for (int i = 0; i < instructions.length; i++) {

      String[] modified = Arrays.copyOf(instructions, instructions.length);

      if (instructions[i].substring(0, 3).equals("nop") && !instructions[i].substring(4).equals("+0")) {
        modified[i] = instructions[i].replace("nop", "jmp");
      } else if (instructions[i].substring(0, 3).equals("jmp") && !instructions[i].substring(4).equals("+0")) {
        modified[i] = instructions[i].replace("jmp", "nop");
      }

      Integer result = getAccumulator(modified);
      if (result != null) {
        return result;
      }
    }

    throw new RuntimeException("Cannot fix program");
  }

  private Integer getAccumulator(String[] instructions) {
    int[] executed = new int[instructions.length];

    int i = 0;
    int accumulator = 0;

    while (i < instructions.length) {
      if (executed[i] == 1) {
        return null;
      }

      switch (instructions[i].substring(0, 3)) {
        case "nop":
          executed[i]++;
          i++;
          break;
        case "acc":
          accumulator += Integer.parseInt(instructions[i].substring(4));
          executed[i]++;
          i++;
          break;
        case "jmp":
          executed[i]++;
          i += (Integer.parseInt(instructions[i].substring(4)));
          break;
      }
    }

    return accumulator;
  }

  @Override
  public String getName() {
    return "Day Eight";
  }

}
