import java.util.regex.*;  
public class RegexExample1{  
public static void main(String args[]){  
//1st way  
Pattern p = Pattern.compile(".b");//. represents single character  
Matcher m = p.matcher("ab");  
boolean FirstWay = m.matches();  
  
//2nd way  
boolean SecondWay=Pattern.compile(".b").matcher("ab").matches();  
  
//3rd way  
boolean ThirdWay = Pattern.matches(".b", "ab");  
  
System.out.println(b+" "+b2+" "+b3);  
}}  
