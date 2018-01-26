import java.util.Objects;

/**
 * @author Oh, Joon young
 * @since 2018-01-26
 **/
public class ToStringExample {
    public static void main(String[] args) {
        String str1 = "speldipn";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));
        System.out.println(Objects.toString(str2, "이름이 없습니다."));
    }
}
