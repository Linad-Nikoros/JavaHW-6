package org.example.HomeWork.HW3.Task1;
import java.util.List;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Items items1 = new Items( "высший макарон", 120, "1");
        Items items2 = new Items( "макарон", 140, "2");
        Items items3 = new Items( "картофель", 55, "1");
        Items items4 = new Items( "свекла", 45, "3");
        Items items5 = new Items( "высший мясо", 150, "2");
        List<Items> itemsList = new ArrayList<>();

        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items4);
        itemsList.add(items5);

        Integer maxPrice = itemsList.get(0).getPrice() ;
        String stringmaxprice = "";

        for (int i  = 0; i < itemsList.size() ; i++) {

            if (itemsList.get(i).getProduct().contains("высший")) {
               if (itemsList.get(i).getVariety() == "1" || itemsList.get(i).getVariety()  == "2") {

                  if (maxPrice < itemsList.get(i).getPrice()) {

                     maxPrice = itemsList.get(i).getPrice();
                     stringmaxprice = itemsList.get(i).getProduct();
                  }

              }

            }

        }

        System.out.println("Наибольшая цена: " +  maxPrice + " принадлежит товару: " + stringmaxprice);






    }

}
