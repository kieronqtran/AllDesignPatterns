package practice.proxy.basic;

import java.util.HashMap;
import java.util.Map;

public class UniversityCache {
  private static final Map<String, University> pool = new HashMap<>();

  public static University getUniversity(String code, String name) {
    if (pool.get(code) != null) {
      return pool.get(code);
    }
    return null;
  }
}
