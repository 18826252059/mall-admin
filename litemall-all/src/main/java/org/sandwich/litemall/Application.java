package org.sandwich.litemall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {
        "org.sandwich.litemall",
        "org.sandwich.litemall.core",
        "org.sandwich.litemall.db",
        "org.sandwich.litemall.wx",
        "org.sandwich.litemall.admin"})
@MapperScan("org.sandwich.litemall.db.dao")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        String test = "mark";
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}