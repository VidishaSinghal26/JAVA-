class MyThread implements Runnable {
    public void run() {

            System.out.println(Thread.currentThread().getName());
    }

}
class MyThread1 implements Runnable {
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }

}
class ScoobyShabby{
    public static void main(String[] args) {
        MyThread ob = new MyThread();
        Thread obj1 = new Thread(ob);
        obj1.setName("Scooby");

        MyThread1 obb = new MyThread1();
        Thread obj2 = new Thread(obb);
        obj2.setName("Shabby");
        obj1.start();
        obj2.start();
    }
}