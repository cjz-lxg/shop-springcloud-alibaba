package io.binghe.shop.params;

import lombok.Data;

/**
 * @author binghe
 * @version 1.0.0
 * @description 订单参数
 */
@Data
public class OrderParams {

    /*public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }*/

    /**
     * 商品id
     */
    private Long productId;
    
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 购买的商品数量
     */
    private Integer count;

    public boolean isEmpty(){
        return (productId == null || productId <= 0) ||
                (userId == null || productId <= 0) ||
                (count == null || count <= 0);
    }
}
