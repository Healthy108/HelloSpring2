package edu.poly.hello.database;

import edu.poly.hello.models.Product;
import edu.poly.hello.responsitories.ProductResponsitory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Product.class);
    @Bean
    CommandLineRunner initDatabase(ProductResponsitory productResponsitory) {

        return  new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("Lenovo Ryzen 7", 2021, 25000.0, "");
                Product productB = new Product("Lenovo Ryzen 999", 2022, 35000.0, "");
                logger.info("Insert data: " + productResponsitory.save(productA));
                logger.info("Insert data: " + productResponsitory.save(productB));
            }
        };
    }
}
