import java.util.Scanner;
public class Box {
    double width;
    double height;
    double depth;
    Box(double w,double h,double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    public double volume()
    {
        return width*height*depth;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Box obj = new Box(s.nextDouble(),s.nextDouble(),s.nextDouble());
        double vol = obj.volume();
        System.out.println(vol);

    }
}
