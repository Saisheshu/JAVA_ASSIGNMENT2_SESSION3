package session3_Assignments;

import java.util.Scanner;

public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
		int Counter = 0;
		System.out.println("Enter any whole Number:");
		Scanner scaner=new Scanner(System.in);
		x=scaner.nextInt();
		if(x>0){
		for(int i=1;i<=x;i++){
			if(x%i==0){
				Counter++;
			}
		}
		if(Counter!=2){
			System.out.println(x+ " is Not a Prime Number!");
		}else {
			System.out.println(x+ " is a Prime Number!");
		}
		}else{
			System.out.println("Oops! '"+x +"' is not a whole Number, try again with a whole Number!");
		}
	}
	
}
