public class Degree {

    private String name;
    private int duration;
    private String[] courses;
    private String lecturer;

    public Degree(String name, int duration, String[] courses, String lecturer) {
        this.name = name;
        this.duration = duration;
        this.courses = courses;
        this.lecturer = lecturer;
    }

    //GETTERS
    public String getName() { return name; }

    public int getDuration() { return duration; }

    public String[] getCourses() { return courses; }

    public String getLecturer() { return lecturer; }

    //SETTERS
    public void setName(String name) { this.name = name; }

    public void setDuration(int duration) { this.duration = duration; }

    public void setCourses(String[] courses) { this.courses = courses; }

    public void setLecturer(String lecturer) { this.lecturer = lecturer; }
}
