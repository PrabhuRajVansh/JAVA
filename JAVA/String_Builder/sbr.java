package String_Builder;

import java.util.*;

public class sbr {
    //declaration
    // StringBuilder sb = new StringBuilder("Apna College");
    //  System.out.println(sb);

    //get a char from index
    // StringBuilder sb = new StringBuilder("Tony");
    //  //Set Char
    //  System.out.println(sb.charAt(0));

    //set a char at index
    // StringBuilder sb = new StringBuilder("Tony");
    //  //Get Char
    //  sb.setCharAt(0, 'P');
    //  System.out.println(sb);

    public static void main(String args[]) {
    //     StringBuilder sb = new StringBuilder("tony");
    //     //Insert char
    //     sb.insert(0, 'S');
    //     System.out.println(sb);
    //     //delete char
    //     sb.delete(0, 1);
    //  System.out.println(sb);
    //  //append
    //  sb.append(" Stark");
    //  System.out.println(sb);
    //  System.out.println(sb.length());   //length of string
    
    //reverse a string
    StringBuilder sb = new StringBuilder("HelloWorld");
    
     for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;
 
       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);
 
       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }
 
     System.out.println(sb);

    }
}