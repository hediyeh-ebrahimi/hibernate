package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Book")
@Table(name = "Book12")
public class Book implements Serializable {
    @Id
    @Column(name = "id",columnDefinition = "number")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "book_seq")
    @SequenceGenerator(name = "book_seq",sequenceName = "book_seq",allocationSize = 1)
    private Long id;

    @Column(name = "name", columnDefinition = "nvarchar2(50)")
    private String name;

    @Column(name = "author", columnDefinition = "nvarchar2(50)")
    private String author;

    @Column(name = "price", columnDefinition = "number(12,2)")
    private Long price;

    @Column(name = "created_at")
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
