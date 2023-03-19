package org.example.HomeWork.HW6;
import java.util.HashSet;
public  class Catalog {
     public static HashSet listCatalog() {
         Laptop model1 = new Laptop("Acer-65", 39000, 8, 500, "Жесткий диск", 15, "Серый", "windows 10");
         Laptop model2 = new Laptop("Asus m406", 54000, 32, 1000, "Жесткий диск", 13, "Фиолетовый", "windows 11");
         Laptop model3 = new Laptop("Lenovo-90u", 38000, 8, 500, "SSD", 16, "Черный", "Windows 10");
         Laptop model4 = new Laptop("Apple MacBook A2681", 150000, 32, 500, "SSD", 13, "Серый", "MacOS");
         Laptop model5 = new Laptop("Asus k879", 48000, 16, 500, "Жесткий диск", 11, "Красный", "windows 10");
         Laptop model6 = new Laptop("Asus j508", 98000, 64, 1200, "SSD", 15, "Серый", "windows11");
         HashSet<Laptop> listLaptop = new HashSet<>();
         listLaptop.add(model1);
         listLaptop.add(model2);
         listLaptop.add(model3);
         listLaptop.add(model4);
         listLaptop.add(model5);
         listLaptop.add(model6);
         return (HashSet) listLaptop;

     }
}