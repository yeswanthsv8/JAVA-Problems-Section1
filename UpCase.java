import java.util.*;
class UpCase
 {
     public static void main(String args[])
     {
        char i;
        for(i='A';i<='Z';i++)
        {
           System.out.println(""+i);
        }
     }
}






/*

e
xplanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression is true.

Here i is initialized to A(65) and incremented by 1 for each iteration, instructions inside the for block are executed unless i becomes greater than Z(90). so value of i will be printed as character like AB C....Z using printf statement and format specifier %c.
*/
