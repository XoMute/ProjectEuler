import com.xomute.euler010.Euler010;
import com.xomute.euler011.Euler011;
import com.xomute.euler012.Euler012;

public class Main {

  public static void main(String[] args) {
    long time = System.nanoTime();
    System.out.println(Euler012.firstTriangleNumber(500));
    System.out.println("Time in ms: " + ((System.nanoTime() - time) / 1000000f));
  }
}
