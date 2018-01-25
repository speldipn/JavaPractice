import java.util.HashMap;

/**
 * @author Oh, Joon young
 * @since 2018-01-25
 **/
public class HashMember {
    public String id;

    public HashMember(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof HashMember) {
            HashMember member = (HashMember)obj;
            if(obj.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public static void main(String[] args) {
        HashMap<HashMember, String> hashMap = new HashMap<HashMember, String>();
        HashMember member = new HashMember("member");
        hashMap.put(member, "오준영");
        String value = hashMap.get(member);
        System.out.println(value);
        System.out.println(value.toString());
    }
}
