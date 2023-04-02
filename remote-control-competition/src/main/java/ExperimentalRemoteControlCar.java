public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int drivenDistance;

    public void drive() {
        drivenDistance += 20;
    }

    public int getDistanceTravelled() {
        return drivenDistance;
    }
}
