import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void contact(){
        Contact p1 = new Contact("peter", "parker", "091-123-4567");
        System.out.println(p1);

    }
    public static void box(){
        Box aBox = new Box(400,10,6);
        System.out.println(aBox.volume());
        System.out.println("พื้นที่ผิวเท่ากับ = " + aBox.surface());

        if(aBox.getW() > 100) {
            System.out.println("กล่องขนาดใหญ่พิเศษ");
        }
        else {
            System.out.println("กล่องขนาดปกติ");
        }

    }

    public static void demo_localDate() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfWeek());

        LocalDate date220 = LocalDate.ofYearDay(2024, 220);
        System.out.println(date220);

        LocalDate lastday = LocalDate.of(2024, Month.DECEMBER, 31);
        System.out.println(today.until(lastday, ChronoUnit.DAYS));


        // Create date object using .of
        LocalDate startDate = LocalDate.of(2024, Month.DECEMBER, 14);

        //create a period (timeDelta inPython)
        Period threeWeek = Period.ofWeeks(3);
        for(int i = 0; i<3; i++) {
            startDate = startDate.plus(threeWeek);
            System.out.println(startDate);
        }

        //Comparison using method equal , isbefore, isafter instead of using == , !=, <=, >= in python
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2024, Month.AUGUST, 2);

        // Comparison the same day expecting true in result.
        System.out.println(date2.isEqual(date2));

        System.out.println(date1.isEqual(date2));

        if(date1.isAfter(date2)) {
            System.out.println("date 1 ช้ากว่า date2 ");
        }
        else {
            System.out.println("date 1 เร็วกว่า date2 ");
        }




    }

    public static void demo_chainConstructor() {
        Person p1 = new Person("PeTEr", "Parker", "Pete", "M");
        Person p2 = new Person("JoHn", "Doe");
        System.out.println(p1.getFirstName());
        System.out.println(p2.getFirstName());
//        p1.setFirstName("Peter");
//        p1.setLastName("Parker");
//        p1.setNickname("Pete");
//        p1.setGender("m");

    }

    public static void demo_extend_constructor() {
        Patient pa1 = new Patient();
        Patient pa2 = new Patient("John", "Doe", "M", "Pete", 170f, 70f);

    }






    public static void main(String[] args) {
        /*contact();
        System.out.println("-".repeat(20));
        box();
        System.out.println("-".repeat(20));
        demo_localDate();
        System.out.println("-".repeat(20));*/
//        demo_chainConstructor();
        demo_extend_constructor();


    }
}