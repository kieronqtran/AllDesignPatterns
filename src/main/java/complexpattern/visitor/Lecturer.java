package complexpattern.visitor;

/**
 * Created by CoT on 10/16/17.
 */
public class Lecturer extends Person {

    public void invite(TeachingVisitor visitor) {
        visitor.accept(this);
    }

    public void teach(){
        System.out.println("Teaching");
    }

    public  void marking(){
        System.out.println("Marking");
    }

    public void invite(MarkingVisitor visitor){
        visitor.accept(this);
    }
}
