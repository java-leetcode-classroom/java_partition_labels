import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
  public List<Integer> partitionLabels(String s) {
    List<Integer> result = new ArrayList<>();
    int sLen = s.length();
    // s.charAt(pos) - 'a'  -> pos
    HashMap<Integer, Integer> lastPos = new HashMap<>();
    for (int pos = 0; pos < sLen;pos++) {
      lastPos.put(s.charAt(pos)- 'a', pos);
    }
    int start = 0, end = 0;
    for (int pos = 0; pos < sLen;pos++) {
      end = Math.max(end, lastPos.get(s.charAt(pos)-'a'));
      if (pos == end) {
        result.add(end - start + 1);
        start = end + 1;
      }
    }
    return result;
  }
}
