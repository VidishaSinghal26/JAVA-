public class Shape {
    public void draw(){
        System.out.println("Draw Shape");
    }
    public void erase(){
        System.out.println("Erase Shape");
    }
    public static void main(String[] args) {
        Shape sh = new Shape();
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        sh.draw();
        sh.erase();
        c.draw();
        c.erase();
        t.erase();
        t.draw();
        s.draw();
        s.erase();
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Traingle");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Square");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Square");
    }
}
