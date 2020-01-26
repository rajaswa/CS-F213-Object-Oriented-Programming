
/** 
 * @author Rajaswa Patil
 * @version 25 January, 2020
 */

public class Fest
{
    /**
    * Check if Milan can process the given string
    * Milan can perform the task if ( length of the task string is divisible by 2 and the length of the task is divisible by capMilan ).
    * @param s input string
    * @param capMilan integer denoting Milan's capacity   
   	* @return true if Milan can process the string, and false otherwise
   	*/
    public static boolean canMilan(int capMilan, String s)
    {
        if ((s.length()%2==0) && (s.length()%capMilan==0))
        {
        	return true;
        }
        else
        {
        	return false;
        }
    } 

    /**
    * Check if Mayur can process the given string
    * Mayur can perform a task if (capMayur + 5 * length of the task string ) >= 17 .
    * @param s input string
    * @param capMayur integer denoting Mayur's capacity   
   	* @return true if Mayur can process the string, and false otherwise
   	*/
    public static boolean canMayur(int capMayur, String s)
    {
        if (capMayur + 5*s.length() >= 17)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }

    /**
    * Check if Pratik can process the given string
    * Pratik can perform a task if the (factorial of the length of the task string is greater than or equal to 29*capPratik).
    * @param s input string
    * @param capPratik integer denoting Pratik's capacity   
   	* @return true if Pratik can process the string, and false otherwise
   	*/
    public static boolean canPratik(int capPratik, String s)
    {
    	int factorial = 1;
        for (int i=1; i<s.length(); i++)
        {
        	factorial *= i;
        }
        
        if (factorial >= 29*capPratik)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }

    /**
    * Method that returns an integer related to the number of strings that can be processed
    * @param capPratik Pratik's capacity
    * @param capMayur Mayur's capacity  
    * @param capMilan Milan's capacity  
   	* @return the integer obtained after checking whether each string can be processed by atleast one cordi according to the problem statement
   	*/
    public static int cordi(String[] input, int capPratik, int capMayur, int capMilan)
    {
       int counter=0;

       // write logic here 
       for (int i=0; i<input.length; i++)
       {
    	   if (canMilan(capMilan, input[i]) || canMayur(capMayur, input[i]) || canPratik(capPratik, input[i]))
    	   {
    		   counter += 1;
    	   }
    	   else
    	   {
    		   counter -= 1;
    	   }
       }
       
       return counter;
    }
}