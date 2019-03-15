
/**
 * Write a description of class ReadTextFile here.
 * 
 * @author Nathaniel L Fergusson 
 * @version 11.25.16
 */
//imports packages we use
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class ReadTextFile
{
   public static void main(String[] args) throws IOException
   {
       int cBG = 0;
       int cGB = 0;
       int cGG = 0;
       int cBB = 0;
       int count = 0;
       
       File fileName = new File("test1.txt");
       
       Scanner inFile = new Scanner(fileName);
       
       while(inFile.hasNext())
       {
           String token = inFile.next();
           
           //calls whatever we are looking to count
           if(token.equals("BG"))
           {
               //increments count by 1
               count++;
               //incrments varible we are counting by 1
               cBG++;
           }else if(token.equals("GB"))
           {
               count++;
               cGB++;
           }else if(token.equals("GG"))
           {
               count++;
               cGG++;
           }else if(token.equals("BB"))
           {
               count++;
               cBB++;
           }
       }
       
       int tGB = cBG + cGB;
       int sSize = count;
       //prints final output clean
       System.out.println("Sample Size:" + sSize + " " + "lines");
       System.out.println("Two Boys:" + cBB);
       System.out.println("One Boy One Girl:" + tGB);
       System.out.println("Two Girls:" + cGG);
       //closes file so the file does not stay open.
       inFile.close();
   }
}
