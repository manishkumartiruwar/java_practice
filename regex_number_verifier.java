 /*Write a Java program to read all mobile numbers present in given file and validate
it on below criteria:
-The first digit should contain number between 7 to 9.
-The rest 9 digit can contain any number between 0 to 9.
-The mobile number can have 11 digits also by including 0 at the starting.
-The mobile number can be of 12 digits also by including 91 at the starting The
number which satisfies the above criteria is a valid mobile Number.
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 
  
public class regex_number_verifier{ 
      
 
public static void main(String[] args) 
{ String s = "95453331151"; 
Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{10}"); 


Matcher m = p.matcher(s); 
    
      
    if (m.find() && m.group().equals(s))  
        System.out.println("Valid Number");      
    else
        System.out.println("Invalid Number");      
} 
}
