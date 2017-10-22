package complexpattern;

import complexpattern.bridge.BorderDrawer;
import complexpattern.bridge.Circle;
import complexpattern.bridge.Shape;
import complexpattern.chainofresponsibility.FacebookPost;
import complexpattern.chainofresponsibility.Post;
import complexpattern.chainofresponsibility.ZaloPost;
import complexpattern.command.MoveObjectCommand;
import complexpattern.decorator.Decorator;
import complexpattern.decorator.House;
import complexpattern.decorator.LightDecorator;
import complexpattern.mediator.User;
import complexpattern.observer.Observer;
import complexpattern.observer.Subject;
import complexpattern.state.Fan;
import complexpattern.strategy.Context;
import complexpattern.strategy.FileOrderService;
import complexpattern.visitor.Lecturer;
import complexpattern.visitor.MarkingVisitor;
import complexpattern.visitor.TeachingVisitor;

/**
 * Created by CoT on 10/16/17.
 */
public class Main {
  public static void main(String[] args) {
    // Observer
    Subject subject = new Subject();
    Observer observer1 = new Observer();
    observer1.subscribe(subject);
    Observer observer2 = new Observer();
    observer2.subscribe(subject);
    subject.setState("price changes");

    // Visitor
    Lecturer lecturer = new Lecturer();
    TeachingVisitor teachingVisitor = new TeachingVisitor();
    lecturer.invite(teachingVisitor);
    MarkingVisitor markingVisitor = new MarkingVisitor();
    lecturer.invite(markingVisitor);

    // Decorator
    Decorator house = new LightDecorator(new House());
    house.decorate();

    // Strategy
    Context context = new Context();
    context.setOrderService(new FileOrderService());
    context.getOrderService().saveOrder();

    // Mediator
    User user = new User("Henry");
    user.send("Hello world");

    // State
    Fan fan = new Fan();
    fan.press();
    fan.press();

    // Chain of Responsibility
    Post facebookPost = new FacebookPost();
    Post zaloPost = new ZaloPost();
    facebookPost.setNext(zaloPost);

    facebookPost.writeAndPost();

    // Bridge
    Shape circle = new Circle();
    circle.setDrawer(new BorderDrawer());
    circle.getDrawer().draw();

    // Command
    complexpattern.command.Shape shape = new complexpattern.command.Shape(10, 10);
    MoveObjectCommand command = new MoveObjectCommand(shape, 15, 15);
    command.execute();
    command.undo();

  }
}
