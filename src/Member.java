/**
 * @author Oh, Joon young
 * @since 2018-01-24
 **/
public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member)obj;
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Member member = new Member("speldipn");
        Member member2 = new Member("speldipn");
        Member member3 = new Member("boy");

        if(member.equals(member2)) {
            System.out.println("member와 member2는 동등합니다.");
        } else {
            System.out.println("member와 memeber2는 다릅니다.");
        }

        if(member.equals(member3)) {
            System.out.println("member와 member3는 동등합니다.");
        } else {
            System.out.println("member와 member3는 다릅니다.");
        }
    }
}
