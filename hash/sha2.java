import java.security.MessageDigest;
//SHA-2
public class sha2 {
    
    public static String sha256 (String txt) {
        String rs = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // byte[] hash = digest.digest(txt.getBytes("UTF-8"));
            byte[] hash = digest.digest((txt + "_hello").getBytes("UTF-8")); //값에 문자열을 추가하기 (salt )
            StringBuilder hexString = new StringBuilder();
    
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            rs = hexString.toString();
        } catch (Exception e) {
            rs = "변환 실패";
            throw new RuntimeException(e);
        }
        return rs;
    }

    public static void main(String[] args) {
        String sha256_1 = sha256("alsdn1324");
        String sha256_2 = sha256("alsdn1324");
        String sha256_3 = sha256("minwoo");

        System.out.println(sha256_1); 
        System.out.println(sha256_2);
        //입력값이 같아서 변환된 해시값이 똑같음
        System.out.println(sha256_3);
    }
}
