package days;

import java.util.Arrays;
import java.util.OptionalInt;

public class Day13 implements Day {
  @Override
  public Object partOne() {
    String[] input = Day.getInputHelper(13).asString().split("\r\n");

    int earliestDeparture = Integer.parseInt(input[0]);
    int[] busNumbers = Arrays.stream(input[1].split(","))
        .filter(num -> !num.equals("x"))
        .mapToInt(Integer::parseInt).toArray();

    int waitTime = -1;
    int attempts = 0;

    while (waitTime < 0) {
      int newEarliestDepartureTime = earliestDeparture + attempts;

      OptionalInt validBus = Arrays.stream(busNumbers)
          .filter(num -> newEarliestDepartureTime % num == 0).findFirst();

      if (validBus.isPresent()) {
        waitTime = (newEarliestDepartureTime - earliestDeparture) * validBus.getAsInt();
      }

      attempts++;
    }

    return waitTime;
  }

  @Override
  public Object partTwo() {
    return null;
  }

  @Override
  public String getName() {
    return "Thirteen";
  }
}
