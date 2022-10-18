package com.example.mybeans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {
    @Min(0)
    public int id;

    @NotNull
    @Size(min=5, max=100)
    public String title;

    @NotNull
    public String author;

    @Max(3)
    public int price;
    
    public int quantity;

    public Book(@Min(0) int id, @NotNull @Size(min = 5, max = 100) String title, @NotNull String author,
            @Max(3) int price, int quantity) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", quantity="
                + quantity + "]";
    }
}
