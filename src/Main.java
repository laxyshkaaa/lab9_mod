import java.util.Scanner;
class Student {
    private String FIO;
    private int DateOfStart;
    private String Adress;
    private long PhoneNumber;
    private int Course;
    private String Facultet;

    Student(String FIO, int DateOfStart, String Adress, long PhoneNumber, int Course, String Facultet) {
        this.FIO = FIO;
        this.Adress = Adress;
        this.Course = Course;
        this.DateOfStart = DateOfStart;
        this.Facultet = Facultet;
        this.PhoneNumber = PhoneNumber;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getDateOfStart() {
        return DateOfStart;
    }

    public String getAdress() {
        return Adress;

    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setCourse(int Course) {
        this.Course = Course;
    }

    public String getFacultet() {
        return Facultet;
    }
}





public class Main {

    public static void main(String[] args) {
        Student c1 = new Student("Павел Иванов", 2010, "Г Пенза", 895302215, 4, "Химия");
        Student c2 = new Student("Иван Иванов", 2011, "ул. Ленина, д. 10", 1234567890, 1, "Информатика");
        Student c3 = new Student("Екатерина Смирнова", 2015, "пр. Победы, д. 20", 987543210, 2, "Инженерия");
        Student[] students = {c1, c2, c3};
        System.out.println("Выводим имена:");
        for (Student n : students){
            System.out.println(n.getFIO());
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Введите факультет:");
        String inputF = input.nextLine();
        System.out.println("Студенты, которые учатся в заданном факультете:");
        for(Student f : students){
            if (inputF == f.getFacultet()){
                System.out.println(f.getFIO());
            }
        }
        System.out.println("Введите год:");
        int year = input.nextInt();
        System.out.println("Студенты поступившие в заданный год:");
        for ( Student y :students){
            if (year == y.getDateOfStart()){
                System.out.println(y.getFIO());
            }

        }





    }
}