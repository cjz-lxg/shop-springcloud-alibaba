package io.binghe.shop.order.fegin.fallback.factory;


import feign.hystrix.FallbackFactory;
import io.binghe.shop.bean.User;
import io.binghe.shop.order.fegin.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallBackFactory implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User getUser(Long uid) {
                User user = new User();
                user.setId(-1L);
                return user;
            }
        };
    }
}
