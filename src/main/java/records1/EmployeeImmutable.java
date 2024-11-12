package records1;
/*Bazı durumlarda thread güvenliği(thread-safe), cachede veri tutarlılığı,
test kolaylığı vb sebeplerle immutable(değiştirilemez) classlar tanımlamak isteyebiliriz.*/
//im- Mutable class olusturduk


import java.util.Objects;

public class EmployeeImmutable {   /// bu class i aynen Records ile yapalim
    private final  String irstname;
    private final String lastname;
    private final String email;

    //ilk degerleri verildikten sonra degistirilmesini istemiyorum bunun icin degiskenleri final yapiyorum
    //degiskenleri contructor da degerlendirecegim dedigim icin olustururken deger vermeme ragmen hata ermedi

    public EmployeeImmutable(String irstname, String lastname, String email) {
        this.irstname = irstname;
        this.lastname = lastname;
        this.email = email;
    }
    //final oldugu icin degistirilemesin diye setter methodlarini yazmiyoruz -- sadece okunabilir yaptik -- read only
    public String getIrstname() {
        return irstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
    //burda toString sadece degerleri goruntuleme yaptigi icin buda sadece okunabilire eklenebilir
    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "irstname='" + irstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // ilkten ayni olabilirler objeleri karsilastir
        if (obj==null || this.getClass()!=obj.getClass()) return false;

        EmployeeImmutable emp = (EmployeeImmutable) obj; // karsilastirma icin kendi clasimisdan bir degiskene atatdik

       return Objects.equals(this.irstname, emp.irstname) &&
                Objects.equals(this.lastname, emp.lastname) &&
                Objects.equals(this.email, emp.email);
       //emp2 ile emp3 fieldlari ayni is true donder

    }

    //hascode objeler icin benzersi kodlari uretir -- equals methodu override edilince hashCode da override edilmesi onerilir
    @Override
    public int hashCode() {
        return Objects.hash(irstname,lastname,email);
    }
}
