import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameTest {

    private String word;

    private Name name = new Name();

    @Test
    void removeSpaceHasNoSpace(){
        word = "a a";

        String removedSpace = name.removeSpace(word);

        assertEquals("aa", removedSpace);
    }

    @Test
    void intFromCharAisOne(){
        word = "a";

        int result = name.intFromChar(word.charAt(0));

        assertEquals(1, result);
    }


    @Test
    void moduloFromMichalMotykaIsOne() {
        word = "Michal Motyka";

        int result = name.moduloFromName(word);

        assertEquals(1, result);
    }

    @Test
    void moduloFromJanUlIsZero() {
        word = "Jan Ul";

        int result = name.moduloFromName(word);

        assertEquals(0, result);
    }

    @Test
    void moduloFromKatarzynaKmiecIsZero() {
        word = "Katarzyna Kmiec";

        int result = name.moduloFromName(word);

        assertEquals(0, result);
    }
}
