package hellob;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Tuna tunaO = new Tuna();
		System.out.println(tunaO.military());
		
		tunaO.setTime(10, 20, 59);
		System.out.println(tunaO.military());
	}
	public static void display(int array[][]) {
		
		for(int row=0;row<array.length; row++) {
			for(int column=0; column<array[row].length;column++) {
				System.out.print(array[row][column]+"  ");
			}
			System.out.println("");
		}
		
	}
	public static double average(int...numbers) {
		int total=0;
		double average;
		for(int x:numbers)
			total+=x;
			
		average=total/numbers.length;
		return average;
	}
}
