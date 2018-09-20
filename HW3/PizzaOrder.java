class PizzaOrder {
    private int numPizza;
    private Pizza pizzas[];

    PizzaOrder(){

    }
    PizzaOrder(PizzaOrder order){
        this.setNumPizzas(order.getNumPizzas());
        this.setPizza1(order.getPizza1());
        this.setPizza2(order.getPizza2());
        this.setPizza3(order.getPizza3());

    }

    public int getNumPizzas() {
        return this.numPizza;
    }

    public void setNumPizzas(int numPizzas) {
        this.numPizza = numPizzas;
        this.pizzas = new Pizza[numPizzas];
    }

    public Pizza getPizza1() {
        return this.pizzas[0];
    }

    public void setPizza1(Pizza pizza1) {
        this.pizzas[0] = pizza1;
    }

    public Pizza getPizza2() {
        return this.pizzas[1];
    }

    public void setPizza2(Pizza pizza2) {
        this.pizzas[1] = pizza2;

    }

    public Pizza getPizza3() {
        return this.pizzas[2];
    }

    public void setPizza3(Pizza pizza3) {
        this.pizzas[2] = pizza3;

    }

    public double calcTotal() {
        double cost = 0;
        for (int i = 0; i < this.numPizza; i++) {
            cost += this.pizzas[i].calcCost();
        }
        return cost;
    }
}