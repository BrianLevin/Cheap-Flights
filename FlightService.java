public class FlightService { // pobluc class to hold the flgiht service object variables and methods
    public Stream<CompletableFuture<Quote>> getQuotes() { // created an async function which will take the stream api of the created array
        var sites = List.of("site1", "site2", "site3"); // List allows postional access of the array

        return sites.stream().map(this::getQuote); // take the stream of the array and return a new quote

    }

public CompletableFuture<Quote> getQuote(String site) {
    return CompletableFuture.supplyAsync(() -> {
        System.out.println("Getting a quote from " + site); // method to print out quote from site

        var random = new Random(); // random method


        LongTask.simulate(1_000 + random.nextInt(2_000)); // a timed  simulated method to get the random Int Price

        var price = 100 + random.nextInt(10); // variable to get the random quote.


 return new Quote(site, price); // return the new quote from the site and price variables
    

        });

     }
}
