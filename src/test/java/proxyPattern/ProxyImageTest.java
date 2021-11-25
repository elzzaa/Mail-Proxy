package proxyPattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage proxyImage;

    @BeforeEach
    void setUp() {
        proxyImage = new ProxyImage("picture.png");
    }

    @Test
    void display() {
        proxyImage.display();
        assertNotNull(proxyImage.getRealImage());
    }
}

