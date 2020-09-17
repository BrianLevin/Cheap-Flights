public class Quote {
    private final String site; // only this class has access to producing the site and wony change value
    private final int price; // only this class has access to producing the site and wont chage value

    public Quote(String site, int price) { // made a constructor so I can utilze the site and price as methods.
        this.site = site;
        this.price = price;
      }

}