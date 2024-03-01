package pronovici.bootdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = { "smartthings.url=my-fancy-url", "smartthings.pat=the-token" })
public class SmartThingsConfigTest {

    @Autowired
    private SmartThingsConfig config;

    @Test
    public void testWiring() {
        assertEquals("my-fancy-url", config.getUrl());
        assertEquals("the-token", config.getPat());
    }

}
