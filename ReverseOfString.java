import java.util.*;
public class ReverseOfString {
    public static void printReverse(String rWord){
        System.out.print("Reverse of string: " + rWord);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        String rWord = "";
        for(int i = word.length()-1; i >=0; i--){
            rWord += word.charAt(i);
        }
        printReverse(rWord);
    }
}