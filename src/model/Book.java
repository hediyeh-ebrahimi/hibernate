package model;

import org.hibernate.annotations.Index;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Book") // hql
//@Table(name = "Book12")
@Table(name = "Book12",schema = "",catalog = "")
//        uniqueConstraints = {@UniqueConstraint(name = "uniqueKey",columnNames = "id,name")})
//        ,indexes=
//        {
//                @Index(name = "idx_1",columnNames = "id,name")
//        }jpa
//

//@Access(AccessType.FIELD)
//@Access(AccessType.PROPERTY)
public class Book implements Serializable {
    @Id
    @Column(name = "id",columnDefinition = "number",precision = 10 , scale = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "book_seq")
//    @TableGenerator(name = "book_seq",table = "book_id_table")
    @SequenceGenerator(name = "book_seq",sequenceName = "book_seq",allocationSize = 1)
    private Long id;

    @Column(name = "name", columnDefinition = "nvarchar2(50)")
    private String name;

    @Column(name = "author", columnDefinition = "nvarchar2(50)",insertable = true,updatable = true)
    private String author;

//    @Column(name = "author", columnDefinition = "nvarchar2(50)",insertable = false,updatable = false)
//    private String author0;

    @Column(name = "price", columnDefinition = "number(12,2)")
    private Long price;

    @Column(name = "created_at")
    private Date createdAt;

    @Transient
    @Column(name = "desc")
    private String desc;

    public Book() {
    }

    public Book(String name, String author,Long price, Date createdAt, String desc) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.createdAt = createdAt;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
