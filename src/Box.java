public class Box {
    private double w,h,d;
    //Create constructor
    public Box(double w, double h, double d) {
        setW(w);
        this.h = h;
        this.d = d;
    }



    //setter

   public void setW(double w){
        if(w >= 0 ) {
            this.w = w;
        }
        else {
            throw new IllegalArgumentException("ค่าน้อยกว่าศูนย์");
        }
   }

   //getter
    public double getW() {
        return w;
    }

    //method
    public double volume(){
        return w*d*h;
    }

    public double surface() {
        return (2 * w * h) + (2 * w * d) + (2 * d * h );
    }
}
