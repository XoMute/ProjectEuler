import com.xomute.euler005.Euler005;
import com.xomute.euler008.Euler008;

public class Main {

  public static void main(String[] args) {
    long time = System.nanoTime();
    System.out.println(Euler005.smallestDivisible());
    System.out.println("Time in ms: " + ((System.nanoTime() - time) / 1000000f));
  }
}
