package cloud.canonflow.spring.core.belajarspringdasar.service;

import cloud.canonflow.spring.core.belajarspringdasar.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Autowired // Constructor ini akan digunakan sbg dependency injection oleh Spring (karena terdapat > 1 constructor)
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
