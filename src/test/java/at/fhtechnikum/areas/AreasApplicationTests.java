package at.fhtechnikum.areas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AreasApplicationTests {

    @Test
    void calcArea() {
        //arrange
        areas test = new areas();
        //act
        test.setArea("Rechteck", 3, 4.5);
        //assert
        Assertions.assertEquals(test.);
    }

}
