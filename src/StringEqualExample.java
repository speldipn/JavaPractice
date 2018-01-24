/**
 * @author Oh, Joon young
 * @since 2018-01-24
 **/
public class StringEqualExample {
    public static void main(String[] args) {
        String str = new String("Hello");
        String str2 = "Hello";
//        String str2 = new String("Hello");

        // 같은 object
        System.out.println(str.equals(str2));
        // 문자열을 비교
        System.out.println(str == str2);
    }
}
