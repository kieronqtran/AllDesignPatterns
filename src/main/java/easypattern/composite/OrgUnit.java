package easypattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CoT on 10/16/17.
 */
public class OrgUnit {
    private String name;
    private List<OrgUnit> children =  new ArrayList<OrgUnit>();

    public OrgUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrgUnit> getChildren() {
        return children;
    }

    public void setChildren(List<OrgUnit> children) {
        this.children = children;
    }
}
