package Java;
import java.io. * ;
class CustomException extends Exception {
  public CustomException(String str) {
    super(str);
  }
}
public class Throwsexception {
  public static void main(String[] args) throws IOException {
    try {
      //code which can raise custom exception
      throw new CustomException("This is a custom Exception"); //You can inculde your own exception message
    }
    catch(Exception e) {
      //TODO: handle exception
      System.out.println(e);
    }
  }
}