import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class StableMarriageTest {
// written by Bryan Nguyen
// The assignment is to write a console-based program to solve 
// the Stable Matching Problem using the Gale-Shapley algorithm.  
// You must use a linked list for the preference list of each man and woman.  
// See the posting “Stable Matching.ppt” in the Algorithms folder. 
// The program will operate as follows:
//  1. Ask the user for the name of the input file
//	2. Display the number of men and women, and the lists of men and women
//	3. Display the list of men’s preferences and the list of women’s preferences
//	4. Ask the user to select one of the following:
//		Men Propose
//		Women Propose
//	5. Ask the user for the go-ahead to apply the Gale-Shapley algorithm
//	6. Display the list of marriages. 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> displayOnly = new ArrayList<String>(); // the contents of a text file stored here (just for display only)
		LinkedList<String> JohnPreference = new LinkedList<String>();
		LinkedList<String> RobertPreference = new LinkedList<String>();
		LinkedList<String> BrianPreference = new LinkedList<String>();
		LinkedList<String> StephanPreference = new LinkedList<String>();
		LinkedList<String> GeorgePreference = new LinkedList<String>();
		LinkedList<String> NancyPreference = new LinkedList<String>();
		LinkedList<String> JoycePreference = new LinkedList<String>();
		LinkedList<String> PatriciaPreference = new LinkedList<String>();
		LinkedList<String> AnnePreference = new LinkedList<String>();
		LinkedList<String> SusanPreference = new LinkedList<String>();
		
		System.out.println();
		System.out.println("Men:");
		System.out.println("John");
		System.out.println("Robert");
		System.out.println("Brian");
		System.out.println("Stephan");
		System.out.println("George");
		System.out.println();
		System.out.println("Women:");
		System.out.println("Nancy");
		System.out.println("Joyce");
		System.out.println("Patricia");
		System.out.println("Anne");
		System.out.println("Susan");
		System.out.println();
		System.out.println("Preferences for Men:");
		System.out.println();
		System.out.println("Person\tPref 1\tPref 2\t" + "Pref 3\tPref 4\tPref 5\nJohn\tSusan\t"
				+ "Joyce\tNancy\tPatri\tAnne\nRobert\tNancy\tAnne\t" + "Joyce\tSusan\tPatricia\nBrian\tPatri\tSusan"
				+ "\tJoyce\tAnne\tNancy\nStephen\tJoyce\tAnne\tSusan\t"
				+ "Nancy\tPatricia\nGeorge\tNancy\tJoyce\tPatri\tSusan\tAnne");
		System.out.println();
		System.out.print("Preferences for Women:");
		System.out.println();
		System.out.println();
		System.out.println("Person\tPref 1\tPref 2\tPref 3\tPref 4\t"
				+ "Pref 5\nNancy\tJohn\tBrian\tStephen\tRobert\tGeorge\n"
				+ "Joyce\tGeorge\tJohn\tStephen\tRobert\tBrian\n" + "Patri\tGeorge\tBrian\tRobert\tStephen\tJohn\n"
				+ "Anne\tGeorge\tStephen\tJohn\tBrian\tRobert\n" + "Susan\tBrian\tGeorge\tStephen\tJohn\tRobert");
//		
		System.out.print("Who should propose? Men or Woman: ");
		String proposee = scanner.next();
		
		System.out.println();
		readLine("StableMatching", JohnPreference, 5);
		readLine("StableMatching", RobertPreference, 6);
		readLine("StableMatching", BrianPreference, 7);
		readLine("StableMatching", StephanPreference, 8);
		readLine("StableMatching", GeorgePreference, 9);
		System.out.println( );
		readLine("StableMatching", NancyPreference, 12);
		readLine("StableMatching", JoycePreference, 13);
		readLine("StableMatching", PatriciaPreference, 14);
		readLine("StableMatching", AnnePreference, 15);
		readLine("StableMatching", SusanPreference, 16);
		System.out.println();

//		finding couples
		StableMarriage JohnCouple = new StableMarriage(RobertPreference, JohnPreference);
		LinkedList<String> j = new LinkedList<String>();
		j = JohnCouple.FindCouples(RobertPreference, JohnPreference);
		System.out.println(j);
		j.clear();
		readLine("StableMatching", JohnPreference, 5);
		System.out.println();
		
		StableMarriage RobertCouple = new StableMarriage(JohnPreference, RobertPreference);
		LinkedList<String> r = new LinkedList<String>();
		r = RobertCouple.FindCouples(JohnPreference, RobertPreference);
		System.out.println(r);
		System.out.println();
			
		StableMarriage BrianCouple = new StableMarriage(JohnPreference, BrianPreference);
		LinkedList<String> b = new LinkedList<String>();
		b = BrianCouple.FindCouples(JohnPreference, BrianPreference);
		System.out.println(b);
		System.out.println();
		
		StableMarriage StephanCouple = new StableMarriage(JohnPreference, StephanPreference);
		LinkedList<String> s = new LinkedList<String>();
		s = StephanCouple.FindCouples(JohnPreference, StephanPreference);
		System.out.println(s);
		System.out.println();
		
		StableMarriage GeorgeCouple = new StableMarriage(JohnPreference, GeorgePreference);
		LinkedList<String> g = new LinkedList<String>();
		g = GeorgeCouple.FindCouples(JohnPreference, GeorgePreference);
		System.out.println(g);
		System.out.println();
		
//		finding marriages
		StableMarriage JohnMarriage = new StableMarriage(j, r);
		System.out.print("spouse is of " + j.getFirst() + ": " );
		JohnMarriage.FindMarriages1Other(j,r);
		
		StableMarriage BrianMarriage = new StableMarriage(b, r);
		System.out.print("spouse of " + b.getFirst() + ": " );
		JohnMarriage.FindMarriages1Other(b,r);

		StableMarriage StephanMarriage = new StableMarriage(s, r, AnnePreference);
		System.out.print("spouse of " + s.getFirst() + ": " );
		JohnMarriage.FindMarriages2Other(s,r, AnnePreference);
		
		StableMarriage RobertMarriage = new StableMarriage(r, g, NancyPreference);
		System.out.print("spouse of " + r.getFirst() + ": " );
		RobertMarriage.FindMarriages2Other(r,g, NancyPreference);
	}
	
	public static void AskFileName(String string) throws FileNotFoundException {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("You have 3 tries : ");
		while (i <= 3) {
			String FileName = scanner.next();
			if (FileName != string) {
				System.out.print("Incorrect file name. Try again.");
				i++;
			}
			if (string == FileName) {
				System.out.print("good");;
			}
			if (i == 3) {
				System.out.print("Program terminated");
				System.exit(0);
			}
		}
	}
		
	public static void readFileInput(String string, ArrayList<String> ArrayListName)throws FileNotFoundException{
		Scanner stringFile = new Scanner(new File(string));
		while(stringFile.hasNextLine()){
			String line = stringFile.nextLine();
			Scanner scanner = new Scanner(line);
			while(scanner.hasNextLine()){
				ArrayListName.add(scanner.nextLine());
			}
			scanner.close();
		}
		stringFile.close();
	}
		
	public static void readLine(String string, LinkedList<String> LinkedListName, int lineNumber) throws IOException{
		String index = Files.readAllLines(Paths.get(string)).get(lineNumber);
		for (String name : (index.split("[ :]+"))){
			LinkedListName.add(name);
		}
//		System.out.println(LinkedListName);
	}
	
	public static void printFileInput(ArrayList<String> ArrayListName) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("StableMatching"));
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
	}
}
