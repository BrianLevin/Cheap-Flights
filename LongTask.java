public class LongTask { // class object which will hold the load time
    public static void simulate() { // trying to load the tak for 3 seconds
        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {// where the problem occured
          e.printStackTrace();
        }
      }

      public static void simulate(int delay) { // this will display a delay for how long it took to load the websites
        try {
          Thread.sleep(delay);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
}
