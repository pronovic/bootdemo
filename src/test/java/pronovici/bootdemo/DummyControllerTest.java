package pronovici.bootdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DummyControllerTest {

    private DummyController controller;

    @BeforeEach
    void init(@Mock SmartThingsConfig config) {
        controller = new DummyController(config);
    }

    @Test
    public void testConfig() {
        when(controller.getConfig().getUrl()).thenReturn("the-url");
        when(controller.getConfig().getPat()).thenReturn("the-pat");
        assertEquals("the-url :: the-pat", controller.retrieveConfig());
    }

}
