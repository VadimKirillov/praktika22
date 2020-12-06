public class Calendar {
    private String time;//основная строка
    private String hours;
    private String minutes;

    public Calendar(String time) {
        this.time = time;
        date();
    }


    public void date(){
        String[] a = time.split(">");
        char[] b = a[0].toCharArray();

        hours = b[1] + String.valueOf(b[2]);

        b = a[1].toCharArray();

        minutes = String.valueOf(b[1]) + b[2];
    }




    @Override
    public String toString() {
        return "Time {" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
