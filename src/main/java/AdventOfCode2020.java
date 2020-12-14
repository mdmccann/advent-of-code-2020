import days.Day;
import days.Day01;
import days.Day02;
import days.Day03;
import days.Day04;
import days.Day05;
import days.Day06;
import days.Day08;
import days.Day09;
import days.Day10;
import days.Day11;
import days.Day12;

import java.util.Arrays;
import java.util.List;

public class AdventOfCode2020 {

  private static final List<Day> COMPLETED_DAYS = Arrays.asList(
      new Day01(),
      new Day02(),
      new Day03(),
      new Day04(),
      new Day05(),
      new Day06(),

      new Day08(),
      new Day09(),
      new Day10(),
      new Day11(),
      new Day12()
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
