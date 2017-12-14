/*
 * 1. Write a program to print factorial of N ( without using any loop)
 */

package question1;
import java.util.*;
public class Factorial {
	static int factorial(int x) {
		if(x==1||x==0)
			return 1;
		else
			return(x*factorial(x-1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(factorial(x));
		sc.close();
	}

}
