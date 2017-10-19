package easypattern.template;

/**
 * Created by CoT on 10/16/17.
 */
public abstract class Admission {
    
   public void verify(){
       verifyTranscript();
       verifyEnglish();
   }

    protected abstract void verifyEnglish();

    protected abstract void verifyTranscript();


}
