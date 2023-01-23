package io.binghe.shop.order.service;

import io.binghe.shop.params.OrderParams;

public interface OrderService {

    /**
     * 保存订单
     */
    void saveOrder(OrderParams orderParams);

}
