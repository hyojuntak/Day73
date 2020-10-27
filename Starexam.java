package JC.Day73;
//for 에 for 문에서는 바깥 for문의 스탭이 변경될때마다 반복 for문이 실행된다. 

//바깥 for문 n줄에 대하여 내부 ㄹor를 설명한다. i가 0일때 반복 for문의 j<0이 되므로 공백이 없다. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //정삼각혁 거꾸로 찍기    
        int n = 9;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j <i; j++) {
    //             System.out.print(" ");

    //         }
    //         for (int k = 1; k < 2*(n-i); k++) {
    //             System.out.print("*");
    //             // System.out.println(i+" "+k);
    //         }
    //         System.out.println();
    //     }
    // //내가 푼거
    //     for (int i = 5; i>=0 ; i=i-2) {
    //         for (int j = 0; j <i; j++) {
    //             System.out.print("*");
    //         }
    //     System.out.println();
    //     if(i==5)System.out.print(" ");
    //     if(i==3)System.out.print("  ");

    //     }

    // //정삼각형 찍기
    //     int e = 10;
    //     for (int i = 0; i < e; i++) {
    //         for (int j = 0; j <i; j++) {
    //             System.out.print(" ");

    //         }
    //         for (int k = 1; k < i+2; k++) {
    //             System.out.print("*");
    //             // System.out.println(i+" "+k);
    //         }
    //         System.out.println();
    //     }

    //내가 푼거
        // for (int i = 1; i < n+1; i=i+2) {
        //     for (int k = i; k < i+2; k++) {
        //         System.out.print(" ");
        //     }
            
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        // System.out.println();
        
        // }
    //마름모
        // Scanner sc = new Scanner(System.in);
        // int a =5;
        // for (int i = a-1; i >=0; i--) {
        //     for (int e = 0; e<(i/2) ;e++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j <a; j++) {
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }

    for (int i = 0; i < n; i++) {
      

        for (int j = 0; j < Math.abs(i-n/2); j++) {
            System.out.print(" ");
        }
        for (int e = 0; e < n-2*Math.abs(i-n/2); e++) {
            System.out.print("*");
            
        }
        System.out.println();
    }


  
        // for (int i = 0 ; i < n ; i++) {
        //     for(int j = n-i ; j > 0 ; j--) {
        //     System.out.print(" ");
        //     } 
        //     for (int k = 0 ; k < (2*i)+1 ; k++) {
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }
             

        //  for(int i=0; i<n;i++){
        //     System.out.print(" ");

        //        for(int j=0; j<i;j++){
        //            System.out.print(" ");
        //        }
        //        System.out.print(" ");
        //      for(int k=1; k<2*(n-i-1);k++){
        //            System.out.print("*");
        //        }
        //        System.out.println();
        //    }
         
       
    }       
}


