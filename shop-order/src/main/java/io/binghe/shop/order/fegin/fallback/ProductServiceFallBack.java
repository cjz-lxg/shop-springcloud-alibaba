package io.binghe.shop.order.fegin.fallback;

import io.binghe.shop.bean.Product;
import io.binghe.shop.order.fegin.ProductService;
import io.binghe.shop.utils.resp.Result;
import org.springframework.stereotype.Component;

/**
 * @author binghe (公众号：冰河技术)
 * @version 1.0.0
 * @description 商品微服务的容错类
 */
//@Component
public class ProductServiceFallBack implements ProductService {
    @Override
    public Product getProduct(Long pid) {
        Product product = new Product();
        product.setId(-1L);
        return product;
    }

    @Override
    public Result<Integer> updateCount(Long pid, Integer count) {
        Result<Integer> result = new Result<>();
        result.setCode(1001);
        result.setCodeMsg("触发了容错逻辑");
        return result;
    }
}
