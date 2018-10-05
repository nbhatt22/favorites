import java.util.Scanner;

public class Favorites {

	public static void main(String[] args) 
	{
		Scanner jawn = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = jawn.nextLine();
		System.out.print("Please enter your favorite color: ");
		String favColor = jawn.nextLine();
		System.out.print("Please enter your favorite food: ");
		String favFood = jawn.nextLine();
		System.out.print("Please enter your favorite subject: ");
		String favSubject = jawn.nextLine();
		
		System.out.println("\n\n\n\n" + name + ":");
		System.out.println("\tFavorite Color: " + favColor);
		System.out.println("\tFavorite Food: " + favFood);
		System.out.println("\tFavorite Subject: " + favSubject);
		
	}
	

}
