package days;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DaySix implements Day {
  @Override
  public Object partOne() {
    List<String> allGroupAnswers = Day.getInputHelper(6).asStringList();
    Iterator<String> individualResponseIterator = allGroupAnswers.iterator();
    int total = 0;

    while (individualResponseIterator.hasNext()) {

      Set<Character> groupQuestionsAnsweredYes = new HashSet<>();
      String line = individualResponseIterator.next();

      while (!line.trim().equals("")) {
        for (char questionAnsweredYes : line.toCharArray()) {
          groupQuestionsAnsweredYes.add(questionAnsweredYes);
        }

        if (!individualResponseIterator.hasNext()) {
          break;
        }

        line = individualResponseIterator.next();
      }
      total += groupQuestionsAnsweredYes.size();
    }

    return total;
  }

  @Override
  public Object partTwo() {
    List<String> allGroupAnswers = Day.getInputHelper(6).asStringList();
    Iterator<String> individualResponseIterator = allGroupAnswers.iterator();
    int total = 0;

    while (individualResponseIterator.hasNext()) {

      Map<Character, Integer> groupAnswerCounter = new HashMap<>();
      String line = individualResponseIterator.next();
      int groupSize = 0;

      while (!line.trim().equals("")) {
        groupSize++;

        for (char questionAnsweredYes : line.toCharArray()) {
          if (groupAnswerCounter.containsKey(questionAnsweredYes)) {
            groupAnswerCounter.put(questionAnsweredYes, groupAnswerCounter.get(questionAnsweredYes) + 1);
          } else {
            groupAnswerCounter.put(questionAnsweredYes, 1);
          }
        }

        if (!individualResponseIterator.hasNext()) {
          break;
        }

        line = individualResponseIterator.next();
      }

      int finalGroupSize = groupSize;
      total += groupAnswerCounter.entrySet().stream()
          .filter(entry -> entry.getValue().equals(finalGroupSize))
          .count();
    }

    return total;
  }

  @Override
  public String getName() {
    return "Day Six";
  }
}
