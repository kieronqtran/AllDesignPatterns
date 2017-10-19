package complexpattern.mediator;

/**
 * Created by CoT on 10/16/17.
 */
public class Mediator {

    public static void sendMessage(User user, String msg){
        System.out.println(user.getName() + " send "+ msg);
    }
}
