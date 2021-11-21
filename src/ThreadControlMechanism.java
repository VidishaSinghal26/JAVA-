class MyThreadControlMechanism implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                try {
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i);
        }
    }
}
class ThreadControlMechanism
{
    public static void main(String[] args) {
        MyThreadControlMechanism t1 = new MyThreadControlMechanism();
        Thread obj=new Thread(t1);
        obj.start();
    }
}
