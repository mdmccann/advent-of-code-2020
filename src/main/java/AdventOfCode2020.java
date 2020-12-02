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

  }

}
