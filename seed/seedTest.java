import java.util.Random;

/** 유사 난수
 * 참고 URL
 * https://withseungryu.tistory.com/1
 */
public class seedTest {
    
    public static void main(String[] args) {
        Random rand = new Random();
        // rand.setSeed(5);
        rand.setSeed(System.currentTimeMillis()); 
        for (int i = 0; i < 10; i++) {
            System.out.print(rand.nextInt(10) + " ");
        }
    }
}
