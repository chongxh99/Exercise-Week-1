import java.util.Scanner;
public class Number
{  
   public static void main ( String [] args )
   {
      Scanner scan = new Scanner (System.in);
        
        String num = "";
        int j = 0;
        
        System.out.printf("Ener 4 digit number\t:");
        String digit = scan.nextLine();
            
        for(int i = 0 ; i<4 ; i++)
        { 
            
            System.out.println(digit.charAt(i));
            num = String.valueOf(digit.charAt(i));
            j += Integer.parseInt(num);
            
        }  
        System.out.println(j);
    }

} 