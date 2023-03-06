package org.example.HomeWork.HW3.Task3;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Items {
    private  String titleBook;

    private String author;

    private Integer price;

    private LocalDate datePublication;

    private Integer pageCount;




}
