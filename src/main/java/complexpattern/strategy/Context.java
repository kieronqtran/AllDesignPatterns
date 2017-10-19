package complexpattern.strategy;

/**
 * Created by CoT on 10/16/17.
 */
public class Context {
    OrderService orderService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderService getOrderService() {
        return orderService;
    }
}
