class V5_Project_15_page_424 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(Pizza.Size.LG, 1, 0, 1); // Code to create a large pizza, 1 cheese, 1 ham 
        Pizza pizza2 = new Pizza(Pizza.Size.MD, 2, 2, 0);// Code to create a medium pizza, 2 cheese, 2 pepperoni 
        Pizza pizza3 = new Pizza(Pizza.Size.SM, 2, 2, 5);// Code to create a small pizza, 2 cheese, 2 pepperoni, 5 ham
        Pizza pizza4 = new Pizza(Pizza.Size.LG, 2, 8, 0);// Code to create a Large pizza, 2 cheese, 8 pepperoni 
        PizzaOrder order = new PizzaOrder(); // Code to create an order 
        order.setNumPizzas(4); // 2 pizzas in the order 
        order.setPizza(0, pizza1); // Set first pizza 18
        order.setPizza(1, pizza2); // Set first pizza 20
        order.setPizza(2, pizza3); // Set first pizza 28
        order.setPizza(3, pizza4); // Set first pizza 34
        double total = order.calcTotal(); // Should be 18 + 20 + 28 + 34 = 100
        System.out.println(total);
    }
}