package nl.tudelft.jpacman.level;
import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.points.PointCalculatorLoader;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;
public class LevelFactoryTester
{
    private PointCalculator testCalc;
    private static final PacManSprites testSprite = new PacManSprites();
    private GhostFactory testFactor = new GhostFactory(testSprite);
    private LevelFactory testLevelFactory = new LevelFactory(testSprite,testFactor,testCalc);

    @Test
    void testCreateGhost()
    {
        assertThat(testLevelFactory.createGhost()).isNotNull();
    }

}
