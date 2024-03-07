import java.util.Scanner;
// Venue
public class Car {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// No hardcoding   // Loosely coupled
		Tyre tyre = CreateDependentObjects.CreateTyreObj(sc.next());
		tyre.injectTyre();
		
		// just define an interface or abstract class for creating an
		// object but let the subclasses decide which class to instantiate.
	}
}
