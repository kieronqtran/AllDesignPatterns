package complexpattern.bridge;

/**
 * Created by CoT on 10/17/17.
 */
public abstract class Shape {
    private Drawer drawer;

    public Drawer getDrawer() {
        return drawer;
    }

    public void setDrawer(Drawer drawer) {
        this.drawer = drawer;
    }
}
