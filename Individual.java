public class Individual {
    private String forenames;
    private String surname;
    private String emailAddress;
    private String dob;
    private String firstName;
    private String fullName;

    public Individual(String forenames, String surname, String emailAddress, String dob) {
        this.forenames = forenames;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.dob = dob;
        firstName = forenames.split(" ")[0];
        fullName = forenames + " " + surname;
    }

    //GETTERS
    public String getFirstName(){ return firstName; }

    public String getFullName(){ return fullName; }

    public String getForenames() { return forenames; }

    public String getSurname() { return surname; }

    public String getEmailAddress() { return emailAddress; }

    public String getDob() { return dob; }


    //SETTERS
    public void setForenames(String forenames) { this.forenames = forenames; }

    public void setSurname(String surname) { this.surname = surname; }

    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public void setDob(String dob) { this.dob = dob; }

}
