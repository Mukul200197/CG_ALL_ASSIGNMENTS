import org.junit.runner.JUnitCore;

public class LifeCycle {

  public static void main(String[] args) {
      JUnitCore junit = new JUnitCore();
      junit.run(LifeCycleTest.class);

  }
}