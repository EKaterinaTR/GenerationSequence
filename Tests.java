import org.junit.Assert;
import org.junit.Test;

public class Tests {
    String [] strings = {"1","11","21","1211","111221","312211"};

    @Test
    public void CorrectGenerate6Members () {
        SequenceGenerator sg = new SequenceGenerator();
        String [] strings1 = sg.getSequence();

        for (int i = 0; i < strings1.length; i++) {
            Assert.assertEquals(true,strings1[i].equals(strings[i]));
        }

    }
}
