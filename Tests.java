import org.junit.Assert;
import org.junit.Test;

public class Tests {
    String[] strings = {"1", "11", "21", "1211", "111221", "312211"};
    SequenceGenerator sg = new SequenceGenerator();
    String[] strings1 = sg.getSequence();

    @Test
    public void CorrectGenerate1Member () {
        Assert.assertEquals(true, strings1[0].equals(strings[0]));
    }

    @Test
    public void CorrectGenerate2Member () {
        Assert.assertEquals(true, strings1[1].equals(strings[1]));
    }
    @Test
    public void CorrectGenerate3Member () {
        Assert.assertEquals(true, strings1[2].equals(strings[2]));
    }

    @Test
    public void CorrectGenerate4Member () {
        Assert.assertEquals(true, strings1[3].equals(strings[3]));
    }

    @Test
    public void CorrectGenerate5Member () {
        Assert.assertEquals(true, strings1[4].equals(strings[4]));
    }

    @Test
    public void CorrectGenerate6Member () {
        Assert.assertEquals(true, strings1[5].equals(strings[5]));
    }


}
