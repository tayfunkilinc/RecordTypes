package records2;

public record Student(String firstName, String lastName, String studentNumber) {
//    public void setStudentNumber(String number){
//        this.studentNumber = number; // burda direk degsiklik yapilamaz cun cunku studentNumber finaldir
//    }
    //NOT: Record lar default olarak immutable dir yani degistirileme -- read-only dir
    //fieldlari finaldir ve setter gibi degisiklik yapan methodlar eklenemez
    public void printFirstName(){
        System.out.println("Ogrencinin Adi : " +this.firstName); // sadece okuma yaptigimiz zaman problem degil
    }
}

