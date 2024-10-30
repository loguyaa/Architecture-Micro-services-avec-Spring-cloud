package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> productRepository.saveAll(
                List.of(
                        Product.builder().name("7assoub").quantity(200).price(1200).build(),
                        Product.builder().name("3dam").quantity(20).price(400).build(),
                        Product.builder().name("manga").quantity(1200).price(800).build()
                )
        );
    }
}
