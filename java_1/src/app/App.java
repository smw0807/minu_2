package app;

import java.util.HashMap;

public class App {

    public static HashMap<String, Object> mapTest () {
        HashMap<String, Object> map = new HashMap();
        map.put("test", "test");
        map.put("aaaa", "tttt");
        return map;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        HashMap<String, Object> map = new HashMap();
        map = mapTest();
        System.out.println("한글깨짐?");
        System.out.println(map);
    }
}