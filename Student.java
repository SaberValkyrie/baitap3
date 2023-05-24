package mvctwo;

public class Student {
    private String fistname;
    private String lastname;
    private String email;



    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Student(String fistname, String lastname, String email){
        this.fistname = fistname;
        this.lastname = lastname;
        this.email = email;
    }

}
