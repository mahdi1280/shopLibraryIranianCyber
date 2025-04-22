package ir.iraniancyber.taghcheiraniancyber.dto;

import ir.iraniancyber.taghcheiraniancyber.model.Book;

public class BookDto {

    private String title;
    private String author;
    private String description;
    private int price;
    private int count;
    private String image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static Book convertBookDtoToBook(BookDto bookDto) {
        Book book= new Book();
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setDescription(bookDto.getDescription());
        book.setPrice(bookDto.getPrice());
        book.setCount(bookDto.getCount());
        book.setImage(bookDto.getImage());
        return book;
    }
}
