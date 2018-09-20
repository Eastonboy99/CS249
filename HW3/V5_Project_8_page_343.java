class V5_Project_8_page_343 {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza(Pizza.Size.LG, 1, 0, 1); // Code to create a large pizza, 1 cheese, 1 ham

        Pizza pizza2 = new Pizza(Pizza.Size.MD, 2, 2, 0);// Code to create a medium pizza, 2 cheese, // 2 pepperoni

        PizzaOrder order1 = new PizzaOrder();// Code to create an order

        order1.setNumPizzas(2); // 2 pizzas in the order
        order1.setPizza1(pizza1); // Set first pizza

        order1.setPizza2(pizza2); // Set second pizza

        double total = order1.calcTotal(); // Should be 18+20 = 38
        System.out.println("Total for Order1: "+ total);
        PizzaOrder order2 = new PizzaOrder(order1); // Use copy // constructor

        order2.getPizza1().setCheeseToppings(3); // Change toppings

        double total2 = order2.calcTotal(); // Should be 22 + 20 = 42
        double origTotal = order1.calcTotal(); // Should still be 38

        System.out.println("Total for Order2: "+ total2);
        System.out.println("Total for Order1: "+ origTotal);



    }
}