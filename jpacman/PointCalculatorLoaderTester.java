package nl.tudelft.jpacman.points;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
public class PointCalculatorLoaderTester
{
    PointCalculatorLoader loadTester = new PointCalculatorLoader();

    @Test
    void testLoad()
    {
        assertThat(loadTester.load()).isNotNull();
    }


}
