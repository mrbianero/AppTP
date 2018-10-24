package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator cal = new Calculator();
    	UpperCase uc = new UpperCase();
    	System.out.println("Enter: sum, sub or uc");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals("uc")) {
        	System.out.println("Enter:");
        	s=sc.nextLine();
        	System.out.println("Your result is "+uc.start(s));
        	return;
        }
        System.out.println("Enter number1:");
        String s_num1 = sc.next();
        System.out.println("Enter number2:");
        String s_num2 = sc.next();
        if(s.equals("sum")) {
        	double a = 5, b = 7.3, c = a+b;
        	System.out.println(c);
        	try {
        		System.out.println("Your result is "+cal.sum(Double.parseDouble(s_num1), Double.parseDouble(s_num2)));
            }catch (NumberFormatException e) {
                System.out.println("Invalid parametrs!");
            }
        }
        else if (s.equals("sub")) {
        	try {
    			System.out.println("Your result is "+cal.sub(Double.parseDouble(s_num1), Double.parseDouble(s_num2)));
        	}catch (NumberFormatException e) {
                System.out.println("Invalid parametrs!");
        	}
        }
        else
        	System.out.println("Bad function!");
    }
}
