public class ElonsToyCar {
    int drivenMeters;
    int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + drivenMeters + " meters";
    }

    public String batteryDisplay() {
        return battery > 0 ? "Battery at " + battery + "%" : "Battery empty";
    }

    public void drive() {
        if (battery > 0){
            drivenMeters= drivenMeters + 20;
            battery = battery - 1;
        }
    }
}
