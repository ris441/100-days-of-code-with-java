package Input_Output_Day2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input_Scanner {
    public static void main(String[] args) throws IOException {
       
       // There is two ways of input in java 
       //1. Using the Scanner class
       //2. Using the BufferReader class

       //Let's take a example of how to take input using scanner class
       // create object of scanner class

    //    /*
        // * 
        Scanner sc = new Scanner(System.in);
        
        byte byte_input=sc.nextByte();
        short short_input=sc.nextShort();
        int integer_input=sc.nextInt();
        long long_input=sc.nextLong();
        float float_input=sc.nextFloat();
        double double_input=sc.nextDouble();
        // */



    //    String str = sc.nextLine(); using this we are trying to input through current line to next line but here In current Line we don't have any string so you first go to next line then take input
    
    
    // /*
    sc.nextLine();
    String str = sc.nextLine();
    
    
    System.out.println(
        "Byte Input "+ byte_input
        );
        System.out.println("Short Input "+ short_input);
        System.out.println("Integer Input "+ integer_input);
        System.out.println("Long Input "+ long_input);
        System.out.println("Float Input "+ float_input);
        System.out.println("Double Input "+ double_input);
        System.out.println("String nextLine Input "+str);
        sc.close();
        // */
        
        
        
        // There is second way of taking input in java lets take this way also 
        
        
        // InputStreamReader input = new InputStreamReader(System.in);
        // BufferedReader bfr = new BufferedReader(input);
        
        
        // int inttype = Integer.parseInt("bfr.read()");
        // System.out.println("BufferedReader Input int "+ inttype);
        
        
        
        
    }
    
}
