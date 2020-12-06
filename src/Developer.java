import java.util.Date;
import java.util.Scanner;

public class Developer {
    private String surname;
    public String Surname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Фамилия разработчика:");

        surname = scanner.nextLine();
        return surname;
    }
    public void Begin() {
        Date Begin = new Date();
        System.out.println("Начало срока: " + Begin);
    }


    public void Finish() {
        Date date = new Date();
        Long time = date.getTime();
        long anotherDate = 30;
        time = time + (60 * 60 * 24 * 1000 * anotherDate); // +  месяц
        date = new Date(time);
        System.out.println("Конец срока: " + date);
    }

}