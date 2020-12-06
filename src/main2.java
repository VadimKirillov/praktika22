
public class main2{
    public static void main(String[] args) {
        Developer dev= new Developer();
        String surname = dev.Surname();
        System.out.println("Разработчик " + surname);

        dev.Begin();
        dev.Finish();
    }
}