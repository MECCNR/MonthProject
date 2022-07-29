import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class AutoTests {

    @Test
    public void sumTest() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.sumSales(months);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgTest() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.averageSales(months);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void peakTest() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.peakSales(months);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minTest() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.minSales(months);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowTest() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.lowerAvg(months);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highTest() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.higherAvg(months);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
