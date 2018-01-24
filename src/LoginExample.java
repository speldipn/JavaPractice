/**
 * @author Oh, Joon young
 * @since 2018-01-24
 **/

class NotExistIDException extends Exception {
    NotExistIDException() { }
    NotExistIDException(String message) {
        super(message);
    }
}

class NotExistPasswordException extends Exception {
    NotExistPasswordException() { }
    NotExistPasswordException(String message) {
        super(message);
    }
}

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void login(String id, String password) throws NotExistIDException, NotExistPasswordException {
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }

        if (!password.equals("12345")) {
            throw new NotExistPasswordException("패스워드가 틀립니다.");
        }
    }
}
