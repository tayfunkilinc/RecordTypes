package records2;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("Victor", "Hugo", "123456");
        Student student2 = new Student("Lev", "Tolstoy", "123789");

        StudentRepo repo = new StudentRepo();

        //bu ogrencileri kaydedelim
        repo.save(student1);
        repo.save(student2);

        //tum kayitlari listeleyelim
        System.out.println("-------Tum Ogrenciler----------");
        repo.printAllStudends();
        /*-------Tum Ogrenciler----------
        Student[firstName=Victor, lastName=Hugo, studentNumber=123456]
        Student[firstName=Lev, lastName=Tolstoy, studentNumber=123789]*/

        student1.printFirstName();// Ogrencinin Adi : Victor

        //listedeki 1. indexteki ogrencinin numarasini yanlis girilmis simdi bunu nasil duzenleyecegim immutable tanimlamistim nasil degistirecegiz
        //simdi hatali girisi degistirmek istiyoruz nasil yapacagiz

        Student newStudent = new Student(repo.students.get(1).firstName(),
                repo.students.get(1).lastName(),
                "123780"); // bu sekilde uzerine yazma gibi birsey yaptik concat yaptik
        repo.save(newStudent); // yeni ogrenciyi ekledik
        repo.delete(student2); // eski ogrenciyi kaldirdik
        //manipulasyon ile bu seklilde bir degisiklige gidilebilir algoritma mantigi -- String classida concat isleminde bunu yapmis oluyor

        //tum kayitlari listeleyelim
        System.out.println("-------Tum Ogrenciler----------");
        repo.printAllStudends();
        /*-------Tum Ogrenciler----------
        Student[firstName=Victor, lastName=Hugo, studentNumber=123456]
        Student[firstName=Lev, lastName=Tolstoy, studentNumber=123780]*/




    }
}
