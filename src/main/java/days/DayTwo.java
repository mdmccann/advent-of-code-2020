package days;

public class DayTwo implements Day {

  @Override
  public Object partOne() {
    return (int) Day.getInputHelper(2).asStringStream().filter(pp -> {
      int indexOfLowerAndUpperSeparator = pp.indexOf('-');
      int indexOfUpperAndCharToAppearSeparator = pp.indexOf(' ');

      int lowerLimit = Integer.parseInt(pp.substring(0, indexOfLowerAndUpperSeparator));
      int upperLimit = Integer.parseInt(pp.substring(indexOfLowerAndUpperSeparator + 1, indexOfUpperAndCharToAppearSeparator));
      char charToAppear = pp.charAt(indexOfUpperAndCharToAppearSeparator + 1);
      String password = pp.substring(indexOfUpperAndCharToAppearSeparator + 3);

      int count = 0;
      for (int i = 0; i < password.length(); i++) {
        if (password.charAt(i) == charToAppear) {
          count++;
        }
      }
      return count >= lowerLimit && count <= upperLimit;
    }).count();
  }

  @Override
  public Object partTwo() {
    return (int) Day.getInputHelper(2).asStringStream().filter(pp -> {
      int indexOfLowerAndUpperSeparator = pp.indexOf('-');
      int indexOfUpperAndCharToAppearSeparator = pp.indexOf(' ');

      int firstIndexOccurrence = Integer.parseInt(pp.substring(0, indexOfLowerAndUpperSeparator));
      int secondIndexOccurrence = Integer.parseInt(pp.substring(indexOfLowerAndUpperSeparator + 1, indexOfUpperAndCharToAppearSeparator));
      char charToAppear = pp.charAt(indexOfUpperAndCharToAppearSeparator + 1);
      String password = pp.substring(indexOfUpperAndCharToAppearSeparator + 3);
      return password.charAt(firstIndexOccurrence) == charToAppear ^ password.charAt(secondIndexOccurrence) == charToAppear;
    }).count();
  }

  @Override
  public String getName() {
    return "Day Two";
  }
}
