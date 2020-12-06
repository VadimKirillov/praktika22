public class Date {
    private String date;
    private String day, month, year;

    public Date(String date) {
        this.date = date;
        date();
    }

    @Override
    public String toString() {
        return "Date {" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void date(){
        String[] a= date.split(">");
        char[] b = a[0].toCharArray();
        day = String.valueOf(b[1]) + b[2];
        b = a[1].toCharArray();
        month = String.valueOf(b[1]) + b[2];
        b = a[2].toCharArray();
        year = String.valueOf(b[1]) + b[2] + b[3] + b[4];
    }
}