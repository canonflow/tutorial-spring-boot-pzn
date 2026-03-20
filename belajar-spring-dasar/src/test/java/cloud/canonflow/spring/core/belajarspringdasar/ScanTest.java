package cloud.canonflow.spring.core.belajarspringdasar;

import cloud.canonflow.spring.core.belajarspringdasar.data.Bar;
import cloud.canonflow.spring.core.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void tearUp() {
        context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testScan() {
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
    }
}
