import java.util.Scanner;
import java.lang.reflect.Array;import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//@@ Suphakrit Jinaongkan
//@@ N01505215
public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

//	
//		String[] listName = splitNames.split(",");
        System.out.println("Input: ");
        String input = scnr.nextLine();
        String[] namesArray = input.split(",");

//		System.out.println(Arrays.toString(namesArray));
        int choice;

        // ask user for an input for each methods
        do {
            // scanner to input the list of names into the Arrays.

            System.out.println("-----------------------");
            printMenu();
            System.out.println("-----------------------");
            choice = scnr.nextInt();

            switch(choice) {
                case 1:
                    listOrdered(namesArray);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Option 2 output: ");
                    displayFullNames(namesArray);
                    break;
                case 3:
                    displaySingleNames(namesArray);
                    break;
                case 4:
                    displayNameStatistics(input);
                    break;
//            case 5:
//                displayNamesWithEvenLength(names);
//                break;
//            case 6:
//                displayNamesWithOddLength(names);
//                break;
//            case 7:
//                displayNamesNotCapitalized(names);
//                break;
//            case 8:
//                displayMostFrequentName(names);
//                break;
//            case 9:
//                names = readNames(scanner);  // Re-read new names
//                break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalide input");
            }


        } while(choice != 0);

        scnr.close();
    }


    // print the list for the user choice
    public static void printMenu() {

        System.out.println("1: Display List Ordered");
        System.out.println("2: Display Full Names");
        System.out.println("3: Display Single Names");
        System.out.println("4: Display Name Sta�s�cs");
        System.out.println("5: Display Names with Even Length");
        System.out.println("6: Display Names with Odd Length");
        System.out.println("7: Display Names not Capitalized");
        System.out.println("8: Display Most Frequent Name");
        System.out.println("9: Enter new list of Names");
        System.out.println("0: Quit Program\r\n");

    }


    // display names in order lists
    public static void listOrdered(String[] names) {


//		ArrayList<String> listOrder = new ArrayList<String>();
//        // Print the sorted array
//        System.out.println("Option 1 Output: ");
//        for(String element: names) {
//        	listOrder.add(element);
//        }
//        System.out.println(listOrder);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        ArrayList<String> namesOrder = new ArrayList<String>();
        for(String name: names) {
            namesOrder.add(name);
        }


        System.out.println(namesOrder);

    }

    // display full names
    public static void displayFullNames(String[] names) {
        // Split the input names by ", " to get individual names

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        // Create a list to store full names (names with a space)
        ArrayList<String> userName = new ArrayList<String>();

        // Iterate over each name in splitNames
        for (String name : names) {
            // Check if the name contains a space
            if (name.contains(" ")) {
                // Add the name to the userName list if it is a full name
                userName.add(name);

            }

        }
        for(String element: userName) {
            System.out.println(element);
        }
        // Print the list of full names

    }

    // display single names
    public static void displaySingleNames(String[] names) {


        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        ArrayList<String> nameList = new ArrayList<String>();
        for(String name: names) {
            if(!name.contains(" ")) {
                nameList.add(name);
            }
        }
        for(String element: nameList) {
            System.out.println(element);
        }

    }// end of method singleNames

    // Add new list of Names
    public static void displayNameStatistics(String names) {
        String[] namesArray = names.split(",");
        int nameCount = namesArray.length;
        int letterCount = 0;

        String shortestName = "";
        String LongestName = "";
        double deviation = 0;

        char[] charArray = names.toCharArray();
        for(char c: charArray) {
            if(c != ' ' && c != ',')
                letterCount++;
        }
        double avgNameLength = (double) letterCount / nameCount;

        System.out.println(nameCount);
        System.out.println(letterCount);
        System.out.println(avgNameLength);
//		System.out.println(shortestName);
//		System.out.println(LongestName);
//		System.out.println(deviation);
    }

} // end of class
