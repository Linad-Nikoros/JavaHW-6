//2) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет
// являться ключом)
package org.example.HomeWork.HW5;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
public class Task2 {
    public static String inputWord() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите искомое слово: ");
        String searchWord = in.next().toLowerCase();
        return searchWord;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("text.txt")).useDelimiter("\\*");
        String str;
        String text= "";
        while (scanner.hasNextLine()) {
            str = scanner.next();
            text = text + str;
        }
        text = text.toString().replaceAll("[.,—?!;:]","");
        String[] words = text.toLowerCase().split(" ");
        String searchWord = inputWord();
        HashMap<String,Integer> wordCount = new HashMap<>();
        wordCount.put(searchWord, 0);

        for (String word : words) {
            if (searchWord.equals(word) ) {
            wordCount.put(searchWord, wordCount.get(searchWord) + 1);
            }
        }
            System.out.println( "Слово " +  searchWord +  " встречается " + wordCount.get(searchWord) + " раз");
    }
}




