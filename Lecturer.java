import java.util.Date;

public class Lecturer extends Individual{
    private String[] degrees;


    public Lecturer(String forenames, String surname, String emailAddress, String dob, String[] degrees) {
        super(forenames, surname, emailAddress, dob);
        this.degrees = degrees;
    }

    public String[] getDegrees() {
        return degrees;
    }

    public void setDegrees(String[] degrees) {
        this.degrees = degrees;
    }
}
