package config;

import model.Book;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrmConfig{
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Book.class)
                .buildSessionFactory();
    }

    public static Session getSession()  {
        return sessionFactory.openSession();
    }
}
