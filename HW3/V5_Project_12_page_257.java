class V5_Project_12_page_257 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(Pizza.Size.LG, 1, 0, 1); // Code to create a large pizza, 1 cheese, 1 ham 
        Pizza pizza2 = new Pizza(Pizza.Size.MD, 2, 2, 0);// Code to create a medium pizza, 2 cheese, 2 pepperoni 
        PizzaOrder order = new PizzaOrder(); // Code to create an order 
        order.setNumPizzas(2); // 2 pizzas in the order 
        order.setPizza1(pizza1); // Set first pizza 
        order.setPizza2(pizza2); // Set second pizza 
        double total = order.calcTotal(); // Should be 18+20 = 38 
        System.out.println(total);
    }
}