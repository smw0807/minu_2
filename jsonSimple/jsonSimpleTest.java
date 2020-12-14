package jsonSimple;

import java.util.HashMap;

import org.json.simple.JSONObject;
//VSCode에서 json_simple-1.1.jar 라이브러리 적용되는지 테스트
public class jsonSimpleTest {

    public static JSONObject jsontest () {
        JSONObject obj = new JSONObject();
        obj.put("a", "aaaaaaaaaaaa");
        obj.put("b", "bbbbbbbbbbb");
        obj.put("c", "cccccccccccc");
        obj.put("d", "dddddddddddddd");
        return obj;
    }

    public static void main(String[] args) {
        System.out.println("JSONObject test!!!!!!");
        HashMap<String, Object> map = new HashMap();
        map = jsontest();
        System.out.println(map);
        JSONObject obj = new JSONObject();
        for (String key : map.keySet()) {
            if ("a".equals(key)) {
                obj.put("aa", map.get(key));
            } else {
                obj.put(key, map.get(key));
            }
        }
        System.out.println("한글 깨짐?");
        System.out.println("---------");
        System.out.println(obj);
        
    }
}