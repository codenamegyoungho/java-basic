package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;
    private int sum;

    public void addItem(Item item) {
        if (itemCount < 10) {
            items[itemCount] = item;
            itemCount += 1 ;
        } else {
            System.out.println("더이상 추가할 수 없습니다.");
            return;
        }
    }
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            if (item == null) {
                break;
            }
            sum += item.getTotalPrice();
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
