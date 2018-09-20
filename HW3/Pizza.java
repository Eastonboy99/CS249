import java.text.DecimalFormat;

class Pizza {
    public enum Size {
        SM, MD, LG
    }

    private double sm_price = 10.00; // Price of small pizza
    private double md_price = 12.00; // price of medium pizza
    private double lg_price = 14.00; // price of large pizza
    private double top_price = 2.00; // price of toppings

    private DecimalFormat df2 = new DecimalFormat(".##");

    Size size;
    private int cheese_top, pepp_top, ham_top;

    Pizza(Size size, int cheese_top, int pepp_top, int ham_top) {
        this.setCheeseToppings(cheese_top);
        this.setPepperoniToppings(pepp_top);
        this.setHamToppings(ham_top);
        this.setPizzaSize(size);
    }

    Pizza(Pizza orig_pizza){
        this.setCheeseToppings(orig_pizza.getCheeseToppings());
        this.setPepperoniToppings(orig_pizza.getPepperoniToppings());
        this.setHamToppings(orig_pizza.getHamToppings());
        this.setPizzaSize(orig_pizza.getPizzaSize());
    }

    public int getCheeseToppings(){
        return this.cheese_top;
    }
    public void setCheeseToppings(int cheese_top) {
        this.cheese_top = cheese_top;
    }
    public int getPepperoniToppings(){
        return this.pepp_top;
    }
    public void setPepperoniToppings(int pepp_top) {
        this.pepp_top = pepp_top;
    }
    public int getHamToppings(){
        return this.ham_top;
    }
    public void setHamToppings(int ham_top) {
        this.ham_top = ham_top;
    }
    public Size getPizzaSize(){
        return this.size;
    }
    public void setPizzaSize(Size size) {
        this.size = size;
    }


    

    public double calcCost() {
        int toppings = this.cheese_top + this.pepp_top + this.ham_top;
        double cost;
        switch (this.size) {
        case SM:
            cost = this.sm_price;
            break;
        case MD:
            cost = this.md_price;
            break;
        case LG:
            cost = this.lg_price;
            break;
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
            break;
        case MD:
            size = "Medium";
            break;
        case LG:
            size = "Large";
            break;
        default:
            size = "unknown";
        }
        return size + " pizza with " + this.cheese_top + " Cheese Toppings, " + this.pepp_top
                + " Pepperoni toppings, and " + this.ham_top + " Ham toppings. The price comes out to $"
                + this.calcCost();
    }

}
