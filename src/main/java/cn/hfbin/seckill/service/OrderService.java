package cn.hfbin.seckill.service;

import cn.hfbin.seckill.entity.OrderInfo;


public interface OrderService {

    long addOrder(OrderInfo orderInfo);

    OrderInfo getOrderInfo(long rderId);
}
