package test;


import config.OrmConfig;
import model.CountryCode;
import model.CountryCodePk;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

public class CountryCodeTest {

    @Test
    public void insert (){
        Session session = OrmConfig.getSession();
        session.beginTransaction();
        CountryCode countryCode = new CountryCode();
        countryCode.setDescription(" test countryCode");
        countryCode.setLanguage("english");
        countryCode.setCountryCode("123");
        session.save(countryCode);
        session.getTransaction().commit();

    }

    @Test
    public void loadByCountryCode(){
        Session session = OrmConfig.getSession();
        CountryCode countryCode = (CountryCode)
                session.get(CountryCode.class, new CountryCodePk("123", "english"));
        Assert.assertEquals("test countryCode",countryCode.getDescription().trim());
//        Assert.assertEquals("test countryCode0",countryCode.getDescription().trim());
    }

}