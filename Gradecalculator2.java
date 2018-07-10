/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator2;
import java.util.*;
/**
 *
 * @author taiwo
 */
public class Gradecalculator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner Input =new Scanner(System.in);
   System.out.println("what is your grade");
   int grade= Input.nextInt();
   System.out.println(grade);
   if (grade>=70 && grade<=100){
    System.out.print("You had an A");
   }else if (grade>=60 && grade <=69){
    System.out.print("You had a B");
   }else if (grade>=50 && grade <=59){
        System.out.print("You had a C");
    }else if (grade>=40 && grade <=49){
        System.out.print("You had a D");
    }else if (grade>=30 && grade <=39){
        System.out.print("You had an E");
    }else if (grade>=0 && grade<=29) {
        System.out.print("You had an F");
    } else 
        System.out.print ("Do an encore") ;
    }
            
}
    
    
   
    

