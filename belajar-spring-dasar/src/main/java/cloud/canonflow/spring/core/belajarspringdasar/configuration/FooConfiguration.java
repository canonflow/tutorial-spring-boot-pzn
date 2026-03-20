package cloud.canonflow.spring.core.belajarspringdasar.configuration;

import cloud.canonflow.spring.core.belajarspringdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }
}
