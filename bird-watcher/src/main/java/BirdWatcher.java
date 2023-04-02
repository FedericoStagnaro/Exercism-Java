import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int lastIndex = this.birdsPerDay.length - 1;
        return this.getLastWeek()[lastIndex];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.getLastWeek().length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(this.getLastWeek()).anyMatch(value -> value == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] copy = Arrays.copyOfRange(this.getLastWeek(), 0 , numberOfDays  );
        return Arrays.stream(copy).sum();
    }

    public int getBusyDays() {
        int countBussyDays = 0;
        for (int birdsPerDay : this.getLastWeek()) {
            if (birdsPerDay >= 5) countBussyDays++;
        }
        return countBussyDays;
    }
}
