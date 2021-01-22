// PLEASE NOTE: "List of one or more COURSES that is part of this degree." - I skipped this part because I think it was a mistake as it doesn't make sense in this class

public class Course {
    private String name;
    private int duration;
    private String degree;

    public Course(String name, int duration, String degree) {
        this.name = name;
        this.duration = duration;
        this.degree = degree;
    }

    //GETTERS
    public String getName() { return name; }

    public int getDuration() { return duration; }

    public String getDegree() { return degree; }

    //SETTERS
    public void setName(String name) { this.name = name; }

    public void setDuration(int duration) { this.duration = duration; }

    public void setDegree(String degree) { this.degree = degree; }
}
