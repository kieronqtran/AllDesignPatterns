package complexpattern.command;

/**
 * Created by CoT on 10/17/17.
 */
public class MoveObjectCommand implements Command {

    private Shape shape;
    private int x, y;
    private int backupX, backupY;

    public MoveObjectCommand(Shape shape, int x, int y) {
        this.shape = shape;
        this.x = x;
        this.y = y;
    }

    public void execute() {
        backupX = shape.getX();
        backupY = shape.getY();

        shape.setX(x);
        shape.setY(y);


    }

    public void undo() {
        shape.setX(backupX);
        shape.setY(backupY);
    }
}
