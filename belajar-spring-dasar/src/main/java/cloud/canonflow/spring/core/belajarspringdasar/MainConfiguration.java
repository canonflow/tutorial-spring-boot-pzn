package cloud.canonflow.spring.core.belajarspringdasar;

import cloud.canonflow.spring.core.belajarspringdasar.configuration.BarConfiguration;
import cloud.canonflow.spring.core.belajarspringdasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
