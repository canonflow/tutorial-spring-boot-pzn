package cloud.canonflow.spring.core.belajarspringdasar;

import cloud.canonflow.spring.core.belajarspringdasar.data.Bar;
import cloud.canonflow.spring.core.belajarspringdasar.data.Foo;
import cloud.canonflow.spring.core.belajarspringdasar.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
