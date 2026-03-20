package cloud.canonflow.spring.core.belajarspringdasar;

import cloud.canonflow.spring.core.belajarspringdasar.repository.ProductRepository;
import cloud.canonflow.spring.core.belajarspringdasar.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void tearUp() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }
    @Test
    void testComponentScan() {
        ProductService productService1 = context.getBean(ProductService.class);
        ProductService productService2 = context.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection() {
        ProductService productService = context.getBean(ProductService.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);

        Assertions.assertSame(productService.getProductRepository(), productRepository);
    }
}
