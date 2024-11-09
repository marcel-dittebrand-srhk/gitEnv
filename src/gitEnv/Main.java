package gitEnv;

import helloWorldPackage.*;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		String[] listOfPrograms = {"Hello World!"};
		
		System.out.println("Welches Programm soll ausgeführt werden?");
		System.out.println();
		
		for(int i = 0; i < listOfPrograms.length; i++) {
			
			System.out.println("[" + i + "] " + listOfPrograms[i]);
			
		}
		
		System.out.print("[0 - " + (listOfPrograms.length-1) + "] ");
		choice = scanner.nextInt();
		System.out.println();
		
		System.out.println("Ausführung von " + listOfPrograms[choice]);
		System.out.println();
		switch(choice) {
			case 0: HelloWorld.main(null); break;
		}
		
		
		
		

	}

}