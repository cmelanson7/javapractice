/**
 * Created by CMelanson on 2/3/16.
 */
public class Student {

    int roll;
    Address address;

    Student(int rollNo, Address addressDetail){
        roll = rollNo;
        address = addressDetail;
    }

    void printStudentDetails(Address address1){
        System.out.println("Roll: " + roll);
        System.out.println("Street: " + address1.street);
        System.out.println("City: " + address1.city);
        System.out.println("State:  " + address1.state);
        System.out.println("Zip: " + address1.zip);
//        System.out.println("----------------------------");
    }

    void printDetails(Grades grades1){
        System.out.println("Subject: " + grades1.subject);
        System.out.println("Teacher: " + grades1.teacher);
        System.out.println("Grade: " + grades1.grade);
        System.out.println("Days Absent: " + grades1.days_absent);
        System.out.println("----------------------------");
    }

    public static void main(String[] args){
        Address address1;
        Address address2;

        Grades grades1;
        Grades grades2;

        address1 = new Address("1-St", "PN", "Mah", "41");
        address2 = new Address("2-St", "NH", "Portsmouth", "03820");

        grades1 = new Grades("Math", "Mr. Duffey", 89, 10);
        grades2 = new Grades("English", "Mrs. Dargie", 78, 5);

        Student s1 = new Student(1, address1);
        Student s2 = new Student(2, address2);

        s1.printStudentDetails(address1);
        s2.printDetails(grades2);

        s2.printStudentDetails(address2);
        s1.printDetails(grades1);

    }
}


/*
    String subject;
    String teacher;
    int grade;
    int days_absent;
 */