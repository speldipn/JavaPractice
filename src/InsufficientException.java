/**
 * @author Oh, Joon young
 * @since 2018-01-22
 **/

class BalanceInsufficientException extends Exception {
  public BalanceInsufficientException() {
  }

  public BalanceInsufficientException(String message) {
    super("BalanceInsufficientException " + message);
  }
}

public class InsufficientException {
  public static void main(String[] args) throws BalanceInsufficientException {
    try {
      String data = null;
      int value = Integer.parseInt(data);
    } catch (Exception e) {
      throw new BalanceInsufficientException("test!!");
    }
  }
}
