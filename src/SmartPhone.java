/**
 * @author Oh, Joon young
 * @since 2018-01-25
 **/
public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Company: " + company + ", OS: " + os;
    }

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("SPELDIPN", "Linux");
        System.out.println(phone);
    }
}
