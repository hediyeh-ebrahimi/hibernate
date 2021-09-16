package model;

import javax.persistence.*;

@Entity(name = "course")
@Table(name = "course")
public class Course {

//    @Id
//    private CoursePk coursePk;

    @EmbeddedId
    private CoursePk coursePk;

    @Column(name = "description")
    private String description;

    public Course() {
    }

    public Course(CoursePk coursePk, String desc) {
        this.coursePk = coursePk;
        this.description = desc;
    }

    public CoursePk getCoursePk() {
        return coursePk;
    }

    public void setCoursePk(CoursePk coursePk) {
        this.coursePk = coursePk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
