import java.util.Scanner;

public class main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату:");
        Date date = new Date(scanner.nextLine());

        System.out.println("Введите время:");
        Calendar calendar = new Calendar(scanner.nextLine());


        System.out.println(calendar.toString());
        System.out.println(date.toString());
    }
}