package ua.com.foxminded.stringmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringUtil {

	public static void main(String[] args) {
 
		System.out.println("Input phrase");

		Scanner sourceone = new Scanner(System.in);
		String vyvod = sourceone.nextLine();

		String[] words = vyvod.split(" "); 
 
		List<String> words1 = new ArrayList<>();
		// List<Collection> words1 =new ArrayList<>()
		System.out.println("number of words" + " " + "-" + " " + words.length);

		for (int i = 0; i < words.length; i++) {

			System.out.print(words[i] + " " + "-" + " ");

			char[] letters = words[i].toCharArray();
			System.out.println(letters.length + " " + ";");
  dg
		}

		// System.out.println("Collection the words");

	}

}
