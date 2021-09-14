public class ScopeDemo {
    int z;
    public void doStuff()
    {
        int z = 5;
        doStuff2();
        System.out.println(z);
    }
    public void doStuff2()
    {
        z=4;
    }

    public static void main(String[] args) {
        ScopeDemo myScope = new ScopeDemo();
        int z=6;
        System.out.println(z);
        myScope.doStuff();
        System.out.println(z);
        System.out.println(myScope.z);
    }
}
