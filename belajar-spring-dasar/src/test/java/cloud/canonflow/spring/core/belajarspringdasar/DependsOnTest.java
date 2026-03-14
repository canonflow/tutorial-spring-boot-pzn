package cloud.canonflow.spring.core.belajarspringdasar;

import cloud.canonflow.spring.core.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {
        context.getBean(Foo.class);
    }
}
