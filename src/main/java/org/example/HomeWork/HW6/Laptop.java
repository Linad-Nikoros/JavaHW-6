package org.example.HomeWork.HW6;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Laptop {

        private String nameModel;
        private Integer price;
        private Integer ramSize;
        private Integer diskSize;
        private String diskType;
        private Integer displaySizeInch;
        private String color;
        private String os;

        public  String toString() {
                return String.format("Название модели: %s \n Цена: %d, Обьем ОЗУ: %d, Обем жесткого накопителя: %d," +
                       "Тип жесткого накопителя: %s , Размер экрана: %s, цвет: %s, OS: %s ", nameModel, price,
                        ramSize, diskSize, diskType,displaySizeInch, color, os );
        }
}