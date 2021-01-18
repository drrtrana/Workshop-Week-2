import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestingImaginaryNumber {
    @Test
    void testingIsIdentical() {
        ImaginaryNumber in1 = new ImaginaryNumber(5, 6);
        ImaginaryNumber in2 = new ImaginaryNumber(8, 6);
        ImaginaryNumber in3 = new ImaginaryNumber(5, 6);
        assertEquals(false, in1.isIdentical(in2));
        assertEquals(false, in2.isIdentical(in3));
        assertEquals(true, in1.isIdentical(in3));
    }
}
