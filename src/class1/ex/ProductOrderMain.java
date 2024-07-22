package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        int sum = 0;
        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;

        ProductOrder kim = new ProductOrder();
        kim.productName = "김치";
        kim.price = 5000;
        kim.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;
        ProductOrder[] products = new ProductOrder[]{tofu,kim,cola};

        for (ProductOrder product : products) {
            System.out.println("상품명 :" + product.productName + " 가격:" + product.price + " 수량:" + product.quantity);
            sum += product.price * product.quantity;
        }
        System.out.println("총 결제 금액: " + sum);

    }
}
