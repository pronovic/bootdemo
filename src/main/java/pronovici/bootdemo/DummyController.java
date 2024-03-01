package pronovici.bootdemo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Getter
@RequiredArgsConstructor
@RequestMapping("/dummy")
public class DummyController {

    private final DummyConfig config;

    @GetMapping(value = "/config", produces = MediaType.TEXT_PLAIN_VALUE)
    public String retrieveConfig() {
        return config.getUrl() + " :: " + config.getToken();
    }
}

