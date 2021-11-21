class MyThreadPriority implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThreadPriority t = new MyThreadPriority();

        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);

        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
