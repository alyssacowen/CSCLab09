/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static void func1(int n){
        int i=1,j=1,k=1;
        int x=0,y=0;

        for ( ; i<=n; i++){
            for (; j<=n;  j=j*2){
                 //System.out.print("A'");
                 x++;
            }//nlogn
        }
         for (;k<=j*j; k++){
            //System.out.print("A'");
            y++;
         }//n^2

         System.out.print(" \n x= "+x +" y= "+y);
    
    }
    //time O(nlogn*n^2) I can't remember if you drop the nlogn or n^2 or keep them
    //space O(1)
    
    public static void func2(int n){
        int k,j,i=n;
        while(i>1){
            j=1;
            while(j<n){
                k=0;
                while(k<n){
                    k=k+2;//n
                   
                }
                j=j*2;//logn
            }
            i=i/2;//logn
        }
       
    }
    //time O(n*logn^2)
   //space O(1)
    
   // also discuss T(n) = 3 T(n/4) + n
    
    /*
     a= 3 
     b= 4 
     f(n) = n 
     c = 1 
    
     logba = log43 = 0.79 
    
     c > 0.79 
    case 3 
    
    0(n)
    */
    
    
    
}
