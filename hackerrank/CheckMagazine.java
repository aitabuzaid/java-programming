package hackerrank;
import java.util.*;
/**
 * sample input:
 * 6 4
 * give me one grand today night
 * give one grand today
 * *****************************
 * Solves the RansomNode hackerrank challenge 
 * using hash tables
 * @author aitabuzaid
 *
 */

public class CheckMagazine {


	static void checkMagazine(String[] magazine, String[] note) {
		HashMap<String,Integer> table = new HashMap<String,Integer>();
		for (int i = 0; i < magazine.length; i++) {
			if(table.containsKey(magazine[i]))
				table.put(magazine[i], table.get(magazine[i])+1);
			else
				table.put(magazine[i], 1);
		}
		for (int i = 0; i < note.length; i++) {
			if (!table.containsKey(note[i]) || (table.get(note[i]) < 1)) {
				System.out.print("No");
				return;
			}
			table.put(note[i],table.get(note[i])-1);
		}
		System.out.print("Yes");
    }
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

