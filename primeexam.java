package JC.Day73;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
       
        //약수구하기 

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (int i = 1; i < n; i++) {
        //     if(n%i==0){System.out.print(i+",");}
        
        // }
        // System.out.print(n);

        //소인수분해

        int c = sc.nextInt();
        int a = 2;
        while (c!=1) {
            if(c%a==0) {
                if(c/a==1)
                    System.out.println(a);
                else
                    System.out.print(a+"*");
            c/=a;
            }else {a++;}
        }
    }       
}


