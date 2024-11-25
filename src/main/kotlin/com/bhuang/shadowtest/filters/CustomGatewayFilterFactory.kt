package com.bhuang.shadowtest.filters

import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

/**
 * https://www.baeldung.com/spring-cloud-custom-gateway-filters
 */
@Component
class CustomGatewayFilterFactory : AbstractGatewayFilterFactory<CustomGatewayFilterFactory.Config>(Config::class.java) {

    init {
        // 初始化时需要声明配置类（如果有额外参数，可在 Config 类中定义）
    }

    override fun apply(config: Config): GatewayFilter {
        return GatewayFilter { exchange, chain ->
            println("com.bhuang.shadowtest.filters.CustomGatewayFilterFactory: Pre-Filter executed")
            chain.filter(exchange).then(Mono.fromRunnable {
                println("com.bhuang.shadowtest.filters.CustomGatewayFilterFactory: Post-Filter executed")
            })
        }
    }

    class Config {
        // 可选配置类，用于接收过滤器参数
        var someParam: String = "defaultValue"
    }
}
