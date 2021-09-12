package test;


import config.OrmConfig;
import model.Course;
import model.CoursePk;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

public class CourseTest {

    @Test
    public void insertCourse(){
        Session session = OrmConfig.getSession();
        session.beginTransaction();
        CoursePk coursePk = new CoursePk();
        coursePk.setTutor("tutor test");
        coursePk.setTitle("title test");
        Course course = new Course();
        course.setCoursePk(coursePk);
        course.setDescription("test descripton");
        session.save(course);
        session.getTransaction().commit();


    }

}