package complexpattern.chainofresponsibility;

/**
 * Created by CoT on 10/17/17.
 */
public abstract class Post {

    private Post next;

    public Post getNext() {
        return next;
    }

    public void setNext(Post next) {
        this.next = next;
    }

    public abstract void write();
    public void writeAndPost(){
        if(next!=null)
            this.next.writeAndPost();
        write();
    }
}
