class PizzaOrder {
    private int numPizza; // number of pizzas
    private Pizza pizzas[]; // the pizzas

    PizzaOrder() {}

    PizzaOrder(PizzaOrder order) {
        this.setNumPizzas(order.getNumPizzas());
        switch (this.getNumPizzas()) {
        case 3:
            this.setPizza3(new Pizza(order.getPizza3()));

        case 2:
            this.setPizza2(new Pizza(order.getPizza2()));
        case 1:
            this.setPizza1(new Pizza(order.getPizza1()));
            break;
        default:

        }

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