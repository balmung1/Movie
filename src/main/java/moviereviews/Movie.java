package moviereviews;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Movie_table")
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String grade;
    private String openStatus;

    @PostPersist
    public void onPostPersist(){
        MovieCreated movieCreated = new MovieCreated();
        BeanUtils.copyProperties(this, movieCreated);
        movieCreated.publish();


    }

    @PostUpdate
    public void onPostUpdate(){
        MovieUpdated movieUpdated = new MovieUpdated();
        BeanUtils.copyProperties(this, movieUpdated);
        movieUpdated.publish();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
    }




}
