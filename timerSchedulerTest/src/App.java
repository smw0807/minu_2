import java.util.TimerTask;
import java.util.Timer;

public class App {
  private Timer timer;
  public App() {
      timer = new Timer();
  }

  public void RunSchedule(String type) {
    TimerTask task = new TimerTask(){
      @Override
      public void run() {
        System.out.println(type + " RUN!!");
      }
    };
    timer.scheduleAtFixedRate(task, 0, 5 * 1000);
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Hello World!!");
    String[] param = args[0].split("_"); 
    String mode = param[0];
    String type = param[1];
    System.out.println(mode + " : " + type);
    App app = new App();
    app.RunSchedule(type);
  }
}
