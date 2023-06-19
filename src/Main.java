/*
Question : Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
           union between these two arrays and print the number of elements of the union set.
           Union of the two arrays can be defined as the set containing distinct elements from both
           the arrays. If there are repetitions, then only one occurrence of element should be printed
           in the union.
 _________________________________________________________________________________________________________________
 Input1:
5 3
1 2 3 4 5
1 2 3
Output1:
5
Input2:
2 2
1 1
4 4
Output2:
2
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,Secondstart,FirstSizeOfArray,SecondSizeOfArray,count = 0;
        System.out.println("Enter the size of first array :");
        FirstSizeOfArray = input.nextInt();
        System.out.println("Enter the size of second array :");
        SecondSizeOfArray = input.nextInt();
        int[] arrayFirst = new int[FirstSizeOfArray];
        int[] arraySecond = new int[SecondSizeOfArray];
        System.out.println("Enter the element inside first array :");
        for (start = 0; start < arrayFirst.length; start++){
            arrayFirst[start] = input.nextInt();
        }
        System.out.println("Enter the element inside second array :");
        for (start = 0; start < arraySecond.length; start++){
           arraySecond[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
            for (start = 0; start < arrayFirst.length; start++) {
                for (Secondstart = 0; Secondstart < arraySecond.length; Secondstart++) {
                    if (count < 1){
                    if (arrayFirst[start] == arraySecond[Secondstart]) {
                        System.out.println(arrayFirst[start]);
                        count++;
                    }
                }
            }
        }
    }
}
