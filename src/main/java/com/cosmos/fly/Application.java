package com.cosmos.fly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cosmos.fly.web.config.interceptor.CheckAuthInterceptor;

/**
 * Created by dingdongsheng on 16/3/24.
 * This file is to declare the main method, along with the basic @Configuration
 */
// We recommend that your primary source is a @Configuration class. Spring boot favors Java-based configuration.
// In additional, you can use @Import to import additional configuration classes.
// If you have to use XML based configuration files, you can use @ImportResource to load XML.
@Configuration

// Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies that you have added.
// For example, If HSQLDB is on your classpath, and you have not manually configured any database connection beans, then we will auto-configure an in-memory database.
// You need to opt-in to auto-configuration by adding the @EnableAutoConfiguration or @SpringBootApplication annotations to one of your @Configuration classes.
// You should only ever add one @EnableAutoConfiguration annotation. We generally recommend that you add it to your primary @Configuration class.
@EnableAutoConfiguration
// @ComponentScan is used to automatically pick up all Spring components including @Configuration classes.
// If you structure your code as suggested above (locating your application class in a root package), you can add @ComponentScan without any arguments.
// All of your application components (@Component, @Service, @Repository, @Controller etc.) will be automatically registered as Spring Beans.
@ComponentScan

//// @SpringBootApplication is same as @Configuration, @EnableAutoConfiguration and @ComponentScan。
//// @SpringBootApplication also provides aliases to customize the attributes of @EnableAutoConfiguration and @ComponentScan.


// If you find that specific auto-configure classes are being applied that you don’t want, you can use the exclude attribute of @EnableAutoConfiguration to disable them.
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class Application{
    public static void main(String[] args) {

        // Disable the restart support.
        System.setProperty("spring.devtools.restart.enabled", "false");

        // 第一个参数通常是@Configuration定义的类，当然也可以指向XML
        // 完整的配置：http://docs.spring.io/spring-boot/docs/1.4.0.BUILD-SNAPSHOT/api/org/springframework/boot/SpringApplication.html
        SpringApplication.run(Application.class, args);
    }
}

/**
 *
 * If you use the Spring Boot Maven or Gradle plugins to create an executable jar you can run your application using java -jar. For example:
 * $ java -jar target/myproject-0.0.1-SNAPSHOT.jar
 * It is also possible to run a packaged application with remote debugging support enabled. This allows you to attach a debugger to your packaged application:
 * $ java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n -jar target/myproject-0.0.1-SNAPSHOT.jar
 *
 * $ export MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=128M -Djava.security.egd=file:/dev/./urandom
 */
