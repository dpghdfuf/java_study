package com.study.ch06;

import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*  System.out.println("별 몇개? ");
        int starCount = scanner.nextInt();

        for(int i = 0; i < starCount; i++) {
            for(int j = 0; j < i + 1; j++) {              // 여기서 +1을 하지 않으면 코드가 돌아가지 않는다
                System.out.print("*");
            }
            System.out.println();
        }
    */
        System.out.println("몇 줄?");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {                        // 여기서는 +1을 안해도 되네? // 몇 줄? n = 3
            for(int j = 0; j < n - i - 1; j++) {      // 빈 칸 몇 개? 2 1 0
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {     // 별 몇 개? 1 2 3
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

/*
*
**
***
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

int starCount = scanner.nextInt();

for(int k = 0; k< starCount; k++) {
   for(int l = 0; l < starCount-k; l++) {
       System.out.print("*");
   }                 // 같은 지역 안의 지역이라 i 중복 사용 못한다.
                    // System.out.println();
}



***
**
*

#include<stdio.h>
int main()
{
    int N,i,k;
    scanf("%d", &N);
    for(i=1; i<=N; i++)
    {
        for(k=1; k<=N+1-i; k++)
        {
            printf("*");
        }
        printf("\n");
    }
}

for(int i = 0; i< starCount; i++) {
  for(int j = 0; j < starCount - i; j++) {
      system.out.print("*");
  }                    // 같은 지역 안의 지역이라 i 중복 사용 못한다.

  System.out.rpintln();
}


  *
 **
***

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i<= N; i++) {
            for(int j=N-1; j>=i; j-- ) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

for(int i =0; i<starCount; i++) {
    for(int j=0; j<starCount -1 -i; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j<i +1; j++) {}
}


***
 **
  *

        #include<stdio.h>
int main()
{
    int N,i,k,l,space;
    scanf("%d", &N);
    for(i=1; i<=N; i++)
    {
        if(i>1)
        {
            for(l=1; l<i; l++)
            {
                printf(" ");
            }
        }
        for(k=1; k<=N+1-i; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}

for(int i = 0; i < starCount; i++) {
    for(int j=0; j<i; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < starCount - i; j++) {
        System.out.print("*");                  // 만복문은 개수라고 생각하면 쉬워진다. 반복의 횟수라고도 생각
    }
    System.out.println();
}
system.out.println();



  *
 ***
*****

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i<=N; i++) {
            for(int j = N-1; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k =1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

for(int i = 0; i<starCount; i++) {
    for(int j =0; j<starCount -1 -i; j++) {
        System.out.print(" ");
    }
    for(int j =0; j<(i+1) * 2 -1; j++) {
        System.out.print("*");
    }
    System.out.println();                 // 횟수라고 생각하는게 중요하다
}



    }
}
*/
