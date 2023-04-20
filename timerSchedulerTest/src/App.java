import java.sql.Time;
import java.util.TimerTask;

public class App {
  private Timer timer;

  public App() {
      timer = new Time();
  }

  public void excuteScheduler(TimerTask task, int hour, int minute, int second) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, hour);
    calendar.set(Calendar.MINUTE, minute);
    calendar.set(Calendar.SECOND, second);

    Date scheduledTime = calendar.getTime();

    if (scheduledTime.before(new Date())) {
      scheduledTime = new Date(scheduledTime.getTime() + 24 * 60 * 60 * 1000);
    }

    long delay = scheduledTime.getTime() - new Date().getTime();

    timer.scheduleAtFixedRate(task, delay, 24 * 60 * 60 * 1000);
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    App app = new App();
    app.excuteScheduler(new TimerTask() {
      ListenerTest test = new ListenerTest();

      @Override
      public void run() {
        // TODO Auto-generated method stub
        test.ExceptionTest();
      }
    }, 22, 33, 0);
  }
}
