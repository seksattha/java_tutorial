//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void contact(){


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
    public static void main(String[] args) {
        contact();
        box();

    }
}