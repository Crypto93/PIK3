package lqlqlq;

import java.awt.SystemColor;
import java.util.Random;
import java.util.Scanner;

public class homeworkAnotherSolution2 {
        
        public static int a,b,c=0;
        static Random rand ;
        
        static int x , y ;
        public static void main(String[] args) {
                
                Scanner input = new Scanner (System.in);
                rand = new Random(System.currentTimeMillis());
                //Input equation parameters
                System.out.println("Enter A: ");
                a=input.nextInt();
                System.out.println("Enter B: ");
                b=input.nextInt();
                System.out.println("Enter C: ");
                c=input.nextInt();
                
                //invoke call to the function with the lower boundary of [-1000:1000] interval
                //solutionFinder(-1000);
                solutionFinder();
                input.close();

        }
        
        public static void solutionFinder(){
        	
        	
        	do{
        	x=rand.nextInt(1000);
        	y=rand.nextInt(1000);
        
       
        	}while(!(a*x+b*y==(-c)));
        	
        		System.out.println("reshenie : x " +x +" y:" +y);
        }
        /*
        public static void solutionFinder(int x){
                //check if current value of x is lower than 1000, if it's not cancel the method's execution
                if(x==1000){
                        return;
                }
                for (int y=-1000; y<=1000; y++){
                        //check if current x / y combination is solution of the equation and cancel the method's execution
                        if (a*x+b*y+c==0){
                                System.out.printf("x= %d y= %d", x,y);
                                System.out.println();
                                return;
                        }
                }
                //invoke new call to the current function with incremented 'x'
                solutionFinder(x+1);
        }
        
        
        */
        
        
        

}
