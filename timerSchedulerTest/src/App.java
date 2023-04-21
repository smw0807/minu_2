import java.util.TimerTask;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
  private static ScheduledExecutorService scheduler;
  private Timer timer;

  public App() {
      timer = new Timer();
  }


  private static void startScheduler() {
    scheduler = Executors.newSingleThreadScheduledExecutor();
    scheduler.scheduleAtFixedRate(App::Run, 0, 5, TimeUnit.SECONDS);
    System.out.println("Scheduler started");
  }

  private static void stopScheduler() {
    if (scheduler != null) {
      scheduler.shutdown();
      System.out.println("Scheduler stopped");
    }
  }

  public static void Run() {
    System.out.println("Run!!!");
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Hello World!!");
    String mode = args[0];
    System.out.println("MODE : " + mode);
    if ("START".equals(mode)) {
      startScheduler();
    } else if ("STOP".equals(mode)) {
      stopScheduler();
    } else {
      throw new Error("mode check");
    }
  }
}
