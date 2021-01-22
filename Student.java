public class Student extends Individual{

    private String degree;

    public Student(String forenames, String surname, String emailAddress, String dob, String degree) {
        super(forenames, surname, emailAddress, dob);
        this.degree = degree;
    }

    public String getDegree() { return degree; }

    public void setDegree(String degree) { this.degree = degree;    }

}
