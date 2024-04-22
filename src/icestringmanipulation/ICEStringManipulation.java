/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icestringmanipulation;

import java.util.Arrays;
import java.util.List;

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
    
    public static String findMinMax(String sentence)
    {
        return "";
    }
    
}
