import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("IndiaGate", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit IndiaGate!!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
