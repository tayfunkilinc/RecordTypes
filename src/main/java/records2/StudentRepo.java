package records2;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    List<Student> students = new ArrayList<>();

    //ogrencileri kaydetmek
    public void save(Student student){
        this.students.add(student);
    }

    //tum ogrencileri listeleme
    public void printAllStudends(){
        for (Student std : this.students){
            System.out.println(std); // burda yazdirmak icin toString override edilmeli Record oldugu icin otomatik yapildi direk yazdirabiliyorum
        }
    }

    //mevcut ogrenciyi silme
    public void delete(Student student){
        this.students.remove(student);
    }



}
