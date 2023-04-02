class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar> {
    int drivenDistance;
    int victories;

    public void drive() {
        drivenDistance += 10;
    }

    public int getDistanceTravelled() {
        return drivenDistance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public int compareTo (ProductionRemoteControlCar car) {
        if (this.getNumberOfVictories() == car.getNumberOfVictories()) return 0;
        return this.getNumberOfVictories() > car.getNumberOfVictories() ? 1 : -1;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }
}
