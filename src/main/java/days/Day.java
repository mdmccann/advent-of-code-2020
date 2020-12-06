package days;

import util.InputHelper;

public interface Day {

  static InputHelper getInputHelper(int day) {
    return new InputHelper(day);
  }

  Object partOne();

  Object partTwo();

  String getName();

}
