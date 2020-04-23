package moviereviews;

public class MovieCreated extends AbstractEvent {

    private Long id;
    private String title;
    private String grade;
    private String openStatus;

    public MovieCreated(){
        super();
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
