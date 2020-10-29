import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex_February_General{
   public static void main(String[] args) {
      String date = "02/12/2019";
       String date1 = "02/31/2019";
      String regex = "^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$";
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
