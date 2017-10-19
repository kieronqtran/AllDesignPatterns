package creational.singleton;

/**
 * Created by CoT on 10/16/17.
 */
public class Singleton {

    private static Singleton instance = new Singleton();
    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    //other methods etc
    public void hello(){
        System.out.println("Hello");
    }

}
