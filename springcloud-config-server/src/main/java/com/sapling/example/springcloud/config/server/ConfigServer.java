package com.sapling.example.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * config server:模拟不同类型的配置中心：
 * <li>
 *     git:使用git作为配置仓库。
 *     启动时，使用--spring.active.profiles=git作为启动参数，可以使用application.properties中的git作为配置仓库
 * </li>
 * <li>
 *      native:使用本地的文件路径作为配置仓库。
 *      启动时，使用--spring.active.profiles=native作为启动参数
 *      可以使用application.properties中的本地文件路径作为配置仓库，此时也可以使用网络共享存储作为配置仓库
 * </li>
 * @author wei.zhou
 * @date 2019/7/9
 * @since 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
}
