/*
백준 10817번
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[3];
        for(int i = 0; i < numArr.length; i++)
        {
            numArr[i] = sc.nextInt();
        }

        Arrays.sort(numArr);
        System.out.println(numArr[1]);

        sc.close();
    }
}

/*public class Main {
    private static int largest, second, smallest, curLargest, curSmallest = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        compareTwo(num1, num2);
        compareTwo(curLargest, num3);
        largest = curLargest;
        smallest = curSmallest;
        if(num2 != num3)
        {
            if(num1 != largest || num1 != smallest)
            {
                second = num1;
            }
            else if(num2 != largest || num2 != smallest)
            {
                second = num2;
            }
            else
            {
                second = num3;
            }
            System.out.println(second);
        }
        else
        {
            second = num2;
            System.out.println(second);
        }
    }

    private static void compareTwo(int compare1, int compare2)
    {
        curLargest = Math.max(compare1, compare2);
        curSmallest = Math.min(compare1, compare2);
    }
}*/
