package lab8;

public class PersonApp {
    public static void main(String[] args) {
        //create object
        Person person1,person2,person3;
        person1 = new Person("PID001", "Nattapong", "1980");
        person2 = new Sheriff("PID002", "Jiraporn", "1986", "Thungsong");
        person3 = new Police("PID003", "Supapron", "1976", "Nakhonsithammarat");

        person1.introduce();
        person2.introduce();
        person3.introduce();


    }//main
}//class
