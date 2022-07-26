import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void partitionLabelsExample1() {
    assertEquals(List.of(9,7,8), sol.partitionLabels("ababcbacadefegdehijhklij"));
  }
  @Test
  void partitionLabelsExample2() {
    assertEquals(List.of(10), sol.partitionLabels("eccbbbbdec"));
  }
}