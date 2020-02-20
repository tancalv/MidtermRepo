/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 02/19
 */
public class ArithmeticBase 
{
 public enum Operations{PLUS, MINUS, TIMES, DIVIDE};
 public double x,y;
   
    void calculate(double x, double y) 
        {
            for (Operations op: Operations.values()){
                if (op.PLUS.equals(Operations.PLUS))
                {
                    double answer = x + y;
                    System.out.println("result: "+ answer);
                    
                }
                else if (op.MINUS.equals(Operations.MINUS))
                {
                    double answer = x - y;
                    System.out.println("result: "+ answer);
                    
                }
                else if (op.TIMES.equals(Operations.TIMES))
                {
                    double answer = x * y;
                    System.out.println("result: "+ answer);
                }
                else if (op.DIVIDE.equals(Operations.DIVIDE)){
                    double answer = x / y;
                    System.out.println("result: "+ answer);
                }
            }
               
        
        }
   
}
