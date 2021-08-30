package service;

import config.OrmConfig;
import model.Book;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class BookService {

    public Book load(long id){
        // find = fetch from database
        Session session = OrmConfig.getSession();
        return (Book) session.get(Book.class,id);

    }

    public Book findById(long id) {
        // load = that returns object from hibernate that have just id
        Session session = OrmConfig.getSession();
        return (Book) session.load(Book.class,id);
    }

    public List<Book> findAll(){
        Session session = OrmConfig.getSession();
        Query query = session.createQuery("from Book");
        return query.list();
    }


}
