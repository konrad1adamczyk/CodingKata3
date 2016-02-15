import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by KAdamczyk on 2016-02-15.
 */
public class TestWrodCounter {

    @Test
    public void testRegistrationOfNewWord(){
        String newRegisteredString = "one";
        WordCounter wordCounter = new WordCounter();
        wordCounter.register(newRegisteredString);
        wordCounter.register(newRegisteredString);
        assertEquals(2,wordCounter.getCount(newRegisteredString));
    }

    @Test
    public void testRegistrationOfNull() throws Exception {
        WordCounter wordCounter = new WordCounter();
        assertEquals(0,wordCounter.getCount(""));

    }

    @Test
    public void testName() throws Exception {

        String tmp = new String();

        System.out.println(tmp);
    }
}
