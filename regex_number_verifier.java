import java.util.regex.*; 
 
  
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
