package assignments;

import java.util.Scanner;

public class LargestString {

	public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       String maxName = "";
       
       while(true)
       {
    	   System.out.print("Enter name [end to stop] :");
    	   String name = s.nextLine();
    	   if(name.equals("end"))
    		   break;
    	   
    	   if (name.length() > maxName.length())
    	   {
    		   maxName = name;
    	   }
       }
       
       System.out.println("Largest Name = " + maxName);
	}

}
