package easypattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CoT on 10/16/17.
 */
public class UniversityPool {
    private static Map<String, University> pool = new HashMap<String, University>();

    public static University getUniversity(String code){
        if(pool.get(code)==null){
            University university = new University(code);
            pool.put(code, university);

            return university;
        }
        else return pool.get(code);
    }
}
