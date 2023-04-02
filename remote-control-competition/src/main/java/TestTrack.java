import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> rank = new ArrayList<ProductionRemoteControlCar>();
        rank.add(prc1);
        rank.add(prc2);
        rank.sort((car1,car2) -> car1.compareTo(car2));
        return rank;
    }
}
