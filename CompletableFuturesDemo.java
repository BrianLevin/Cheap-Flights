import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFuturesDemo { // public class object which will hold the time methods
    public static void show() { // main method which will show the time

        var service = new FlightService(); // vairable to hold flight service object
        
        var futures = service.getQuotes()// variable which will get the  futrue quotes from the flgiht service method
        .map(future -> future.thenAccept(System.out::println)) // create new array and then pass the values  to print out the new quotes
        .collect(Collectors.toList()); // collects the methods and puts them in a list

    
        CompletableFuture
        .allOf(futures.toArray(new CompletableFuture[0]))
        .thenRun(() -> {
          var end = LocalTime.now();
          var duration = Duration.between(start, end);
          System.out.println("Retrieved all quotes in " + duration.toMillis() + " msec.");
        });


    try { // try is hwere an erro can occur
        Thread.sleep(10_000);
      } catch (InterruptedException e) { // catch is where  to solve the error
        e.printStackTrace();
      }
}

}
