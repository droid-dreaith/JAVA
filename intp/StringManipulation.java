import java.util.Scanner;
public class StringManipulation {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Text Analyzer");
System.out.println("\nChoose an Option:[1-5]");
System.out.println("[1]Character Array Analysis");
System.out.println("[2]Phrase Length");
System.out.println("[3]Word Replacement");
System.out.println("[4]Reverse the Sentence");
System.out.println("[5]Character Retrieval");
int option = sc.nextInt();
System.out.println("Your choice: " + option);
switch (option) {
case 1:
// TASK 1 CHARACTER ARRAY ANALYSIS
System.out.println("Enter a word:");
sc.nextLine(); // consume the newline character
String word = sc.nextLine();
char[] text = word.toCharArray();
System.out.println("\nEntered word : " + word);
int vowelCount = 0;
for (char c : text) {
if (isVowel(c)) {
vowelCount++;
}
}
System.out.println("\nTotal vowels: " + vowelCount);
break;
case 2:
// TASK 2 length analysis
System.out.println("Enter a sentence:");
sc.nextLine(); // consume the newline character
String sentence = sc.nextLine();
System.out.println("Length of the sentence: " + sentence.length());
// display
if (sentence.length() <= 10) {
System.out.println("The sentence is short");
} else if (sentence.length() <= 20) {
System.out.println("The sentence is medium");
} else {
System.out.println("The sentence is long");
}

break;
case 3:
// task 3
System.out.println("Enter Sentence :");
sc.nextLine(); // consume the newline character
String sentenceToReplace = sc.nextLine();
String regex = "Approve";
String replacement = "agree";
// Perform word replacement
String modifiedSentence = sentenceToReplace.replaceAll(regex, replacement);
System.out.println("\nModified Sentence:");
System.out.println(modifiedSentence);
break;
case 4:
// TASK 4 REVERSE
System.out.println("Enter a sentence:");
sc.nextLine(); // consume the newline character
String sentenceToReverse = sc.nextLine();
String[] words = sentenceToReverse.split(" ");
String reverseSentence = new StringBuilder(sentenceToReverse).reverse().toString();
System.out.println("Reversed Sentence: ");
System.out.println(reverseSentence);
break;
case 5:
// TASK 5 CHARAT
System.out.println("Enter a word:");
sc.nextLine(); // consume the newline character
String enteredWord = sc.nextLine();
System.out.println("Enter an index:");
int enteredIndex = sc.nextInt();
if (enteredIndex >= 0 && enteredIndex < enteredWord.length()) {
char characterAtIndex = enteredWord.charAt(enteredIndex);
System.out.println("Character at index " + enteredIndex + ": " + characterAtIndex);
} else {
System.out.println("Invalid index. Please enter a valid index within the word length.");
}
break;
default:
System.out.println("Invalid option");
}
sc.close();
}
private static boolean isVowel(char c) {
return "AEIOUaeiou".indexOf(c) != -1;
}
}