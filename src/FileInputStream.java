/**
 * @author Oh, Joon young
 * @since 2018-01-22
 **/
public class FileInputStream implements AutoCloseable {
  private String file;

  public FileInputStream(String file) {
    this.file = file;
  }

  public void read() {
    System.out.println(file + "을 읽습니다.");
  }

  @Override
  public void close() throws Exception {
    System.out.println(file + "을 닫습니다.");
  }

  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("file.txt")) {
      fis.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
