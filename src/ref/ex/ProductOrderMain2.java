package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("김치", 1000, 10);
        ProductOrder order2 = createOrder("두부", 1500, 15);
        ProductOrder order3 = createOrder("콜라", 2000, 5);
        ProductOrder[] orders = new ProductOrder[]{order1,order2,order3};
        printOrders(orders);
        int totalSum = getTotalAmount(orders);
        System.out.println(totalSum);
    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders (ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName + ":" + order.price + ":" + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }

}
