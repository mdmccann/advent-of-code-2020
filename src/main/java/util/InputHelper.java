package util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputHelper {

  private final int day;

  public InputHelper(int day) {
    this.day = day;
  }

  public String asString() {
    String file = String.format("day%d-input.txt", this.day);
    try {
      Path path = Paths.get(Objects.requireNonNull(getClass().getClassLoader().getResource(file)).toURI());
      return Files.readString(path);
    } catch (Exception e) {
      throw new IllegalArgumentException("Cannot read input");
    }
  }

  public Stream<String> asStringStream() {
    String file = String.format("day%d-input.txt", this.day);
    try {
      Path path = Paths.get(Objects.requireNonNull(getClass().getClassLoader().getResource(file)).toURI());
      return Files.lines(path);
    } catch (Exception e) {
      throw new IllegalArgumentException("Cannot read input");
    }
  }

  public List<Integer> asIntegerList() {
    return asStringStream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
  }

  public List<Long> asLongList() {
    return asStringStream()
        .map(Long::parseLong)
        .collect(Collectors.toList());
  }

  public List<String> asStringList() {
    return asStringStream()
        .collect(Collectors.toList());
  }

  public char[][] asGrid() {
    return asStringStream()
        .map(String::toCharArray)
        .toArray(char[][]::new);
  }

}
