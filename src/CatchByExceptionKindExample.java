/**
 * @author Oh, Joon young
 * @since 2018-01-22
 **/
public class CatchByExceptionKindExample {
  public static void main(String[] args) {
    try {
      String data1 = args[0];
      String data2 = args[1];
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(value1 + "+" + value2 + "=" + result);
    } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
      System.out.println("실행 매개변수의 수가 부족하거나 형식이 잘못되었습니다.");
    } catch (Exception e) {
      System.out.println("예외 발생!");
    } finally {
      System.out.println("다시 실행하세요");
    }
  }
}
