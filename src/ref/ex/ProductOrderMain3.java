package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요:");
        int count = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[count];
        scanner.nextLine(); // 보조도구 띄움 방지;
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + "번째 주문정보를 입력하세요:");
            System.out.print("상품명:");
            String productName = scanner.nextLine();
            System.out.print("가격:");
            int price = scanner.nextInt();
            System.out.print("수량:");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = createOrder(productName,price,quantity);

        }
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
