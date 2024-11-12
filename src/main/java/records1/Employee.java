package records1;
//POJO: Plain Old Java Objects : ilkel class icerisinde ana ihtiyaclar vardir.
//bu classimiz mutable bir class
public class Employee {
    private String irstname;
    private String lastname;
    private String email;

    public Employee(String irstname, String lastname, String email) {
        this.irstname = irstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getIrstname() {
        return irstname;
    }

    public void setIrstname(String irstname) {
        this.irstname = irstname;
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

    @Override
    public String toString() {
        return "isim='" + irstname + '\'' +
                ", soyisim='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
