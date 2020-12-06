class Student {


    private String name;
    private int age;
    private int ID;
    private String date;

    public Student(String date) {
        this.date = date;
    }

    public String toString(String str) {

        String[] a = date.split(" ");
        char[] dat = a[2].toCharArray();


        if (str.compareTo("MIN")==0)
            return a[0] + "." + a[1] + "." + dat[2] + dat[3];

        if (str.compareTo("MID")==0)
            return a[0] + "." + a[1] + "." + a[2];

        if (str.compareTo("MAX")==0)
            switch (a[1]){
                case "01" :
                    return a[0] + " января " + a[2];
                case "02" :
                    return a[0] + " февраля " + a[2];
                case "03" :
                    return a[0] + " марта " + a[2];
                case "04" :
                    return a[0] + " апреля " + a[2];
                case "05" :
                    return a[0] + " мая " + a[2];
                case "06" :
                    return a[0] + " июня " + a[2];
                case "07" :
                    return a[0] + " июля " + a[2];
                case "08" :
                    return a[0] + " августа " + a[2];
                case "09" :
                    return a[0] + " сентября " + a[2];
                case "10" :
                    return a[0] + " октбяря " + a[2];
                case "11" :
                    return a[0] + " ноября " + a[2];
                case "12" :
                    return a[0] + " декабря " + a[2];
            }

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}