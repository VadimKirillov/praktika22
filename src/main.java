import java.util.Scanner;

public class main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дата и формат(MIN,MID,MAX)");
        Student student = new Student(scanner.nextLine());
        System.out.println(student.toString(scanner.nextLine()));
    }
}