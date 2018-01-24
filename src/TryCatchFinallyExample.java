/**
 * @author Oh, Joon young
 * @since 2018-01-24
 **/
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value = 0;

        try {
            for (int i = 0; i < strArray.length; i++) {
                value = Integer.parseInt(strArray[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없음");
//            e.printStackTrace();
        } finally {
            System.out.println(value);
        }
    }
}
