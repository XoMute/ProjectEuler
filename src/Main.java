import com.xomute.euler004.Euler004;
import com.xomute.euler005.Euler005;
import com.xomute.euler006.Euler006;

public class Main {

  public static void main(String[] args) {
    long time = System.nanoTime();
    System.out.println(Euler006.diff());
    System.out.println("Time in ms: " + ((System.nanoTime() - time) / 1000000f));
  }
}
