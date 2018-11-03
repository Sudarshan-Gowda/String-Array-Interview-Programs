package com.star.sud;
/*@Author Sudarshan Gowda*/
public class StringPrograms {

	public static void program1(String str) {
		System.out.println(" Q: Reverse the given String without using inbuilt function:" + str);
		System.out.print("Ans is: ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");

	}

	public static void program2(String str) {
		System.out.println(" Q: Swap the first & last letter of given String without using inbuilt function:" + str);
		System.out.print("Ans is: ");
		for (int i = 0; i <= str.length() - 1; i++) {
			if (i == 0)
				System.out.print(str.charAt(str.length() - 1));
			else if (i == str.length() - 1)
				System.out.print(str.charAt(0));

			else
				System.out.print(str.charAt(i));
		}

		System.out.println("\n");
	}

	public static void program3(String str) {
		System.out.println(" Q: Print the vovels of given String without using inbuilt function:" + str);
		System.out.print("Ans is: ");
		/* char[] chr = { 'a', 'e', 'i', 'o', 'u' ,'A','E','I','O','U'}; */

		char[] chr = { 'a', 'e', 'i', 'o', 'u' };

		str = str.toLowerCase();

		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = 0; j < chr.length; j++) {

				if (str.charAt(i) == chr[j]) {
					System.out.print(str.charAt(i));

				}

			}

		}

		System.out.println("\n");
	}

	public static void program4(String str) {
		System.out.println(" Q: Reverse the given word without using inbuilt function:" + str);
		System.out.print("Ans is: ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");

	}

	public static void program5(String str) {
		System.out.println(" Q: Reverse the first & last word of given String without using inbuilt function:" + str);
		System.out.print("Ans is: ");

		String strArry[] = str.split(" ");

		for (int i = 0; i < strArry.length; i++) {

			if (i == 0 || i == strArry.length - 1) {
				String ref = strArry[i];
				for (int j = ref.length() - 1; j >= 0; j--) {
					System.out.print(ref.charAt(j));
				}
				System.out.print(" ");
			}

			else
				System.out.print(strArry[i]);
			System.out.print(" ");

		}

		System.out.println("\n");

	}

	public static void program6(String str) {
		System.out.println(" Q: Swap the first & last word of given String without using inbuilt function:" + str);
		System.out.print("Ans is: ");

		String strArry[] = str.split(" ");

		String temp = strArry[0];
		strArry[0] = strArry[strArry.length - 1];
		strArry[strArry.length - 1] = temp;

		for (int i = 0; i < strArry.length; i++) {

			System.out.print(strArry[i] + " ");
		}

		System.out.println("\n");

	}

	public static void program7(String str) {
		System.out.println(
				" Q: Swap & reverse the first & last word of given String without using inbuilt function:" + str);
		System.out.print("Ans is: ");

		String strArry[] = str.split(" ");

		String temp = strArry[0];
		strArry[0] = strArry[strArry.length - 1];
		strArry[strArry.length - 1] = temp;

		for (int i = 0; i < strArry.length; i++) {

			if (i == 0 || i == strArry.length - 1) {
				String ref = strArry[i];
				for (int j = ref.length() - 1; j >= 0; j--) {
					System.out.print(ref.charAt(j));
				}
				System.out.print(" ");
			}

			else
				System.out.print(strArry[i]);
			System.out.print(" ");

		}

		System.out.println("\n");

	}

	public static void program8(String str) {
		System.out
				.println(" Q: Count the size of word present in a given String without using inbuilt function:" + str);
		System.out.print("Ans is: ");

		String[] strArry = str.split(" ");

		for (int i = 0; i < strArry.length; i++) {

			System.out.print(strArry[i] + strArry[i].length() + " ");
		}

		System.out.println("\n");

	}

	public static void program9(String str) {
		System.out.println(
				" Q: Swap the first & last word  and reverse the middle word of given String without using inbuilt function:"
						+ str);
		System.out.print("Ans is: ");

		String strArry[] = str.split(" ");

		int mid = strArry.length / 2;
		String temp = strArry[0];
		strArry[0] = strArry[strArry.length - 1];
		strArry[strArry.length - 1] = temp;

		for (int i = 0; i < strArry.length; i++) {

			if (i == mid) {

				for (int j = strArry[mid].length()-1; j >=0 ; j--) {
					System.out.print(strArry[mid].charAt(j));
				}
				System.out.print(" ");

			} else
				System.out.print(strArry[i] + " ");
		}

		System.out.println("\n");

	}

}
