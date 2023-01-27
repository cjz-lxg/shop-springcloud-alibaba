package io.binghe.shop.order.fegin;

import io.binghe.shop.bean.User;
import io.binghe.shop.order.fegin.fallback.UserServiceFallBack;
import io.binghe.shop.order.fegin.fallback.factory.UserServiceFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "server-user", fallbackFactory = UserServiceFallBackFactory.class)
public interface UserService {
    @GetMapping(value = "/user/get/{uid}")
    User getUser(@PathVariable Long uid);
}
