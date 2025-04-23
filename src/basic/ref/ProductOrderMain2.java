package basic.ref;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 주문 수량 입력
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int totalOrderCount = scanner.nextInt();
        scanner.nextLine();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[totalOrderCount];

        for (int i = 0; i < totalOrderCount; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String name = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            orders[i] = createOrder(name, price, quantity);
        }

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
//        orders[0] = createOrder("두부", 2000, 2);
//        orders[1] = createOrder("김치", 5000, 1);
//        orders[2] = createOrder("콜라", 1500, 2);

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int sum = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + sum);
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격:" + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }

        return sum;
    }
}
