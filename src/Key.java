import java.util.HashMap;

/**
 * @author Oh, Joon young
 * @since 2018-01-25
 **/
public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key compareKey = (Key)obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        Key key = new Key(1);
        hashMap.put(key, "홍길동");
        String value = hashMap.get(key);
        System.out.println(value);
    }
}
