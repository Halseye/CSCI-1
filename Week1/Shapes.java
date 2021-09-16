package Week1;
// How do we use objects outside the defaults that are given to us
// We import them!
import java.awt.Rectangle;

public class Shapes {
    public void rectangle(int length, int width){
        Rectangle r = new Rectangle(0,0,length,width);
        System.out.println(r);
    }
}
