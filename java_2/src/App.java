public class App {
    private static Boolean is_run (String type) {
        Boolean result = false;
        if ("go".equals(type)) {
            result = true;
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Boolean run = is_run("no");
        System.out.println(run);
    }
}
