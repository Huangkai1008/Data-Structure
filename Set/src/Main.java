import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Pride and Prejudice");

        ArrayList<String> word1 = new ArrayList<>();
        FileOperation.readFile("pride-and-prejudice.txt", word1);

        System.out.println("Total words: " + word1.size());

        BSTSet<String> set1 = new BSTSet<>();
        for (String word: word1)
            set1.add(word);

        System.out.println("Total different words: " + set1.getSize());
    }
}
