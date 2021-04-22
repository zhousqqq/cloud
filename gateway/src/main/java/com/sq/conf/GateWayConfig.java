package com.sq.conf;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZonedDateTime;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/21 下午2:57
 */

@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes ();

        routes.route ("path_route_sq",
                r -> r.path ("/guonei")
                        .uri ("http://news.baidu.com/guonei")).build ();

        return routes.build ();
    }

    public static void main (String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now ();
        System.out.println (zbj);
    }

}
