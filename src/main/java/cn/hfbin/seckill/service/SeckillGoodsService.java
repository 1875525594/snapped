package cn.hfbin.seckill.service;

import cn.hfbin.seckill.bo.GoodsBo;

import java.util.List;


public interface SeckillGoodsService {

    List<GoodsBo> getSeckillGoodsList();

    GoodsBo getseckillGoodsBoByGoodsId(long goodsId);

    int reduceStock(long goodsId);
}
