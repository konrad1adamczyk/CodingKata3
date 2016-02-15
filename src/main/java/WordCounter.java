/**
 * Created by KAdamczyk on 2016-02-15.
 */
public class WordCounter {

    private int counter;

    public void register(String newRegisteredString) {
        counter++;
    }

    public int getCount(String newRegisteredString) {
        return counter;
    }
}
