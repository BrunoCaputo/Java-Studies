package exercises.classes;

/**
 * How can I access "a" inside main
 */
public class StaticChallenge {

  int a = 3;  //Can't change this line

  public static void main(String[] args) {
    StaticChallenge sc = new StaticChallenge();  //Solution -> Class instance
    System.out.println(sc.a);
  }
}
