package io.binghe.shop.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.binghe.shop.bean.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper extends BaseMapper<Product> {

    int updateProductStockById(@Param("count") Integer count, @Param("id") Long id);

}
