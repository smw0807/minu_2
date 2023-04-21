import java.util.TimerTask;
import java.util.Timer;

public class App {
  private Timer timer;
  public App() {
      timer = new Timer();
  }

  public void RunSchedule() {
    TimerTask task = new TimerTask(){
      @Override
      public void run() {
        System.out.println("RUN!!");
      }
    };
    timer.scheduleAtFixedRate(task, 0, 5 * 1000);
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Hello World!!");
    App app = new App();
    app.RunSchedule();
  }
}
