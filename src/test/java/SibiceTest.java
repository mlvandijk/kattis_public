import org.junit.Assert;
import org.junit.Test;

public class SibiceTest {

    @Test
    public void match_1__width_1_returns_DA(){
        Sibice sibice = new Sibice(0,1);
        Assert.assertEquals(sibice.matchFits(1), "DA");
    }

    @Test
    public void match_1__height_2_returns_DA(){
        Sibice sibice = new Sibice(2,0);
        Assert.assertEquals(sibice.matchFits(1), "DA");
    }

    @Test
    public void match_5__height_3_width_4_returns_DA(){
        Sibice sibice = new Sibice(3, 4);
        Assert.assertEquals(sibice.matchFits(5), "DA");
    }

    @Test
    public void match_6__height_3_width_4_returns_NE(){
        Sibice sibice = new Sibice(3, 4);
        Assert.assertEquals(sibice.matchFits(6), "NE");
    }

    @Test
    public void match_21__height_12_width_17_returns_NE(){
        Sibice sibice = new Sibice(12,17);
        Assert.assertEquals(sibice.matchFits(21), "NE");
    }

    @Test
    public void match_20__height_12_width_17_returns_DA(){
        Sibice sibice = new Sibice(12,17);
        Assert.assertEquals(sibice.matchFits(20), "DA");
    }
}