public class FlightService { // pobluc class to hold the flgiht service object variables and methods
    public Stream<CompletableFuture<Quote>> getQuotes() { // created an async function which will take the stream api of the created array
        var sites = List.of("site1", "site2", "site3"); // List allows postional access of the array

        return sites.stream().map(this::getQuote); // take the stream of the array and return a new quote

    }

public CompletableFuture<Quote> getQuote(String site) {
    return CompletableFuture.supplyAsync(() -> {
        System.out.println("Getting a quote from " + site); // method to print out quote from site


    });


}
}
