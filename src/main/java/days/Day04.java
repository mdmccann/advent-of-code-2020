package days;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class Day04 implements Day {

  private static final Set<String> REQUIRED_FIELDS = Set.of("ecl", "pid", "eyr", "hcl", "byr", "iyr", "hgt");
  private static final Map<String, Predicate<String>> RULES = Map.of(
      "byr", val -> val.matches("^(19[2-9][0-9]|200[0-2])$"),
      "iyr", val -> val.matches("^(201[0-9]|2020)$"),
      "eyr", val -> val.matches("^(202[0-9]|2030)$"),
      "hgt", val -> val.matches("^((1[5-8][0-9]|19[0-3])cm|(59|6[0-9]|7[0-6])in)$"),
      "hcl", val -> val.matches("^#([0-9a-f]{6})$"),
      "pid", val -> val.matches("^[0-9]{9}$"),
      "ecl", val -> val.matches("^(amb|blu|brn|gry|grn|hzl|oth)$")
  );

  @Override
  public Object partOne() {
    int validPassports = 0;
    int count = REQUIRED_FIELDS.size();

    for (String pp : Day.getInputHelper(4).asStringList()) {
      if (pp.trim().equals("")) {
        if (count == 0) {
          validPassports++;
        }
        count = REQUIRED_FIELDS.size();
      } else {
        for (String keyValue : pp.split("\\s+")) {
          String[] keyValueArr = keyValue.split(":");
          if (REQUIRED_FIELDS.contains(keyValueArr[0])) {
            count--;
          }
        }
      }
    }
    if (count == 0) {
      validPassports++;
    }
    return validPassports;
  }

  @Override
  public Object partTwo() {
    int validPassports = 0;
    int count = REQUIRED_FIELDS.size();

    for (String pp : Day.getInputHelper(4).asStringList()) {
      if (pp.trim().equals("")) {
        if (count == 0) {
          validPassports++;
        }
        count = REQUIRED_FIELDS.size();
      } else {
        for (String keyValue : pp.split("\\s+")) {
          String[] keyValueArr = keyValue.split(":");
          if (REQUIRED_FIELDS.contains(keyValueArr[0]) && RULES.get(keyValueArr[0]).test(keyValueArr[1])) {
            count--;
          }
        }
      }
    }
    if (count == 0) {
      validPassports++;
    }
    return validPassports;
  }

  @Override
  public String getName() {
    return "Day Four";
  }
}
