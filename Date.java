import java.util.Scanner;
public class Date
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
     System.out.print("Enter day, month and year(in format dd/mm/yy)\t:");
     String date = scan.nextLine();
     
     date = date.replace("/",".");
        
     System.out.println(date);
    }
}