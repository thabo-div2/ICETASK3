/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icestringmanipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class ICEStringManipulation
{

    //This is the main method
    // --------------------------------------------------------------------- //
    public static void main(String[] args)
    {
       System.out.println(endX("xxre"));
       System.out.println(endX("xxhixx"));
       System.out.println(endX("xhixhix"));
       findMinMax("This is a test string");
       findMinMax("GeeksforGeeks A computer Science portal for Geeks");

    }
    
    // method to move x to the end of the string
    public static String endX(String str) 
    {
        // declare variables emptty string variables
        String results = "";
        String charX = "";
        
        // if the word does not contain a x then just return it as is
        if(!str.contains("x"))
        {
            return str;
        } else {
            // loop through the string 
            for(int i = 0 ; i < str.length();i++) 
            {
                //locate the position of the char x
                if(str.charAt(i)== 'x')
                {
                    // add all the x's to charX
                    charX += str.charAt(i);
                } else {
                    // add all the non x's to results
                    results += str.charAt(i);
                }
            }
            //add charX back to results ICES
            results += charX;
            System.out.println(results);
            
        }
        

        return results;
    }
    
    
    // Function to find the largest and smallest word in a sentence
    public static void findMinMax(String sentence)
    {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(sentence);
        
        String smallestWord= null;
        String largestWord = null;
    
        
        // Iterrate through the words in the string
        while (matcher.find()) 
        {
            String currentWord = matcher.group();
            
            // Check for the smallest
            if(smallestWord == null || currentWord.length() < smallestWord.length()) 
            {
                smallestWord = currentWord;
            }
            
            // Check for the largest
            if (largestWord == null || currentWord.length() > largestWord.length()) 
            {
                largestWord = currentWord;
            }
        }
        
        // Print the output
        System.out.println("Input: " + sentence);
        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }
    
}
