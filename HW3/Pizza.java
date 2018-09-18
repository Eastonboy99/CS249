class Pizza {
    public enum Size {
        SM, MD, LG
    }

    private double sm_price = 10.00; // Price of small pizza
    private double md_price = 12.00; // price of medium pizza
    private double lg_price = 14.00; // price of large pizza
    private double top_price = 2.00; // price of toppings

    Size size;
    private int cheese_top, pepp_top, ham_top;

    Pizza(Size size, int cheese_top, int pepp_top, int ham_top) {
        this.cheese_top = cheese_top;
        this.pepp_top = pepp_top;
        this.ham_top = ham_top;
        this.size = size;
    }

    private double calcCost() {
        int toppings = this.cheese_top + this.pepp_top + this.ham_top;
        double cost;
        switch (this.size) {
        case SM:
            cost = this.sm_price;
        case MD:
            cost = this.md_price;
        case LG:
            cost = this.lg_price;
        default:
            cost = 0.00;

        }
        cost += (toppings * this.top_price);
        return cost;
    }

    public String getDescription() {
        String size;
        switch (this.size) {
        case SM:
            size = "Small";
        case MD:
            size = "Medium";
        case LG:
            size = "Large";
        default:
            size = "unknown";
        }
        return size + " pizza with " + this.cheese_top + " Cheese Toppings, " + this.pepp_top
                + " Pepperoni toppings, and " + this.ham_top + " Ham toppings. The price comes out to $"
                + this.calcCost();
    }

}
