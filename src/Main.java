import com.xomute.euler010.Euler010;

public class Main {

  public static void main(String[] args) {
    long time = System.nanoTime();
    System.out.println(Euler010.sum(2000000));
    System.out.println("Time in ms: " + ((System.nanoTime() - time) / 1000000f));
  }
}
