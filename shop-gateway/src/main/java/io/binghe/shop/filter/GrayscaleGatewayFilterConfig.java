package io.binghe.shop.filter;

import lombok.Data;

import java.io.Serializable;

/**
 * @author binghe
 * @version 1.0.0
 * @description 接收配置参数
 */
@Data
public class GrayscaleGatewayFilterConfig implements Serializable {
    private static final long serialVersionUID = 983019309000445082L;
    private boolean grayscale;
}

