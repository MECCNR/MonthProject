import org.junit.Test;
import ru.netology.stats.StatsService;

// этот класс был создан для отладки сервисного класса
public class Main {

    @Test
    public void Testing() {
        StatsService service = new StatsService();

        int[] months = {1, 2, 3, 4, 5, 6};
        int sum = service.sumSales(months);
        int avg = service.averageSales(months);
        int peak = service.peakSales(months);
        int minSales = service.minSales(months);
        int lowAvg = service.lowerAvg(months);
        int highAvg = service.higherAvg(months);
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(peak);
        System.out.println(minSales);
        System.out.println(lowAvg);
        System.out.println(highAvg);
    }
}