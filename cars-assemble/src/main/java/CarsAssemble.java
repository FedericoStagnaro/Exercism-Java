public class CarsAssemble {


    public double productionRatePerHour(int speed) {
        double result;
        if (speed > 0 && speed <= 4) {
            result = 221 * speed;
        } else if (speed >=5 && speed <=8) {
            result = (221 * 0.9) * speed;
        } else if (speed == 9) {
            result = (221 * 0.8) * speed;
        } else {
            result = (221 * 0.77) * speed;
        }
        return result;
    }

    public int workingItemsPerMinute(int speed) {
        double perHour = productionRatePerHour(speed) / 60;
        int perMinute = (int) perHour;
        return perMinute;
    }
}
