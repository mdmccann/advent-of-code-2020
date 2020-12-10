import days.Day;
import days.Day09;
import days.DayEight;
import days.DayFive;
import days.DayFour;
import days.DayOne;
import days.DaySix;
import days.DayThree;
import days.DayTwo;

import java.util.Arrays;
import java.util.List;

public class AdventOfCode2020 {

  private static final List<Day> COMPLETED_DAYS = Arrays.asList(
      new DayOne(),
      new DayTwo(),
      new DayThree(),
      new DayFour(),
      new DayFive(),
      new DaySix(),

      new DayEight(),
      new Day09()
  );

  public static void main(String[] args) {

    COMPLETED_DAYS.forEach(day -> {
      System.out.println("* " + day.getName());
      System.out.println("** Part One result: " + day.partOne());
      System.out.println("** Part Two result: " + day.partTwo());
      System.out.println();
    });

  }

}
