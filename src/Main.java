import com.xomute.euler017.Euler017;

public class Main {

  public static void main(String[] args) {
    long time = System.nanoTime();
    System.out.println(Euler017.numberLetterCounts(1000));
    System.out.println("Time in ms: " + ((System.nanoTime() - time) / 1000000f));
  }
}
