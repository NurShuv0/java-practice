public class FoodPandaOrder {
    public void orderFood(String food1, int quantity1) {
        System.out.println("Ordering:");
        System.out.println(quantity1 + " " + food1);
    }
    public void orderFood(String food1, int quantity1, String food2, int quantity2) {
        System.out.println("Ordering:");
        System.out.println(quantity1 + " " + food1);
        System.out.println(quantity2 + " " + food2);
    }
    public void orderFood(String food1, int quantity1, String food2, int quantity2, String food3, int quantity3) {
        System.out.println("Ordering:");
        System.out.println(quantity1 + " " + food1);
        System.out.println(quantity2 + " " + food2);
        System.out.println(quantity3 + " " + food3);
    }
    public void orderFood(String food1, int quantity1, String food2, int quantity2, String food3, int quantity3, String food4, int quantity4) {
        System.out.println("Ordering:");
        System.out.println(quantity1 + " " + food1);
        System.out.println(quantity2 + " " + food2);
        System.out.println(quantity3 + " " + food3);
        System.out.println(quantity4 + " " + food4);
    }
    public static void main(String[] args) {
        FoodPandaOrder order = new FoodPandaOrder();
        order.orderFood("Burger", 2);
        System.out.println("---");
        order.orderFood("Pizza", 1, "Fries", 3);
        System.out.println("---");
        order.orderFood("Chicken Curry", 2, "Rice", 2, "Salad", 1);
        System.out.println("---");
        order.orderFood("Pasta", 1, "Garlic Bread", 2, "Soup", 1, "Dessert", 1);
    }
}