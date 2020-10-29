import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexTime {
   public static void main(String[] args) {
      String date = "01/12/2019";
      String regex = "^(0?[1-9]|1[012])[\/\-](0?[1-9]|[12][0-9]|3[01])[\/\-]\d{4}$";
      //Creating a pattern object
      Pattern pattern = Pattern.compile(regex);
      //Matching the compiled pattern in the String
      Matcher matcher = pattern.matcher(date);
      boolean bool = matcher.matches();
      if(bool) {
         System.out.println("Date is valid");
      } else {
         System.out.println("Date is not valid");
      }
   }
}
