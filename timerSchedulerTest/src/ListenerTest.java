public class ListenerTest {
  public ListenerTest(){
    System.out.println("Start Listener");
  }

  public void ExceptionTest() {
    try {
      System.out.println("ExceptionTest...");
    } catch (Exception e){
      System.out.println("ExceptionTest Catch!!");
      e.printStackTrace();
    }
  }
}
