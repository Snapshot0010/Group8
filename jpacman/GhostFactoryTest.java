package nl.tudelft.jpacman.npc.ghost;

import static org.assertj.core.api.Assertions.assertThat;


import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;
public class GhostFactoryTest
{
    private static final PacManSprites testSprite = new PacManSprites();
    private GhostFactory testFactor = new GhostFactory(testSprite);

    @Test
    void testCreateInky()
    {
        assertThat(testFactor.createClyde()).isNotNull();
    }
}
