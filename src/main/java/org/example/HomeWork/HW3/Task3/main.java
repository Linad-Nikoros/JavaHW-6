package org.example.HomeWork.HW3.Task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static boolean CheckPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }

    public static void main(String[] args) {

        Items items0 = new Items("Второй шанс", "Гольм", 1200, LocalDate.of(2010,12,20), 222);

        Items items1 = new Items("Остров желаний", "Гаврилов", 800, LocalDate.of(2008,11,26), 300);

        Items items2 = new Items("Жажда к свободе", "Магомаев", 1000, LocalDate.of(2009,10,20), 156);

        Items items3 = new Items("Акробат", "Кузьмин", 600, LocalDate.of(2010,9,27), 307);

        Items items4 = new Items("Алая роза", "Акунин", 680, LocalDate.of(2011,5,13), 409);

        List<Items> itemsList = new ArrayList<>();

        itemsList.add(items0);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);

        String nameSearch = "А";
        for (int i = 0; i < itemsList.size(); i++) {

            if (itemsList.get(i).getDatePublication().getYear() >= 2010) {

                if (itemsList.get(i).getAuthor().contains(nameSearch)) {

                  if(CheckPrimeNumber(itemsList.get(i).getPageCount())){

                      System.out.printf(itemsList.get(i).getTitleBook()
                      + " ");

                    }

                }

            }

        }

    }

}

