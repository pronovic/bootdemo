package pronovici.bootdemo;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "dummy")
public class DummyConfig {
    private String url;
    private String token;
}
