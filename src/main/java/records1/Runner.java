package records1;
//


public class Runner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack", "Sparrow", "jack@mail.com");
        System.out.println(employee1); //isim='Jack', soyisim='Sparrow', email='jack@mail.com'}

        //emaili degistirmek istersek
        employee1.setEmail("jeacksparrow@mail.com");
        System.out.println("emaili degisen empmloyee: " +employee1);

        //bazi durumlarda bir kere degerlerini belirledikten sonra degistirilemeyen
        // field lari bir daha degistirilemeyen objelere ihtiyac duyabiliriz
        //String class i buna ornek verilebilir in-mutable(degistirilemez) bir classtir

        System.out.println("------------------------immutable----------------------------------");
        EmployeeImmutable employee2 = new EmployeeImmutable("Harry", "Potter", "harry@mail.com");
        System.out.println(employee2); //EmployeeImmutable{irstname='Harry', lastname='Potter', email='harry@mail,com'}
        //emaili degistirmek istersek
        //employee2.setMail("......"); //HATA degisiklik yapilamaz final oldugu icin ve setter methodu olmadigi icin

        System.out.println("employee2.getIrstname() = " + employee2.getIrstname()); // okunabilir ama degistirilemez

        EmployeeImmutable employee3 = new EmployeeImmutable("Harry", "Potter", "harry@mail.com");

        System.out.println("double equal ile karsilastir : " + (employee2==employee3)); // false // double equals ile false dondu cunku referanslar farkli ise adreslerini kontrol etti - degerler ayni olsada adresler farkli oldugu icin false dondu
        //System.out.println("equals methodu ile karsilardir : " + employee2.equals(employee3));
        // false burdada iki objeyi karsilastirip geri donderiyor ama biz equals methodunu degistirerek istedigimiz karsilastirmayi yapmasini sagladik
        System.out.println("equals methodu ile karsilardir : " + employee2.equals(employee3)); // true

        //boiler plate : basma kalip
        // surekli benzer islemleri yaptigimiz islemleri pratik bir sekilde yapmainin yontemi
        //ornegin immutable class direk olusturulabilirz bunuda Records lar ile yapiyoruz
        //standart kodlari tekrar tekrar tanimlamaini onune gecmek icin recordlar gelistirilmistir.
        //java 14 ile gene Record Type ozelligini kullanalim
        EmployeeRecord employee4 = new EmployeeRecord("Ali", "Can", "can@mail.com");
        System.out.println("Record employee : " + employee4); //Record employee : EmployeeRecord[firstName=Ali, lastName=Can, email=can@mail.com]

        System.out.println("Record employee ismi : " + employee4.firstName()); // getter methodu ile yadik

        //employee4.setEmail(); HATA --> immutable degistirilemez

        EmployeeRecord employee5 = new EmployeeRecord("Ali", "Can", "can@mail.com");
        System.out.println("== :" + (employee4==employee5)); // == :false
        System.out.println("equals :" + (employee4.equals(employee5))); // equals :true
    }
}
