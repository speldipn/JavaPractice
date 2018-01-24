import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Oh, Joon young
 * @since 2018-01-22
 **/
public class FileInputStreamExample {
  public static void main(String[] args) {
    // 자동으로 close를 호출해준다.
    try(FileInputStream fis = new FileInputStream("file.txt");
        FileOutputStream fos = new FileOutputStream("file2.txt")) {
    } catch (IOException e) {
    }
  }
}