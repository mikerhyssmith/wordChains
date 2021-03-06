import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Alec.Tunbridge' at '31/03/16 16:08' with Gradle 1.10
 *
 * @author Alec.Tunbridge, @date 31/03/16 16:08
 */
public class WordChainsTest {

    private WordChains wordChains;
    @Before
    public void setup() {
        wordChains = new WordChains();
    }
    @Ignore
    @Test public void readFile() throws IOException, URISyntaxException {
        WordChains classUnderTest = new WordChains();
        assertThat(classUnderTest.readFile()).isTrue();
    }

    @Test
    public void shouldReturnCorrectWordListForCatDog() {
        String wordArray[] = new String[]{"cat,cog,dog,cot"};
        List<String> dictionary = Arrays.asList(wordArray);
        List<String> wordChain = wordChains.getWordChain(dictionary,"cat","dog");

        assertThat(wordChain).containsExactly("cat","cot", "cog", "dog");
    }

    @Test
    public void shouldReturnTrueIfWordIsSingleDifferenceAway(){
        String wordOne = "cat";
        String wordTwo = "cot";

        assertThat(wordChains.isWordSingleDifference(wordOne,wordTwo)).isTrue();
    }

    @Test
    public void shouldReturnCorrectListOfWordsOneLetterAway() {
        

    }
}
