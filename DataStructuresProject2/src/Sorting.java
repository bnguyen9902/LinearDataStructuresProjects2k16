import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Sorting {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Integer> ArrayList = new ArrayList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		int[] array = new int[5001];
		PrintStream PrintStream1 = new PrintStream("doc1.docx");
		PrintStream PrintStream2 = new PrintStream("doc2.docx");
		PrintStream PrintStream3 = new PrintStream("doc3.docx");
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = i + 1;
			PrintStream1.println(array[i]);
		}
		for (int i = array.length - 1; i > 0; i--) {
			int k = 0;
			array[k] = i;
			PrintStream2.println(array[k]);
			k++;
		}
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = (int) (Math.random() * 5000);
			PrintStream3.println(array[i]);
		}
//		readFile("doc1.docx", ArrayList);
		readFile("doc3.docx", ArrayList);
//		readFile("doc2.docx", ArrayList);
		System.out.println(SortingTheArray(ArrayList, a));
		PrintOutValues(a);
	}

	public static void readFile(String documentName, ArrayList<Integer> ArrayList) throws FileNotFoundException {
		Scanner File1 = new Scanner(new File(documentName));
		while (File1.hasNextLine()) {
			String line = File1.nextLine();
			Scanner scanner = new Scanner(line);
			while (scanner.hasNextInt()) {
				ArrayList.add(scanner.nextInt());
			}
			scanner.close();
		}
		File1.close();
		System.out.println(ArrayList);
	}

	public static void Insert(Integer l, ArrayList<Integer> ArrayList) {
		int p;
		for (p = 0; p < ArrayList.size() && ArrayList.get(p).compareTo(l) < 0; p++) {
		}
		ArrayList.add(p, l);
	}

	public static ArrayList<Integer> SortingTheArray(ArrayList<Integer> ArrayList, ArrayList<Integer> d) {
		for (int i = 0; i < ArrayList.size(); i++) {
			Insert(ArrayList.get(i), d);
		}
		return d;
	}

	public static void PrintOutValues(ArrayList<Integer> b) {
		for (int i = 0; i < 30; i++) {
			System.out.print(b.get(i));
			System.out.print(" ");
		}
	}
}
