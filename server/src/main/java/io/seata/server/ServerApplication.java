/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.server;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author spilledyear@outlook.com
 *
 * seata-common模块：seata-common项目，提供Seata封装的工具类，异常类等。
 * seata-core模式：seata-core项目，提供Seata封装的RPC，数据模型，通信消息格式等。
 * seata-config模块：从配置中心读取配置。
 * seata-discovery模块：用于Seata TC注册到注册中心。用于Seata TM从注册中心发现SeataTC。
 * seata-rm模块：seata-rm项目，Seata对RM的核心实现。
 * seata-rm-datasource模块：seata-rm-datasource项目，Seata通过对JDBC扩展，从而实现对MYSQL等的透明接入Seata RM的实现。
 * seata-server模块：seata-server项目，Seata对TC的核心实现，提供了事务协调，锁，事务状态，事务会话等功能，启动入口
 * seata-tm模块：seata-tm项目，Seata对TM的实现，提供了全局事务管理，例如事务的发起，提交，回滚等。
 * seata-tcc模块：seata-tcc项目，Seata对TCC事务模式的实现。
 * seata-spring模块：seata-spring项目，Spring对Seata集成的实现。例如使用@GlobalTransactional注解，自动创建全局事务，就是通过seata-spring项目来实现的。
 *
 */
@SpringBootApplication(scanBasePackages = {"io.seata"})
public class ServerApplication {
    public static void main(String[] args) throws IOException {
        // run the spring-boot application
        SpringApplication.run(ServerApplication.class, args);
    }
}
