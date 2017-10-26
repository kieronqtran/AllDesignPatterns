package practice.facade.basic;

public class President {
  private ITExpert itExpert = new ITExpert();
  private Politic politic = new Politic();

  public President() {
  }

  public void talkAboutPeace() {
    politic.talkAboutPeace();
  }

  public void talkAboutIT() {
    itExpert.talkIt();
  }
}
