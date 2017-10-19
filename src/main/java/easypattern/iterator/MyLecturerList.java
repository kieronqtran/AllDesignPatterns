package easypattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by CoT on 10/16/17.
 */
public class MyLecturerList implements Iterator {

    private List<Lecturer> lecturers = new ArrayList<Lecturer>();
    private int currentItem = 0;

    public boolean hasNext() {
        if(currentItem>=lecturers.size()){
            currentItem = 0;
            return false;
        }
        else
            return true;
    }

    public Object next() {
        return lecturers.get(currentItem++);
    }

    public void remove() {

    }
}
