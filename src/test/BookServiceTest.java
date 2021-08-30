package test;

import model.Book;
import org.junit.Assert;
import org.junit.Test;
import service.BookService;

import java.util.List;

public class BookServiceTest {
    private BookService bookService = new BookService();

    @Test
    public void load() {
    }

    @Test
    public void findById() {
        Book book = this.bookService.findById(1);
        Assert.assertEquals("Incorrect Id",book.getId() == 1,true);
    }

    @Test
    public void findAll() {
        List<Book> all = this.bookService.findAll();
        all.stream().forEach(Book::toString);
        Assert.assertEquals("Incorrect Size",all.size() == 2 ,true);
    }
}