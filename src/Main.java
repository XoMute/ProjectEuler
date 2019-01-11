import com.xomute.euler010.Euler010;
import com.xomute.euler011.Euler011;

public class Main {

  public static void main(String[] args) {
    long time = System.nanoTime();
    System.out.println(Euler011.greatestProduct());
    System.out.println("Time in ms: " + ((System.nanoTime() - time) / 1000000f));
  }
}
