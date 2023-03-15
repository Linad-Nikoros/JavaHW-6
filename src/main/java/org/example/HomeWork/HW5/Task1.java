//1) Подсчитать количество вхождения каждого слова
//Россия идет вперед всей планеты. Планета — это не Россия.
package org.example.HomeWork.HW5;
import java.util.HashMap;
public class Task1 {

    public static void main(String[] args) {
        String string = "Россия идет вперед всей планеты. Планета — это не Россия.".replaceAll("[.,—]","");
        String[] words = string.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!wordCount.containsKey(word))
            {
                wordCount.put(word, 0);
            }
            wordCount.put(word, wordCount.get(word) + 1);
        }
        for (String word : wordCount.keySet())
        {
            System.out.println( "Слово " + word + " встречается: " + wordCount.get(word) + "раз");
        }
    }
}
