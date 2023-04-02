class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    int speed;
    int batteryDrain;

    int battery = 100;
    int distanceDriven;

    public NeedForSpeed(int speed, int batteryDrain ) {
        this.batteryDrain = batteryDrain;
        this.speed = speed;
    }

    public boolean batteryDrained() {
        return battery == 0;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (battery - batteryDrain >= 0) {
            this.distanceDriven += this.speed;
            this.battery -= batteryDrain;
        }

    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    int distance;
    public RaceTrack (int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {

        for (int i = 0; i < distance; i++) {

        }
        return false;
    }
}
