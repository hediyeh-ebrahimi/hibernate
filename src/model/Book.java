package model;

import java.sql.Date;

public class Book {
    private Long id;
    private String name;
    private String author;
    private Long price;
    private Date createdAt;

    public Book() {
    }

    public Book(Long id, String name, String author, Long price, Date createdAt) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public Book setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public Book setPrice(Long price) {
        this.price = price;
        return this;
    }


    public Date getCreatedAt() {
        return createdAt;
    }

    public Book setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", createdAt=" + createdAt +
                '}';
    }
}
