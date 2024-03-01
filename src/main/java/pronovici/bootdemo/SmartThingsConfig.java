package pronovici.bootdemo;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "smartthings")
public class SmartThingsConfig {
    private String url;
    private String pat;
}
