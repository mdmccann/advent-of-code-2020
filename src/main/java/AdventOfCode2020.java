import java.util.Set;

public class AdventOfCode2020 {

  public static void main(String[] args) {

    DayOne dayOne = new DayOne();
    System.out.println("* Day One");
    System.out.println("** Part One result: " + dayOne.findProductOfTwoEntriesWhereSumEquals(2020, dayOne.getInput()));
    System.out.println("** Part Two result: " + dayOne.findProductOfThreeEntriesWhereSumEquals(2020, dayOne.getInput()));
    System.out.println();

    DayTwo dayTwo = new DayTwo();
    System.out.println("* Day Two");
    System.out.println("** Part One result: " + dayTwo.getNumberOfValidPasswords(dayTwo.getInput()));
    System.out.println("** Part Two result: " + dayTwo.getNumberOfValidPasswordsForNewPolicy(dayTwo.getInput()));
    System.out.println();

    DayThree dayThree = new DayThree();
    System.out.println("* Day Three");
    System.out.println("** Part One result: " + dayThree.getNumberOfTreesEncountered(dayThree.getInput(), 3, 1, 0, 0));
    System.out.println("** Part Two result: " + dayThree.getNumberOfTreesEncountered(dayThree.getInput(), 1, 1, 0, 0) *
        dayThree.getNumberOfTreesEncountered(dayThree.getInput(), 3, 1, 0, 0) *
        dayThree.getNumberOfTreesEncountered(dayThree.getInput(), 5, 1, 0, 0) *
        dayThree.getNumberOfTreesEncountered(dayThree.getInput(), 7, 1, 0, 0) *
        dayThree.getNumberOfTreesEncountered(dayThree.getInput(), 1, 2, 0, 0));
    System.out.println();

    DayFour dayFour = new DayFour();
    System.out.println("* Day Four");
    System.out.println("** Part One result: " + dayFour.getNumberOfPassportsWithRequiredFields(dayFour.getInput(), Set.of("ecl", "pid", "eyr", "hcl", "byr", "iyr", "hgt")));
    System.out.println("** Part Two result: " + dayFour.getNumberOfValidPassports(dayFour.getInput(), Set.of("ecl", "pid", "eyr", "hcl", "byr", "iyr", "hgt")));
    System.out.println();

    DayFive dayFive = new DayFive();
    System.out.println("* Day Five");
    System.out.println("** Part One result: " + dayFive.getHighestSeatId(dayFive.getInput()));
    System.out.println("** Part Two result: " + dayFive.getMissingSeatId(dayFive.getInput()));
    System.out.println();

  }

}
