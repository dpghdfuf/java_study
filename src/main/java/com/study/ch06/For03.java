package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별 몇개? ");
        int starCount = scanner.nextInt();

        for(int i = 0; i < starCount; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}


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




    }
}

