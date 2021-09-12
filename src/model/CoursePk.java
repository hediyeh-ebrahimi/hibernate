package model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

//serializable, hashcode,equals
@Embeddable
public class CoursePk implements Serializable {
    private String title;
    private String tutor;


    public CoursePk() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "CoursePk{" +
                "title='" + title + '\'' +
                ", tutor='" + tutor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursePk coursePk = (CoursePk) o;
        return Objects.equals(title, coursePk.title) &&
                Objects.equals(tutor, coursePk.tutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, tutor);
    }
}
