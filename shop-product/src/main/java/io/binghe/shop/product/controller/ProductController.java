package io.binghe.shop.product.controller;


import com.alibaba.fastjson.JSONObject;
import io.binghe.shop.bean.Product;
import io.binghe.shop.product.service.ProductService;
import io.binghe.shop.utils.constants.HttpCode;
import io.binghe.shop.utils.resp.Result;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    Logger log = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/get/{pid}")
    public Product getProduct(@PathVariable("pid") Long pid) {
        Product product = productService.getProductById(pid);
        log.info("获取到的商品信息为：{}", JSONObject.toJSONString(product));
        return product;
    }

    @GetMapping("/update_count/{pid}/{count}")
    public Result<Integer> updateCount(@PathVariable("pid") Long pid, @PathVariable("count") Integer count) {
        log.info("更新商品库存传递的参数为: 商品id:{}, 购买数量:{}", pid, count);
        int updateCount = productService.updateProductStockById(count, pid);
        return new Result<>(HttpCode.SUCCESS, "执行成功", updateCount);
    }
}












