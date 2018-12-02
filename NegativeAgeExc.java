import java.util.Scanner;
public class NegativeAgeExc{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter ur age :: ");
int age = s.nextInt();
 try {
  if(age < 18) 
    throw new AgeException("You entered a negative age which is invalid");
   else
   System.out.println("Valid age");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}


