package cloud.canonflow.spring.core.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "cloud.canonflow.spring.core.belajarspringdasar.configuration"
})
public class ScanConfiguration {
}
