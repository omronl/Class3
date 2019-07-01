import java.util.Scanner;

public class exercises {
	
public static void main(String[] args) {
	
//	for (int i = 0; i < 11; i++) {
//		System.out.print(i);
		
//	}
	
	
	
//	int sum = 0;
//	for (int i = 0; i < 10; i++) {
//		sum+=i;
//		System.out.println("sum ;" + sum);
		
//	}
	
	Scanner sc = new Scanner(System.in);
	  int num;
	
	System.out.println("Enter a positive number:");
	num = sc.nextInt();
	
	System.out.println("Multiplication Table of " + num);
	
	for (int i = 1; i < 10; i++) {
		System.out.println(num +"x" + i +"=" + (num*i));
		
	}
    
    
	
	
	
	
	
	}
	
	
}


