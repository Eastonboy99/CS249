class PizzaOrder {
    private int numPizza;
    private Pizza pizzas[];

    PizzaOrder(){

    }
    PizzaOrder(PizzaOrder order){
        this.setNumPizzas(order.getNumPizzas());
        for (int i = 0; i< this.getNumPizzas(); i++){
            this.setPizza(i, new Pizza(order.getPizza(i)));
        }

    }

    public int getNumPizzas() {
        return this.numPizza;
    }

    public void setNumPizzas(int numPizzas) {
        this.numPizza = numPizzas;
        this.pizzas = new Pizza[numPizzas];
    }

    public Pizza getPizza(int index) {
        return this.pizzas[index];
    }

    public void setPizza(int index, Pizza newPizza){
        this.pizzas[index] = newPizza;
    }

    public double calcTotal() {
        double cost = 0;
        for (int i = 0; i < this.numPizza; i++) {
            cost += this.pizzas[i].calcCost();
        }
        return cost;
    }
}